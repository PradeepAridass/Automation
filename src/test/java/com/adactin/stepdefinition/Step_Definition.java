package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.base.BaseClass;
import com.adactin.pom.LogIn;
import com.adactin.pomanager.PageObjectManager;
import com.adactin.runner.Test_Runner;
import com.configuration.property.FileReaderManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.*;

public class Step_Definition extends BaseClass {

	public static WebDriver driver = Test_Runner.driver;
	
	//LogIn l = new LogIn(driver);
	 PageObjectManager pom = new PageObjectManager(driver);
	 
		@Before
		public void beforeHooks(Scenario scenario) {
			String name = scenario.getName();
			System.out.println("Scenario Name: "+name);
		}
		
		@After
		public void afterHooks(Scenario scenario) throws IOException {
			Status status = scenario.getStatus();
			System.out.println("Sceanrio Status: "+status);
			
			if (scenario.isFailed()) {
				takeScreenshot(scenario.getName());
				
			}
		}
	
	@Given("User launch the application")
	public void user_launch_the_application() throws IOException {
	  // getUrl("https://adactinhotelapp.com/");
	  String url = FileReaderManager.getInstance().getcrInstance().geturl();
	  getUrl(url);
	}

	@When("User enter the valid {string} in the username field")
	public void user_enter_the_valid_in_the_username_field(String string) {
	   sendValue(pom.getL().getUsername(), string);
	   
	}

	@When("user enter the valid {string} in the password field")
	public void user_enter_the_valid_in_the_password_field(String string) {
	  sendValue(pom.getL().getPassword(), string);
	}

	@When("user is able to click the login button")
	public void user_is_able_to_click_the_login_button() {
	   clickElement(pom.getL().getLogin());
	   
	}

	@Then("user verify the navigate to search hotel page")
	public void user_verify_the_navigate_to_search_hotel_page() {
	   
	   
	}

}
