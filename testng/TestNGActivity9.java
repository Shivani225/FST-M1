package testNGactivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGActivity9 {
	
	WebDriver driver;
	
	
  @Test
  public void simpleAlertTestCase() {
	  
      Reporter.log("simpleAlertTestCase() started |");
      driver.findElement(By.id("simple")).click();	
      Reporter.log("Simple Alert opened |");
      Alert simpleAlert = driver.switchTo().alert();
      Reporter.log("Switched foucs to alert |");
      String alertText1 = simpleAlert.getText();	
      Reporter.log("Alert text is: " + alertText1 + " |");
      Assert.assertEquals("This is a JavaScript Alert!", alertText1);
      simpleAlert.accept();	
      Reporter.log("Alert closed");
      Reporter.log("Test case ended |");
  }
  
  @Test
  public void confirmAlertTestCase() {
	  
	  Reporter.log("confirmAlertTestCase() started |");
      driver.findElement(By.id("confirm")).click();	
      Reporter.log("Confirm Alert opened |");
      Alert confirmAlert = driver.switchTo().alert();
      Reporter.log("Switched foucs to alert |");
      String alertText2 = confirmAlert.getText();	
      Reporter.log("Alert text is: " + alertText2 + " |");
      Assert.assertEquals("This is a JavaScript Confirmation!", alertText2);
      confirmAlert.accept();	
      Reporter.log("Alert closed");
      Reporter.log("Test case ended |");
  }
  
  @Test
  public void promptAlertTestCase() {
	  
	  Reporter.log("promptAlertTestCase() started |");
      driver.findElement(By.id("prompt")).click();	
      Reporter.log("Prompt Alert opened |");
      Alert promptAlert = driver.switchTo().alert();
      Reporter.log("Switched focus to alert |");
      String alertText3 = promptAlert.getText();	
      Reporter.log("Alert text is: " + alertText3 + " |");
      promptAlert.sendKeys("Welcome");
      Reporter.log("Text entered in Alert");
      Assert.assertEquals("This is a JavaScript Prompt!", alertText3);
      promptAlert.accept();	
      Reporter.log("Alert closed");
      Reporter.log("Test case ended |");
      
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  
	  Reporter.log("Starting Test");
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/javascript-alerts");
	  Reporter.log("Browser Opened");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  Reporter.log("Ending Test");
	  driver.close();
	  
  }

}
