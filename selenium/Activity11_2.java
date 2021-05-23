package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		WebElement confirmbutton = driver.findElement(By.id("confirm"));
		confirmbutton.click();
		
		Alert confirmAlert = driver.switchTo().alert();
        String alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);
        
        confirmAlert.accept();
        
        confirmbutton.click();
        confirmAlert.dismiss();
        
        driver.close();
		

	}

}
