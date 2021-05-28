package project;

import java.net.MalformedURLException;
import java.net.URL;
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


public class Project_Activity6 {
	
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
		    
		    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

			
		    driver.get("https://www.training-support.net/selenium");			  
		    driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(new UiSelector().scrollable(true)).flingToEnd(5)"));
			driver.findElementByXPath("//android.view.View[contains(@text,'Popups')]").click();
			
			
			  
		  }
	
	
	 @Test (priority = 1)
	  public void LoginSuccessTest() {
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementByXPath("//android.view.View[4]").click();
		 wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@resource-id = 'username']")));

		  
		  driver.findElementByXPath("//android.widget.EditText[@resource-id = 'username']").sendKeys("admin");
		  driver.findElementByXPath("//android.widget.EditText[@resource-id = 'password']").sendKeys("password");
		  		  
		  driver.findElementByXPath("//android.widget.Button[@text = 'Log in']").click();
		  
		  String loginmessage = driver.findElementByXPath("//android.view.View[@resource-id = 'action-confirmation']").getText();
		  System.out.println(loginmessage);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Assert.assertEquals(loginmessage, "Welcome Back, admin");
	
	  }
	 
	 @Test(priority = 2)
	  public void LoginFailedTest() {
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElementByXPath("//android.view.View[5]").click();
		 
		 wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@resource-id = 'username']")));

		  
		 driver.findElementByXPath("//android.widget.EditText[@resource-id = 'username']").clear(); 
		 driver.findElementByXPath("//android.widget.EditText[@resource-id = 'username']").sendKeys("admin2");
		 driver.findElementByXPath("//android.widget.EditText[@resource-id = 'password']").clear();
		  driver.findElementByXPath("//android.widget.EditText[@resource-id = 'password']").sendKeys("password2");
		  
		  driver.findElementByXPath("//android.widget.Button[@text = 'Log in']").click();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View[@resource-id = 'action-confirmation']")));

		  String loginmessage1 = driver.findElementByXPath("//android.view.View[@resource-id = 'action-confirmation']").getText();
		  System.out.println(loginmessage1);
		  Assert.assertEquals(loginmessage1, "Invalid Credentials");
	
	  }
	 
	 @AfterClass
	  public void teardown() {
		  
		  driver.quit();
		  
	  }



}
