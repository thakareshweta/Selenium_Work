package org.shweta.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.shweta.main.HomePage;
import org.shweta.util.DataDrivenHelper;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest extends TestBase{
 

  @Test(dataProvider="dataProvider")
  public void testLoginSuccessful(String userName,String password) {
	  
	  boolean testResult = homePage.clickMyAccountLink()
	  			.loginAs(userName,password)
	  			.isloginSuccessful(userName);
	  Assert.assertTrue(testResult , "Login is unsuccessful!!");	  
  }
 
}
