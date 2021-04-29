package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActivity6_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		
		driver.get("https://training-support.net/selenium/ajax");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		WebElement changecontentbutton = driver.findElement(By.xpath("//button[@class ='ui violet button']"));
		changecontentbutton.click();
		
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
	    
	    String message1 = driver.findElement(By.xpath("//h1")).getText();
	    System.out.println("Message on the Page is:" +message1);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"I'm late!"));
	    
	    String message2 = driver.findElement(By.xpath("//h3")).getText();
	    System.out.println("Second Message on the Page is:" +message2);
	    
	    driver.close();
	    
	    
	    
	    
	    
	    

	}

}
