package org.shweta.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.shweta.main.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest extends TestBase{
 

  @Test
  public void testLoginSuccessful() {
	  
	  boolean testResult = homePage.clickMyAccountLink()
	  			.loginAs("testuser1","testpwd1")
	  			.isloginSuccessful("testuser1");
	  Assert.assertTrue(testResult , "Login is unsuccessful!!");
	  
	  
  }
}
