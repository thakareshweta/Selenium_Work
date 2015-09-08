package org.shweta.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOnPage extends PageBase {
	
	public SignOnPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public FlightFinderPage loginAs(String userName , String password)
	{
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		return new FlightFinderPage(driver);
		
		
	}
	

}
