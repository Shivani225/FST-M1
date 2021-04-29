package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity5_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
		Thread.sleep(1000);
		System.out.println("Checkbox is Selected: "+checkbox.isSelected());
		
		checkbox.click();
		System.out.println("Checkbox is Selected: "+checkbox.isSelected());
		
		driver.close();

	}

}
