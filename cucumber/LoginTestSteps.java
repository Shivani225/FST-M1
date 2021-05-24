package cucumberActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Login page$")
	public void openURL() throws Throwable {
		
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,15);
		
		driver.get("https://www.training-support.net/selenium/login-form");	
		
	}
	
	@When("^User enters username and password$")
	public void login() throws Throwable {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[@class = 'ui button']")).click();
			
		
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void loginvalues(String username, String password) throws Throwable {
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@class = 'ui button']")).click();
			
		
	}
	
	@Then("^Read the page title and confirmation message$")
	public void confirm() {
		
		String confirm_msg = driver.findElement(By.id("action-confirmation")).getText();
		
		String title = driver.getTitle();
		System.out.println("Page title is " +title);
		System.out.println("Login confirmation message is " +confirm_msg);
	}
	
	@And("^Close the Browser$")
	public void close() {
		driver.close();
	}
	

}
