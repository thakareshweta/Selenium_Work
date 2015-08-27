package org.shweta.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://test1.absofttrainings.com/ajax-and-dynamic-html-behaviour/");
		
		//Set the implicit wait time to 7 seconds
		
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			//Set the wait time to 5 seconds
			driver.findElement(By.id("wait-time")).clear();
			driver.findElement(By.id("wait-time")).sendKeys("5");
			//click "Create a new button after wait
			
			driver.findElement(By.id("new-button")).click();
			
			//Check if the new button has been displayed or not?
			System.out.println("Is new button displayed? : "+ driver.findElement(By.id("wait5")).isDisplayed());
			driver.quit();
				
		
	}

}
