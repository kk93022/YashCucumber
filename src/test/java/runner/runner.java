package runner;

import java.util.concurrent.TimeUnit;

import cucumber.api.CucumberOptions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/features/feature1.feature",glue="",tags={"@selenium"},format={"json:reportskirangoogletest.json"})
public class runner extends AbstractTestNGCucumberTests {
	
//	WebDriver driver ;
//	
//	@Given("^I am able to acess google Serach page$")
//	public void i_am_able_to_acess_google_Serach_page()  {
//	 driver = new ChromeDriver();
//	 driver.manage().window().maximize();
//	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	 driver.get("https://www.google.com/");
//	}
//
//	@When("^I type the Keyword as \"([^\"]*)\"$")
//	public void i_type_the_Keyword_as(String arg1)  {
//		driver.findElement(By.name("q")).sendKeys(arg1);
//	  
//	}
//
//	@When("^I choose the first suggestion$")
//	public void i_choose_the_first_suggestion() throws Throwable {
//	    driver.findElement(By.tagName("h3")).click();
//	}
//
//	@When("^I click on first result$")
//	public void i_click_on_first_result()  {
//	  
//	}
//
//	@Then("^I should have \"([^\"]*)\" as a title$")
//	public void i_should_have_as_a_title(String arg1) {
//	    
//	}


}
