package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		WebElement simplebutton = driver.findElement(By.id("simple"));
		simplebutton.click();
		
		Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println("Alert text is: " + alertText);
        
        simpleAlert.accept();
        
        driver.close();
		}

}
