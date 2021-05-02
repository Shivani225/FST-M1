package testNGactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGActivity5 {
	
	WebDriver driver;
	
  @Test(groups = {"HeaderTests", "ButtonTests"})
  public void pagetitletest() {
	  
	  String title = driver.getTitle();
	  System.out.println("Title of the page is:" +title);
	  Assert.assertEquals("Target Practice", title);
  }
  
  @Test (dependsOnMethods = {"pagetitletest"}, groups = {"HeaderTests"})
  public void headertest1() {
	  
	  String thirdheader = driver.findElement(By.xpath("//h3")).getText();
	  System.out.println(thirdheader);
	  Assert.assertEquals("Third header", thirdheader);
	  
  }
  
  @Test (dependsOnMethods = {"pagetitletest"}, groups = {"HeaderTests"})
  public void headertest2() {
	  
	  String fifthheadercolor = driver.findElement(By.xpath("//h5")).getCssValue("color");
	  System.out.println(fifthheadercolor);
	  Assert.assertEquals("rgb(33, 186, 69)", fifthheadercolor);
	  
  }
  
  @Test (dependsOnMethods = {"pagetitletest"}, groups = {"ButtonTests"})
  public void buttontest1() {
	  
	  String olivebutton = driver.findElement(By.xpath("//button[@class ='ui olive button']")).getText();
      Assert.assertEquals("Olive", olivebutton);
	  
  }
  
  @Test (dependsOnMethods = {"pagetitletest"}, groups = {"ButtonTests"})
  public void buttontest2() {
	  
	  String B2 = driver.findElement(By.xpath("//button[@class ='ui brown button']")).getCssValue("color");
      Assert.assertEquals("rgb(255, 255, 255)", B2);
	  
  }
  
  
  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
  }

  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
