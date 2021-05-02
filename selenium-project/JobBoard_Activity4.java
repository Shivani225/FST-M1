package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class JobBoard_Activity4 {
	
	WebDriver driver;
	
  @Test
  public void VerifySecondHeaderTest() {
	  
	  String header2 =  driver.findElement(By.xpath("//h2")).getText();
	  System.out.println("Second Header of the page is: "+header2);
	  Assert.assertEquals("Quia quis non", header2);
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
