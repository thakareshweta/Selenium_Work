package org.shweta.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.shweta.main.HomePage;
import org.shweta.util.WebDriverHelper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	protected WebDriver driver;
	protected HomePage homePage;
	protected Properties testConfig;

	@BeforeMethod
	public void beforeMethod() throws FileNotFoundException, IOException {

		testConfig = new Properties();
		testConfig.load(new FileInputStream("TestConfig.properties"));
		driver = WebDriverHelper.createWeDriver(testConfig.getProperty("browser"));
		driver.get(testConfig.getProperty("baseUrl"));
		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void afterMethod() {
		WebDriverHelper.quitWebDriver(driver);
	}

}
