package org.shweta.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.shweta.main.HomePage;
import org.shweta.main.SelectFlightPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest extends TestBase{
	
	 

	@Test(dataProvider="dataProvider")
	public void testLoginSuccessful(String userName,String password) {
	  
	  boolean testResult = homePage.clickSignOnLink()
	  			.loginAs(userName,password)
	  	
	  			.isLoginSuccessful();
	  Assert.assertTrue(testResult , "Login is unsuccessful!!");
	  
	 }
  
	@Test(dataProvider="dataProvider")
	public void testLoginUnSuccessful(String userName,String password) {
	  
	  boolean testResult = homePage.clickSignOnLink()
	  			.unsuccessfulLoginAs(userName, password)
	  			.isLoginUnsuccessful();
	  Assert.assertTrue(testResult , "Unsuccessful login test is unsuccessful!!");
	  
	 }
    
  
}
