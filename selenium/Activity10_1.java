package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		
		driver.get("https://www.training-support.net/selenium/input-events");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		WebElement cube = driver.findElement(By.id("wrapD3Cube"));
		
		actions.click(cube);
		Thread.sleep(1000);
        WebElement cubeVal = driver.findElement(By.className("active"));	
        System.out.println("Left Click: " + cubeVal.getText());
        
        actions.doubleClick(cube);
        Thread.sleep(1000);
        cubeVal = driver.findElement(By.className("active"));	
        System.out.println("Double Click: " + cubeVal.getText());
		
        actions.contextClick(cube).perform();
        Thread.sleep(1000);
        cubeVal = driver.findElement(By.className("active"));	
        System.out.println("Right Click: " + cubeVal.getText());
        
        
       driver.close();
      
	}

}
