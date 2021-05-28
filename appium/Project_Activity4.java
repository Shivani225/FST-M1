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

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Project_Activity4 {
	
AndroidDriver<MobileElement> driver;
WebDriverWait wait;
	
	@BeforeClass
	public void setup() throws MalformedURLException {	
		    DesiredCapabilities dCap = new DesiredCapabilities();
		    dCap.setCapability("deviceName", "Pixel4Emulator");
		    dCap.setCapability("platformName", "android");
		    dCap.setCapability("automationName", "UiAutomator2");
		    dCap.setCapability("ensureWebviewsHavePages", true);
		    dCap.setCapability("appPackage", "com.android.chrome" );
		    dCap.setCapability("appActivity", "com.google.android.apps.chrome.Main" );
		    dCap.setCapability("noReset", true);

		    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

		    driver = new AndroidDriver<MobileElement>(remoteUrl, dCap);
		    wait = new WebDriverWait(driver,20);
		  }
	
	 @Test
	  public void BrowserTest() {
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.get("https://www.training-support.net/selenium");
		  
		  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(5)"));
		  driver.findElementByXPath("//android.view.View[contains(@text,'To-Do List')]").click();
		  
		  String[] tasks = {
				  			"Add tasks to list",
				  			"Get number of tasks",
				  			"Clear the list"};
		  
		  for(String addtask:tasks) {
			  driver.findElementByXPath("//android.widget.EditText[@resource-id = 'taskInput']").click();  
		  driver.findElementByXPath("//android.widget.EditText[@resource-id = 'taskInput']").sendKeys(addtask);
		  
		  driver.findElementByXPath("//android.widget.Button[@text = 'Add Task']").click();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  }
		  
			  driver.findElementByXPath("//android.view.View[@text = 'Add tasks to list']").click();
			  driver.findElementByXPath("//android.view.View[@text = 'Get number of tasks']").click();
			  driver.findElementByXPath("//android.view.View[@text = 'Clear the list']").click();
			  
			  driver.findElementByXPath("//android.view.View[contains(@text,'Clear List')]").click();
			  
			  List<MobileElement> tasklist = driver.findElementsById("tasksList");
			  System.out.println(tasklist.size());
			  
			  Assert.assertEquals(0, tasklist.size());
			 	  
		
	  }
	 
	 @AfterClass
	  public void teardown() {
		  
		  driver.quit();
		  
	  }



}
