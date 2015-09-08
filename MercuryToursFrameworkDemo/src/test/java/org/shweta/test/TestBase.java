package org.shweta.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.shweta.main.HomePage;
import org.shweta.util.DataDrivenHelper;
import org.shweta.util.WebDriverHelper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class TestBase {

	protected WebDriver driver;
	protected HomePage homePage;
	protected Properties testConfig;
	
	@BeforeSuite
	public void beforeSuite() throws FileNotFoundException, IOException
	{
		testConfig = new Properties();
		testConfig.load(new FileInputStream("TestConfig.properties"));
		
	}
	@BeforeMethod
	public void beforeMethod() throws FileNotFoundException, IOException {

		testConfig = new Properties();
		testConfig.load(new FileInputStream("TestConfig.properties"));
		driver = WebDriverHelper.createWeDriver(testConfig.getProperty("browser"));
		driver.get(testConfig.getProperty("baseUrl"));
		homePage = new HomePage(driver);
	}
	
	 @DataProvider
	  public Object[][] dataProvider(Method method)
	  {
		  DataDrivenHelper ddh = new DataDrivenHelper(testConfig.getProperty("filePath"));
		  String worksheetname = testConfig.getProperty("workSheetName");
		  System.out.println("WorkSheet name is :"+ worksheetname);
		  Object testData[][]= ddh.getTestCaseDataSets(testConfig.getProperty("workSheetName"), method.getName());
		return testData;
	  }

	@AfterMethod
	public void afterMethod() {
		WebDriverHelper.quitWebDriver(driver);
	}

}
