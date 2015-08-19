package org.shweta.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IndeedTestNGTests {
	
	public WebDriver driver;
	public String baseUrl;
	
	@BeforeClass(enabled=false)
	public void setSystemProperty()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe" );
	}
	
	@BeforeMethod
	public void setUp(){
		
		driver = new FirefoxDriver();
		baseUrl = "http://www.indeed.com";
		
	}
	
	@Test(dataProvider= "getIndeedJobSearchParam")//(enabled=false)
	public void testJobSearch(String keyword , String city , String state)
	{
	//	if(true)
		//{
			//throw new SkipException("Test is skipped in Excel File");
	//	}
		 driver.get(baseUrl);
		 driver.findElement(By.id("what")).sendKeys(keyword);
		 driver.findElement(By.id("where")).clear();
		 driver.findElement(By.id("where")).sendKeys(city);
		 driver.findElement(By.id("fj")).click();
		 String expectedTitle = keyword + " Jobs, Employment in " +city +", "+ state +" | Indeed.com";
		 String actualTitle = driver.getTitle();
		 //assertEquals("Error: Ooops the Title doesnt match" , expectedTitle, actualTitle);
		 Assert.assertEquals(actualTitle, expectedTitle, "Error: Ooops the Title doesnt match");
	}
	
	@Test
	 public void testLogo()
	 {
		 driver.get(baseUrl);
		// Assert.assertTrue(condition, message);
		 Assert.assertTrue(
				  driver.findElement(By.xpath("//img[@alt='Indeed job search']")).isDisplayed(),
				  "Not Found");	 
	 }
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	  @DataProvider
	  public Object[][] getIndeedJobSearchParam() {
	    
		  return new Object[][] {
			  new Object[] { "Selenium", "London" ,"OH"},
			  new Object[] { "Cucumber", "Chicago","IL" },
			  new Object[] { "Testing", "Indianapolis","IN" },
	    };
	    
	  }
	
}
