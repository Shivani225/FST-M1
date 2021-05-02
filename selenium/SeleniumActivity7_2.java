package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity7_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		driver.findElement(By.xpath("(//input[@placeholder = 'Username'])[2]")).sendKeys("shembrom");
		driver.findElement(By.xpath("(//input[@placeholder = 'Password'])[2]")).sendKeys("password");
		driver.findElement(By.xpath("(//input[@placeholder = 'Password'])[3]")).sendKeys("password");
		driver.findElement(By.xpath("//input[@placeholder = 'totally.real.email@xyz.com']")).sendKeys("shivanihembrom4@gmail.com");
		
		driver.findElement(By.xpath("(//button[@class = 'ui button'])[2]")).click();
		
		String signupmsg = driver.findElement(By.xpath("//div[@id = 'action-confirmation']")).getText();
		System.out.println("Signup success message: "+signupmsg);
		driver.close();

	}

}
