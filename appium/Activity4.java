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

public class Activity4 {
	
AndroidDriver<MobileElement> driver;
WebDriverWait wait;
	
	@BeforeClass
	public void setup() throws MalformedURLException {	
		    DesiredCapabilities dCap = new DesiredCapabilities();
		    dCap.setCapability("deviceName", "Pixel4Emulator");
		    dCap.setCapability("platformName", "android");
		    dCap.setCapability("automationName", "UiAutomator2");
		    dCap.setCapability("ensureWebviewsHavePages", true);
		    dCap.setCapability("appPackage", "com.android.contacts" );
		    dCap.setCapability("appActivity", ".activities.PeopleActivity" );
		    dCap.setCapability("noReset", true);

		    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

		    driver = new AndroidDriver<MobileElement>(remoteUrl, dCap);
		    wait = new WebDriverWait(driver,20);
		  }
	
	@Test
	  public void AddNewContactTest() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		MobileElement addbutton = driver.findElementByAccessibilityId("Create new contact");
		addbutton.click();
		
		
		driver.findElementByXPath("//android.widget.EditText[@text = 'First name']").sendKeys("Shivani");
		driver.findElementByXPath("//android.widget.EditText[@text = 'Last name']").sendKeys("R");
		driver.findElementByXPath("//android.widget.EditText[@text = 'Phone']").sendKeys("9381538167");
		
		driver.findElementById("editor_menu_save_button").click();
		
	    String contactName = driver.findElementById("large_title").getText();
	
        Assert.assertEquals(contactName, "Shivani R");	  
		
		
	  
		  	  }
	
	@AfterClass
	  public void teardown() {
		  
		  driver.quit();
		  
	  }


}
