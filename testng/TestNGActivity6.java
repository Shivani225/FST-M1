package testNGactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGActivity6 {
	
	WebDriver driver;
	
  @Test
  @Parameters ({"username", "password"})
  public void logintest(String uname,String pword) {
	  
	  driver.findElement(By.id("username")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pword);
	  driver.findElement(By.xpath("//button[@class = 'ui button']")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
