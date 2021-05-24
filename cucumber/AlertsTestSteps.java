package cucumberActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlertsTestSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	Alert alert;
	
	@Given("^User is on the page$")
	public void openURL() {
		
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 15);
	
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
	}
	
	@When("^User clicks the Simple Alert button$")
	public void simpleAlertclick() {
		
		driver.findElement(By.id("simple")).click();
	}
	
	@When("^User clicks the Confirm Alert button$")
	public void confirmAlertclick() {
		
		driver.findElement(By.id("confirm")).click();
	}
	
	@When("^User clicks the Prompt Alert button$")
	public void promptAlertclick() {
		
		driver.findElement(By.id("prompt")).click();
	}
	
	@Then("^Alert opens$")
	public void alertOpens() {
		
		alert = driver.switchTo().alert();
	}
	
	@And("^Read the text from it and print it$")
	public void print() {
		
		String alertText = alert.getText();
        System.out.println("Alert text is: " + alertText);
        
	}
	
	@And("^Write a custom message in it$")
	public void write() {
		
		alert.sendKeys("You are Awesome!");
		
	}
	
	@And("^Close the alert$")
	public void closeAlert() {
		
		alert.accept();
		
	}
	
	@And("^Close the alert with Cancel$")
	public void closeAlertCancel() {
		
		alert.dismiss();
		
	}
	
	@And("^Close Browser$")
	public void close() {
		
		driver.close();
		
	}


	

}
