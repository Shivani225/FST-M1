package activities;

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

public class Activity2 {
	
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
		  
		  driver.get("https://www.training-support.net/");
		  
		  String pagetitle = driver.findElementByXPath("//android.view.View[@text = 'Training Support']").getText();
		  System.out.println("Title of the page is: " +pagetitle);
		  
		  MobileElement AboutUsButton = driver.findElementByXPath("//android.view.View[@text = 'About Us' and @index ='4']");
		  AboutUsButton.click();
		  
		  String pagetitle2 = driver.findElementByXPath("//android.view.View[@text = 'About Us' and @index ='2']").getText();
		  System.out.println("Title of the second page is: " +pagetitle2);
		  
	        Assert.assertEquals(pagetitle, "Training Support");	    	
	        Assert.assertEquals(pagetitle2, "About Us");
	  }
	 
	 @AfterClass
	  public void teardown() {
		  
		  driver.quit();
		  
	  }



}
