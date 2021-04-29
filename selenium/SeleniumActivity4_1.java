package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity4_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
		
		System.out.println("Title of the new page is: "+driver.getTitle());
		
		driver.close();
		

	}

}
