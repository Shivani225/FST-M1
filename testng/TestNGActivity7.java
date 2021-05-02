package testNGactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGActivity7 {
	
	WebDriver driver;
	
	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		
		return new Object[][] {{"admin","password"}};
		
	}
	
  @Test (dataProvider = "Authentication")
  public void LoginTest(String uname, String pword) {
	  
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
