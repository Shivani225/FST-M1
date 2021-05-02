package seleniumproject;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class JobBoard_Activity5 {
	
	WebDriver driver;
	
  @Test
  public void VerifyNavigatePageTest() {
	  
	  driver.findElement(By.xpath("//a[@href ='https://alchemy.hguy.co/jobs/jobs/']")).click();
	  String jobpagetitle = driver.getTitle();
	  System.out.println("Title of the Job Page is:" +jobpagetitle);
	  Assert.assertEquals("Jobs – Alchemy Jobs", jobpagetitle);
	  
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
