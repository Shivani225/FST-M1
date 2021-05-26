package activities;


import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	
	AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void setup() throws MalformedURLException {	
		    DesiredCapabilities dCap = new DesiredCapabilities();
		    dCap.setCapability("deviceName", "Pixel4Emulator");
		    dCap.setCapability("platformName", "android");
		    dCap.setCapability("automationName", "UiAutomator2");
		    dCap.setCapability("ensureWebviewsHavePages", true);
		    dCap.setCapability("appPackage", "com.android.calculator2" );
		    dCap.setCapability("appActivity", ".Calculator" );
		    dCap.setCapability("noReset", true);

		    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

		    driver = new AndroidDriver<MobileElement>(remoteUrl, dCap);
		  }

  @Test
  public void multiplicationTest() {
	  
	  MobileElement digit5 = driver.findElementById("digit_5");
	  digit5.click();
	  driver.findElementByAccessibilityId("multiply").click();
	  digit5.click();
	  driver.findElementByAccessibilityId("equals").click();
	  
	  String result = driver.findElementById("result").getText();
	  System.out.println(result);
	  
	  assertEquals("25", result);
	  
	  
	  
  }
  
  @AfterClass
  public void teardown() {
	  
	  driver.quit();
	  
  }
}

