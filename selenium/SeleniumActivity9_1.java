package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumActivity9_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement value = driver.findElement(By.id("single-value"));
		
		Select dropdown = new Select(driver.findElement(By.id("single-select")));
		
		dropdown.selectByVisibleText("Option 2");
		System.out.println("Value of the Second Option is:" +value.getText());
		
		dropdown.selectByIndex(2);
		System.out.println("Value of the Third Option is:" +value.getText());
		
		dropdown.selectByValue("4");
		System.out.println("Value of the Fourth Option is:" +value.getText());
		
		List<WebElement> Options = dropdown.getOptions();
		System.out.println("Values of the Dropdown is:");
		for(WebElement Option : Options)
		{
			System.out.println(Option.getText());
		}
		
		driver.close();

	}

}
