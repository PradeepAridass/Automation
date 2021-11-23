package com.adactin.pomanager;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.LogIn;

public class PageObjectManager {

	public static WebDriver driver;
	
	private LogIn l;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public LogIn getL() {
		l = new LogIn(driver);
		return l;
	}
	
	
}
