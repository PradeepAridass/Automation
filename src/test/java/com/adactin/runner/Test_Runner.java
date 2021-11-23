package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.base.BaseClass;
import com.configuration.property.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
				glue = "com\\adactin\\stepdefinition",
				tags = " @LoginPage",
				plugin = {"pretty", "html:Report/Cucumber_Report.html",
						"json:Report/Cucumber.json"},
					//"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport1.html"})					
						monochrome = true,
						dryRun = false)

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
		public static void setUp() throws IOException {
		
		String browser = FileReaderManager.getInstance().getcrInstance().getbrowser();
		driver = BaseClass.browser("chrome");
		
		}
	
	@AfterClass
	public static void teardown() {
		driver.close();
	}
}
