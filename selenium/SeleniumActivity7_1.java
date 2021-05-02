package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity7_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
			
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("password");
		driver.findElement(By.xpath("(//button[@class = 'ui button'])[1]")).click();
		
		String loginmsg = driver.findElement(By.xpath("//div[@id = 'action-confirmation']")).getText();
		System.out.println("Login success message: "+loginmsg);
		driver.close();
	}

}
