package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginToAppTest {
	
	WebDriver driver;
	
	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}
	@Given("Load the URL")
	public void load_the_url() {
		
		driver.get("http://localhost:8888");
	    
	}
	@When("Login page is displayed enter the username and password")
	public void login_page_is_displayed_enter_the_username_and_password() {
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
	    
	}
	@When("Click on login button")
	public void click_on_login_button() {
		
		driver.findElement(By.id("submitButton")).click();
	   
	}
	@Then("Validate the Login page")
	public void validate_the_login_page() {
		
		System.out.println("Home Page Displayed");
	    
	}

}
