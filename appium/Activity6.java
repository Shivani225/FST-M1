package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity6 {
	
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
			    wait = new WebDriverWait(driver,25);
			  }
		
		 @Test
		  public void ScrollTest() {
			 
			 driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			  
			  driver.get("https://www.training-support.net/selenium/lazy-loading");
			  
		        MobileElement pageTitle = driver.findElementByXPath("//android.view.View[@text = 'Lazy Loading']");
		        wait.until(ExpectedConditions.textToBePresentInElement(pageTitle, "Lazy Loading"));
		        
		        List<MobileElement> numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
		    	
		        System.out.println("Number of image shown currently: " + numberOfImages.size());
			
		        
			
		        // Assertion before scrolling
			
		        Assert.assertEquals(numberOfImages.size(), 2);
			
		        
			
		        // Scroll to Helen's post
		        
		        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollTextIntoView(\"helen\")"));
	        // Find the number of images shown after scrolling
			
		        numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
			
		        System.out.println("Number of image shown currently: " + numberOfImages.size());
			
		        
			
		        // Assertion after scrolling
			
		        Assert.assertEquals(numberOfImages.size(),18);
			
		 
			  
			  	  }
		 
		 @AfterClass
		  public void teardown() {
			  
			  driver.quit();
			  
		  }


}
