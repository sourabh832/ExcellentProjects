package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	@Given("User launches Google dot com")
	public void user_launches_google_dot_com() {
	    // Write code here that turns the phrase above into concrete actions
	    
		String chromePath="resources\\browsers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
	}

	@When("User enters some sourabh and click on search button")
	public void user_enters_some_sourabh_and_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Google displays search results")
	public void google_displays_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
