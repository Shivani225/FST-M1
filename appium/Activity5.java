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
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Activity5 {
	
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
		
		@BeforeClass
		public void setup() throws MalformedURLException {	
			    DesiredCapabilities dCap = new DesiredCapabilities();
			    dCap.setCapability("deviceName", "Pixel4Emulator");
			    dCap.setCapability("platformName", "android");
			    dCap.setCapability("automationName", "UiAutomator2");
			    dCap.setCapability("ensureWebviewsHavePages", true);
			    dCap.setCapability("appPackage", "com.google.android.apps.messaging" );
			    dCap.setCapability("appActivity", ".ui.ConversationListActivity" );
			    dCap.setCapability("noReset", true);

			    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

			    driver = new AndroidDriver<MobileElement>(remoteUrl, dCap);
			    wait = new WebDriverWait(driver,20);
			  }
		
		@Test
		  public void SendMessageTest() {
			
			String Message = "Hello!! from Appium";
						
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElementByAccessibilityId("Start new conversation").click();
			driver.findElementById("recipient_text_view").setValue("9515116899");
			
			((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	    	
			driver.findElementById("compose_message_text").sendKeys(Message);
			driver.findElementById("send_message_button_icon").click();
			
			String messagetext = driver.findElementByXPath("//android.widget.TextView[@content-desc = 'Now, SMS']").getText();
			
			Assert.assertEquals(messagetext, "Now • SMS");
			
				  	  }
		
		@AfterClass
		  public void teardown() {
			  
			  driver.quit();
			  
		  }



}
