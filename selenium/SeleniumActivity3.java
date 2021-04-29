package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		WebElement fname = driver.findElement(By.id("firstName"));
		WebElement lname = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement contact = driver.findElement(By.id("number"));
		
		fname.sendKeys("Shivani");
		lname.sendKeys("Hembrom");
		email.sendKeys("shivanihembrom4@gmail.com");
		contact.sendKeys("9515116899");
		
		WebElement submitButton = driver.findElement(By.cssSelector(".ui.green.button"));
		submitButton.click();
				
		
		driver.close();
		

	}

}
