package project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Project_Activity1 {
	
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
	    DesiredCapabilities dCap = new DesiredCapabilities();
	    dCap.setCapability("deviceName", "Pixel4Emulator");
	    dCap.setCapability("platformName", "android");
	    dCap.setCapability("automationName", "UiAutomator2");
	    dCap.setCapability("ensureWebviewsHavePages", true);
	    dCap.setCapability("appPackage", "com.google.android.apps.tasks");
	    dCap.setCapability("appActivity", ".ui.TaskListsActivity");
	    dCap.setCapability("noReset", true);
	    

	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

	    driver = new AndroidDriver<MobileElement>(remoteUrl, dCap);
	    wait = new WebDriverWait(driver, 20);
	  }

  @Test
  public void GoogleTasks() {
	  
	  System.out.println("Welcome to Google Tasks");
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  String[] taskslist = {"Complete Activity with Google Tasks",
			  				"Complete Activity with Google Keep",
			  				"Complete the second Activity Google Keep"};
			  
	  
	  for(String tasks:taskslist)
	  {
	  
	  driver.findElementByAccessibilityId("Create new task").click();	  
	  driver.findElementById("add_task_title").sendKeys(tasks);
	  driver.findElementById("add_task_done").click();
	  
	  } 
	  
	  List<MobileElement> tasks = driver.findElementsByXPath("//android.view.View[@content-desc=\"Mark as complete\"]");
	  System.out.println(tasks.size());
	  
	  Assert.assertEquals(tasks.size(),2);
	  
	  
  }
  
  @AfterClass
  public void teardown() {
	  
	  driver.quit();
	  
  }
}
