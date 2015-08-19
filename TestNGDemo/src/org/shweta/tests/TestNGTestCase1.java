package org.shweta.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestCase1 {
	/*@Test
	*
	*@BeforeMethod
	*@AfterMethod
	*
	*@BeforeClass
	*@AfterClass
	*
	*@BeforeTest
	*@AfterTest
	*
	*@BeforeSuite
	*@AfterSuite
	*
	*/
	@BeforeClass
	public  void testClassStartSelenium()
	{
		System.out.println("Inside testClassStartSelenium()");
	}
	@BeforeMethod
	public void testMethodSetUp()
	{
		System.out.println("Inside testMethodSetUp() Method");
	}
	@Test
	public void testHomePage()
	{
		System.out.println("In testHomePage() Method");
	}
	
	@Test
	public void testLoginPage()
	{
		System.out.println("In testLoginPage() Method");
	}
	
	@Test
	public void testMyAccountPage()
	{
		System.out.println("In testMyAccountPage() Method");
	}
	@AfterMethod
	public void testMethodTearDown()
	{
		System.out.println("Inside testMethodtearDown() Method");
	}
	@AfterClass
	public  void testClassStopSelenium()
	{
		System.out.println("Inside testClassStopSelenium()");
	}
	@BeforeTest
	public void testSetUpDB()
	{
		System.out.println("Inside testSetUpDB()");
	}
	@AfterTest
	public void testcleanUpDB()
	{
		System.out.println("Inside testCleanUpDB()");
	}
	
	@BeforeSuite
	public void testSuiteSetUp()
	{
		System.out.println( "Inside testSuiteSetUp()");
	}
	@AfterSuite
	public void testSuiteCleanUp()
	{
		System.out.println( "Inside testSuiteCleanUp()");
	}
	
	
}
