package org.shweta.main;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookFlightPage extends PageBase{

	public BookFlightPage(WebDriver driver)
	{
		super(driver);
	}
	
	public FlightConfirmationPage addPassengerDetails() throws IOException
	{
		//add passenger details
		//firstname
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Shweta");
		//Last Name
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Ghadge");
		
		//credit number
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("12345678");
		
		
		//Credit card holder's first name 
		
		driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("Shweta");
		//card holder's last name
		driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("Ghadge");
		
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
		return new FlightConfirmationPage(driver);
		
	}
}
