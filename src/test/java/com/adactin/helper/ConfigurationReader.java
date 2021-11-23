package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
	
	public ConfigurationReader() throws IOException {

		File F = new File("C:\\Users\\Admin\\eclipse-workspace\\Automation_Testing\\src\\test\\java\\com\\configuration\\property\\Configuration.properties");
		FileInputStream fis = new FileInputStream(F);
		p = new Properties();
		p.load(fis);
	}

	
	public String getbrowser() {
		String browser = p.getProperty("browserName");
		return browser;
		}
	
	
	public String geturl() {
		String url = p.getProperty("urlName");
		return url;
	}
}
