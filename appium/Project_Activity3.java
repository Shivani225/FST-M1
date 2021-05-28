package project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Project_Activity3 {
	
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
	    DesiredCapabilities dCap = new DesiredCapabilities();
	    dCap.setCapability("deviceName", "Pixel4Emulator");
	    dCap.setCapability("platformName", "android");
	    dCap.setCapability("automationName", "UiAutomator2");
	    dCap.setCapability("ensureWebviewsHavePages", true);
	    dCap.setCapability("appPackage", "com.google.android.keep");
	    dCap.setCapability("appActivity", ".activities.BrowseActivity");
	    dCap.setCapability("noReset", true);
	    

	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

	    driver = new AndroidDriver<MobileElement>(remoteUrl, dCap);
	    wait = new WebDriverWait(driver, 20);
	  }

  @Test
  public void GoogleTasks() {
	  
	  System.out.println("Welcome to Google Keep");
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  String notetitle = "Test Appium";
	  
	  driver.findElementByAccessibilityId("New text note").click();
	  driver.findElementByXPath("//android.widget.EditText[@text = 'Title']").sendKeys(notetitle);
	  driver.findElementByXPath("//android.widget.EditText[@text = 'Note']").sendKeys("This is a test note for Google Keep with reminder");
	  
	  driver.findElementByAccessibilityId("Single-column view").click();
	  driver.findElementByXPath("//android.widget.LinearLayout[@index = '5']").click();
	
	  driver.findElementByXPath("//android.widget.TextView[@text = '9:30 AM']").click();
	  driver.findElementByXPath("//android.widget.TextView[@text = 'Afternoon']").click();
	  
	  driver.findElementById("save").click();
	  
	  
	  
	  driver.findElementByAccessibilityId("Open navigation drawer").click();
	  
	  String reminder = driver.findElementByXPath("//android.widget.TextView[@text ='Today, 1:00 PM']").getText();
	  System.out.println("Newly Added note is :" +reminder);
	  
	  Assert.assertEquals(reminder, "Today, 1:00 PM");
	  
	  
	  
	  
	  
  }
  
  @AfterClass
  public void teardown() {
	  
	  driver.quit();
	  
  }


}
