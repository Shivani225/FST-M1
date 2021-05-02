package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class JobBoard_Activity1 {
	
	WebDriver driver;												
	
  @Test
  public void VerifyTitleTest() {
	  
	  String title = driver.getTitle();								//Getting the title
	  System.out.println("Title of the page is: "+title);
	  Assert.assertEquals("Alchemy Jobs – Job Board Application", title);
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
