package com.configuration.property;

import java.io.IOException;

import com.adactin.helper.ConfigurationReader;

public class FileReaderManager {

	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public static ConfigurationReader getcrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
	
}
