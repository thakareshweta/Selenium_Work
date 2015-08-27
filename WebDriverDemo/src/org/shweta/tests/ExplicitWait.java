package org.shweta.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://test1.absofttrainings.com/ajax-and-dynamic-html-behaviour/");
		
		//Set the wait time to 5 seconds
		driver.findElement(By.id("wait-time")).clear();
		driver.findElement(By.id("wait-time")).sendKeys("5");
		//click "Create a new button after wait
		
		driver.findElement(By.id("new-button")).click();
		
		//Create a WebDriverWait instance
		// parameters 1. Out driver instance 2. the time to wait in seconds 
		
		WebDriverWait wdWait = new WebDriverWait(driver,30);
		//wait until the condition is true
		//
		
		wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("wait5")));
				
				
		//Check if the new button has been displayed or not?
		System.out.println("Is new button displayed? : "+ driver.findElement(By.id("wait5")).isDisplayed());
		
		driver.findElement(By.id("new-alert")).click();
		
		wdWait.until(ExpectedConditions.alertIsPresent());
		Alert jsAlert = driver.switchTo().alert();
		
		System.out.println("The Alert text is : "+jsAlert.getText());
		jsAlert.accept();
		driver.switchTo().defaultContent();		
		driver.quit();

	}

}
