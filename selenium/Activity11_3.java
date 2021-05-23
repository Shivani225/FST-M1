package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		WebElement promptbutton = driver.findElement(By.id("prompt"));
		promptbutton.click();
		
		Alert promptAlert = driver.switchTo().alert();
        String alertText = promptAlert.getText();
        System.out.println("Alert text is: " + alertText);
        
        promptAlert.sendKeys("Yes, you are!");
        
        promptAlert.accept();
        
        driver.close();
		

	}

}
