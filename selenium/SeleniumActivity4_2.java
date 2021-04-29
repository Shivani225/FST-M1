package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity4_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Shivani");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Hembrom");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shivanihembrom4@gmail.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9515116899");
		driver.findElement(By.xpath("//textarea")).sendKeys("I am learning Selenium");
		
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();
		
		Thread.sleep(1000);
				
		

	}

}
