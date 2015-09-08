package org.shweta.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JavaProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		Properties testConfig = new Properties();
		testConfig.load(new FileInputStream("TestConfig.properties"));
		
		System.out.println(testConfig.getProperty("browser"));
		System.out.println(testConfig.getProperty("baseUrl"));

	}

}
