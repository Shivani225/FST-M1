package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity5_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		WebElement textfield = driver.findElement(By.id("dynamicText"));
		System.out.println("Text Field is enabled: "+textfield.isEnabled());
		
		driver.findElement(By.id("toggleInput")).click();
		System.out.println("Text Field is enabled: "+textfield.isEnabled());
		
		driver.close();
	}

}
