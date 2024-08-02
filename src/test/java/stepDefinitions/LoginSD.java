package stepDefinitions;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import coreFunctions.CoreFunctions;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.HomePagePO;
import pageObjects.LoginPagePO;
import utilities.PropertiesFileReader;

public class LoginSD {
	
	final String filePath = "./src/test/java/properties/config.properties";
	PropertiesFileReader pfr = new PropertiesFileReader(filePath);
	LoginPagePO loginPagePO;
	HomePagePO homePagePO;
	CoreFunctions coreFunctions = new CoreFunctions();
//	WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(20));
	
	@Given("user is presnet on the login page of the application")
	public void user_is_presnet_on_the_login_page_of_the_application() {
		String url="";
		try {
			url = pfr.properties().getProperty("appUrl");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Hooks.getDriver().get(url);
	}

	@When("user enters the valid credentials")
	public void user_enters_the_valid_credentials() {
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	    try {
			coreFunctions.sendKeys(loginPagePO.username(), pfr.properties().getProperty("username"));
			coreFunctions.sendKeys(loginPagePO.password(), pfr.properties().getProperty("password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@And("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    coreFunctions.click(loginPagePO.loginButton(), "Login");
	}

	@SuppressWarnings("deprecation")
	@Then("user is redirected to the application dashboard page")
	public void user_is_redirected_to_the_application_dashboard_page() {
		String acturlString = Hooks.getDriver().getCurrentUrl();
		String expurlString = null;
		try {
			expurlString = pfr.properties().getProperty("appUrl");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Assert.assertEquals(expurlString, acturlString);
	    homePagePO = new HomePagePO();
	    coreFunctions.click(homePagePO.formClose(), "Form Close button");
	}

}
