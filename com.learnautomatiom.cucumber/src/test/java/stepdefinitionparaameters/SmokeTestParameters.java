package stepdefinitionparaameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestParameters {

	WebDriver driver;
	@Given("^Open FireFox and open the application$")
	public void open_FireFox_and_open_the_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\GIRISH\\Downloads\\geckodriver-v0.17.0-win32\\geckodriver.exe");
		
		driver= new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_valid_username_and_password(String username,String password) throws Throwable {

		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();  
	}
}


