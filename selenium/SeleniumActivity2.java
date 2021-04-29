package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println("Text in the element is: "+idLocator.getText());
		
		WebElement classLocator = driver.findElement(By.className("green"));
		System.out.println("Text in the element is: "+classLocator.getText());
		
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in the element is : " + cssLocator.getText());
	
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in the element is : " + linkTextLocator.getText());
		
        driver.close();
		

	}

}
