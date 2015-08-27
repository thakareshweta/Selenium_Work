package org.shweta.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxes {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String baseUrl = "http://test1.absofttrainings.com/my-account/";
		driver.get(baseUrl);
		System.out.println("The default value is "+ driver.findElement(By.id("username")).getAttribute("value"));
		driver.findElement(By.id("username")).sendKeys("Shweta");
		System.out.println("After updation value is "+ driver.findElement(By.id("username")).getAttribute("value"));
		driver.findElement(By.id("username")).clear();
		System.out.println("The value after clear  is "+ driver.findElement(By.id("username")).getAttribute("value"));
		
		driver.findElement(By.id("password")).clear();
	
		
		//driver.findElement(By.name("login")).click();
		
		
		
		 
		
		driver.close();
	}
	

}
