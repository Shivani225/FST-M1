package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActivity6_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);

		WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
		WebElement checkboxbutton = driver.findElement(By.id("toggleCheckbox"));
		
		checkboxbutton.click();
		
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		checkboxbutton.click();
		
        wait.until(ExpectedConditions.visibilityOf(checkbox));
    	
        checkboxbutton.click();	
        
        driver.close();
		
	}

}
