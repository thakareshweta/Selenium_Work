package org.shweta.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFlightPage extends PageBase{
	
	public SelectFlightPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	public BookFlightPage selectOutFlight() throws InterruptedException
	{
		//Random number to select flight randomly
		int randomNum; 
		Random rand = new Random();
		WebElement webElement;
		
		//Select departing flights in an arraylist then select any random flight by clicking that radio button
		List outFlights = new ArrayList<WebElement>();
		outFlights = driver.findElements(By.xpath("//input[@type='radio'][@name='outFlight']"));
		System.out.println("Total available Options are : " +outFlights.size());
		
		randomNum = rand.nextInt((outFlights.size()));
		webElement = (WebElement) outFlights.get(randomNum);
		webElement.click();
		
		//Select return flights in an arraylist then select any random flight by clicking that radio button
		List inFlights = new ArrayList<WebElement>();
		inFlights = driver.findElements(By.xpath("//input[@type='radio'][@name='inFlight']"));
		System.out.println("Total available Options are : " +inFlights.size());
		
			
		randomNum = rand.nextInt((inFlights.size()));	
		webElement = (WebElement) inFlights.get(randomNum);
		webElement.click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
			
		//This navigates to BookFlightPage let's return that 
		
		return new BookFlightPage(driver);
		
		
		
	}

}
