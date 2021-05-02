package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumActivity9_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement message = driver.findElement(By.id("multi-value"));
		
		Select value = new Select(driver.findElement(By.id("multi-select")));
		
		value.selectByVisibleText("Javascript");
		System.out.println(message.getText());
		
		value.selectByValue("node");
		System.out.println(message.getText());
		
		for(int i = 4;i<=6;i++)
		{
		value.selectByIndex(i);
		}
		System.out.println(message.getText());
		
		value.deselectByValue("node");
		System.out.println(message.getText());
		
		value.deselectByIndex(7);
		System.out.println(message.getText());
		
		List<WebElement> optionselected = value.getAllSelectedOptions();
		for(WebElement options : optionselected)
		{
			System.out.println("Selected Options: "+options.getText());
		}
		
		value.deselectAll();
		System.out.println(message.getText());
			
		driver.close();
		
	}

}
