package testNGactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGActivity10 {
	
	WebDriver driver;
	Actions builder;
	
  @Test
  public void middlevaluetest() {
	  
	  WebElement slider = driver.findElement(By.id("slider"));
	  slider.click();
      String volLevel = driver.findElement(By.cssSelector("span#value")).getText();
      Reporter.log("Mid value: " + volLevel);
      Assert.assertEquals(volLevel, "50");
  }
  
  @Test
  public void maxvaluetest() {
	  
      WebElement slider = driver.findElement(By.id("slider"));
      builder.clickAndHold(slider).moveByOffset(80, 0).release().build().perform();
      String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
      Reporter.log("Max value: " + volumeLevel);	
      Assert.assertEquals(volumeLevel, "100");
  }
  
  @Test
  public void minvaluetest() {
	  
      WebElement slider = driver.findElement(By.id("slider"));
  	  builder.clickAndHold(slider).moveByOffset(-79, 0).release().build().perform();
      String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();	
      Reporter.log("Min value: " + volumeLevel);	
      Assert.assertEquals(volumeLevel, "0");
  }
  
  @Test
  public void thirtypervaluetest() {
	  
      WebElement slider = driver.findElement(By.id("slider"));
      builder.clickAndHold(slider).moveByOffset(-32, 0).release().build().perform();
	  String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
      Reporter.log("Min value: " + volumeLevel);
	 Assert.assertEquals(volumeLevel, "30");
	
  }
  
  
  @Test
  public void eightypervaluetest() {
	  
      WebElement slider = driver.findElement(By.id("slider"));
  	  builder.clickAndHold(slider).moveByOffset(48, 0).release().build().perform();
	  String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
      Reporter.log("Min value: " + volumeLevel);
	  Assert.assertEquals(volumeLevel, "80");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  builder = new Actions(driver);
	  driver.get("https://www.training-support.net/selenium/sliders");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
