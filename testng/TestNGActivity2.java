package testNGactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGActivity2 {
	
	WebDriver driver;
	
  @Test
  public void testcase1() {
	  
	  String title = driver.getTitle();
      System.out.println("Title of the Page is: "+title);
	  Assert.assertEquals("Target Practice", title);
  }
  
  @Test
  public void testcase2() {
	  
	  WebElement blackbutton = driver.findElement(By.xpath("//button[@class ='ui black button']"));
	  Assert.assertTrue(blackbutton.isDisplayed());
	  Assert.assertEquals(blackbutton.getText(), "Orange");
  }
  
  @Test(enabled = false)
  public void testcase3() {
	  
	  WebElement blackbutton = driver.findElement(By.xpath("//button[@class ='ui black button']"));
	  Assert.assertTrue(blackbutton.isDisplayed());
  }
  
  @Test
  public void testcase4() {
	  
	  throw new SkipException("Skipping test case");    
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
