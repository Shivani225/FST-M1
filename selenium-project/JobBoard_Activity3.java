package seleniumproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class JobBoard_Activity3 {
	
	WebDriver driver;	
	
  @Test
  public void PrintHeaderurlTest() {
	  
	  String imageurl = driver.findElement(By.xpath("//img")).getAttribute("src");
	  System.out.println("Image URL is:" +imageurl);
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
