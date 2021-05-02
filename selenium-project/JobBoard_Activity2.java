package seleniumproject;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class JobBoard_Activity2 {
	
	WebDriver driver;	
	
  @Test
  public void VerifyHeaderTest() {
	  
	 String header1 =  driver.findElement(By.xpath("//h1[@class = 'entry-title']")).getText();
	 System.out.println("Header of the page is: "+header1);
	 Assert.assertEquals("Welcome to Alchemy Jobs", header1);
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();									
	  driver.get("https://alchemy.hguy.co/jobs/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
