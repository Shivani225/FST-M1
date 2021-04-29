package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumActivity4_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/target-practice");
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+title);
		
		String thirdheader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println("Third Header of the Page is: "+thirdheader);
		
		String fifthheadercolor = driver.findElement(By.xpath("//h5")).getCssValue("color");
		System.out.println("Color of the Fifth Header of the Page is: "+fifthheadercolor);
		
		String violetbuttonClass = driver.findElement(By.xpath("//button[@class = 'ui violet button']")).getAttribute("class");
		System.out.println("Class of the Violet Button of the Page is: "+violetbuttonClass);
		
		String greybutton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
	    System.out.println("Text of the Grey Button of the Page is: "+greybutton);
	    
	    driver.close();
				
		
	}

}
