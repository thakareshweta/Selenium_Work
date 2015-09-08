package org.shweta.util;

import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {
	
	public static WebDriver createWeDriver (String browser )
	{
		//Depending on the string browser initialise the proper instance of the web browser
		WebDriver driver = null;
	
		if(browser.equalsIgnoreCase("fireFox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Jars\\Selenium Jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			throw new InvalidParameterException(browser + "- is not valid");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void quitWebDriver(WebDriver driver)
	{
		driver.quit();
		
	}

}
