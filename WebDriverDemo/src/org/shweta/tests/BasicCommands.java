package org.shweta.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicCommands {
	
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String baseUrl = "http://test1.absofttrainings.com/my-account/";
		driver.get(baseUrl);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		//driver.findElement(By.name("login")).click();
		
		System.out.println("Login button enabled? : " +driver.findElement(By.name("login")).isEnabled());
		System.out.println("Login button displayed? : " +driver.findElement(By.name("login")).isDisplayed());
		System.out.println("Login button Name/Text? : " +driver.findElement(By.name("login")).getAttribute("value"));
		
		System.out.println("Login Button Height : " +driver.findElement(By.name("login")).getSize().height);
		System.out.println("Login Button Width  : " +driver.findElement(By.name("login")).getSize().width);
		
		
		
		driver.quit();
		
	}
}
