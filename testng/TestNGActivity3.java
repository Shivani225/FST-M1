package testNGactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGActivity3 {
	
	WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() {
		  
		  driver = new FirefoxDriver();
		  driver.get("https://www.training-support.net/selenium/login-form");
		  
	  }

	
  @Test
  public void testcase1() {
	  
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("password");
	  driver.findElement(By.xpath("//button[@class = 'ui button']")).click();
	  
	  String actmessage = driver.findElement(By.id("action-confirmation")).getText();
	  String expmessage = "Welcome Back, admin";
	  
	  Assert.assertEquals(expmessage, actmessage);
	  
	  
  }
 
  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
