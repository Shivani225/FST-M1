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

public class Activity3 {
	
	
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
  public void AdditionTest() {
	  
	  MobileElement digit5 = driver.findElementById("digit_5");
	  MobileElement digit9 = driver.findElementById("digit_9");
	  digit5.click();
	  driver.findElementByAccessibilityId("plus").click();
	  digit9.click();
	  driver.findElementByAccessibilityId("equals").click();
	  
	  String result = driver.findElementById("result").getText();
	  System.out.println("Sum of 5 and 9 is: " +result);
	  
	  assertEquals("14", result);
	  
	  
	  
  }
  
  @Test
  public void SubtractionTest() {
	  
	  MobileElement digit1 = driver.findElementById("digit_1");
	  MobileElement digit0 = driver.findElementById("digit_0");
	  MobileElement digit5 = driver.findElementById("digit_5");
	  digit1.click();
	  digit0.click();
	  driver.findElementByAccessibilityId("minus").click();
	  digit5.click();
	  driver.findElementByAccessibilityId("equals").click();
	  
	  String result = driver.findElementById("result").getText();
	  System.out.println("Subtraction of 5 by 10 is: " +result);
	  
	  assertEquals("5", result);
	  
	  
	  
  }
  
  @Test
  public void MultiplyTest() {
	  
	  MobileElement digit1 = driver.findElementById("digit_1");
	  MobileElement digit0 = driver.findElementById("digit_0");
	  MobileElement digit5 = driver.findElementById("digit_5");
	  digit5.click();	  
	  driver.findElementByAccessibilityId("multiply").click();
	  digit1.click();
	  digit0.click();
	  digit0.click();
	  driver.findElementByAccessibilityId("equals").click();
	  
	  String result = driver.findElementById("result").getText();
	  System.out.println("Mutiplication of 5 and 100 is: "+result);
	  
	  assertEquals("500", result);
	  
	  
	  
  }
  
  @Test
  public void DivisionTest() {
	  
	  MobileElement digit2 = driver.findElementById("digit_2");
	  MobileElement digit0 = driver.findElementById("digit_0");
	  MobileElement digit5 = driver.findElementById("digit_5");
	  digit5.click();
	  digit0.click();
	  driver.findElementByAccessibilityId("divide").click();
	  digit2.click();
	  driver.findElementByAccessibilityId("equals").click();
	  
	  String result = driver.findElementById("result").getText();
	  System.out.println("Division of 50 by 2 is : " +result);
	  
	  assertEquals("25", result);
	  
	  
	  
  }
  
  
  @AfterClass
  public void teardown() {
	  
	  driver.quit();
	  
  }

}
