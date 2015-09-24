package org.shweta.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage extends PageBase {
	
	public FlightFinderPage(WebDriver driver)
	{
		super(driver);
	}
	public boolean isLoginSuccessful()
	{
		//return driver.findElement(By.className("myaccount_user")).getText().contains(userName);
		return driver.getTitle().equals("Find a Flight: Mercury Tours:");
		
	}
	
	public SignOnPage SignOff()
	{
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		return new SignOnPage(driver);		
		
	}
	
	public SelectFlightPage setReservationValues(String passCount,String fromCity , String toCity,String departDate , String departMonth , String returnDate , String returnMonth) throws InterruptedException
	{
		
		
		driver.findElement(By.xpath( "//input[@type='radio' and @name='tripType'][2]")).click();
		boolean radioselected = driver.findElement(By.xpath( "//input[@type='radio' and @name='tripType'][2]")).isSelected();
		System.out.println("Is the value selected? " + radioselected);
		
		/*<input type="radio" checked="" value="roundtrip" name="tripType">
		Round Trip  
		<input type="radio" value="oneway" name="tripType">
		One Way*/
		Select passengerCount = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		
		passengerCount.selectByVisibleText(passCount);
		Thread.sleep(2000);
		
		//Select Origin Values
		//Select origin city
		Select fromPort = new Select(driver.findElement(By.xpath("//Select[@name='fromPort']")));
		fromPort.selectByVisibleText(fromCity);
		
		Thread.sleep(2000);
		//Select Origin Date
		//Select Month
		Select fromMonth = new Select(driver.findElement(By.xpath("//Select[@name='fromMonth']")));
		//fromMonth.selectByVisibleText("July");
		fromMonth.selectByValue(departMonth);
		//Select Date
		
		Select fromDay = new Select(driver.findElement(By.xpath("//Select[@name='fromDay']")));
		fromDay.selectByVisibleText(departDate);
		//fromDay.selectByVisibleText("5");
		//Select destination values
		//Select destination City
		
		Thread.sleep(2000);
		Select toPort = new Select(driver.findElement(By.xpath("//Select[@name='toPort']")));
		toPort.selectByVisibleText(toCity);
		//Select Return Date
		//Select Month
		Select toMonth = new Select(driver.findElement(By.xpath("//Select[@name='toMonth']")));
		//toMonth.selectByVisibleText("July");
		toMonth.selectByValue(returnMonth);
		
		//Select Date
		Thread.sleep(2000);
		Select toDay = new Select(driver.findElement(By.xpath("//Select[@name='toDay']")));
		toDay.selectByVisibleText(returnDate);
		Thread.sleep(5000);
		
		Thread.sleep(2000);
		//Select Class
		driver.findElement(By.xpath("//input[@type='radio'][@name='servClass'][2]")).click();;
		
		//Select Preference
		
		Select airlineName = new Select (driver.findElement(By.xpath("//Select[@name='airline']")));
		airlineName.selectByVisibleText("No Preference");
		
		//Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		
		return new SelectFlightPage(driver);
		
	}

}
