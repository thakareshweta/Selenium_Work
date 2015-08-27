package org.shweta.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {
	/* 
	 * Get Attributes of the link
	 * Partial Link
	 * 
	 */
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://test1.absofttrainings.com/shop/");
		System.out.println("The link url is : "+driver.findElement(By.partialLinkText("Samsung Phone")).getAttribute("href"));
		System.out.println("The link url is : "+driver.findElement(By.partialLinkText("Samsung Phone")).getText());
		
		
		System.out.println("Price of the phone is : " +driver.findElement(By.partialLinkText("Samsung Phone")).getAttribute("price"));
		driver.findElement(By.partialLinkText("Samsung Phone")).click();
		
		//To find the element there are 2 ways 
		// Create the webelement and find the relative elements 
		// Use Xpath
		
		
		//1. first get the WebElement 
		
		WebElement cart = driver.findElement(By.className("cart"));
		cart.findElement(By.name("quantity")).sendKeys("5");
		
		Thread.sleep(5000);
		
		System.out.println("The quantity is : "+cart.findElement(By.name("quantity")).getAttribute("value"));
		
		driver.findElement(By.xpath("//div[@id='product-63']/div[2]/form/div/input")).clear();
		driver.findElement(By.xpath("//div[@id='product-63']/div[2]/form/div/input")).sendKeys("fi");
		Thread.sleep(5000);
		System.out.println("The quantity using xpath  is : "+cart.findElement(By.name("quantity")).getAttribute("value"));
		Thread.sleep(5000);
		
		
		driver.quit();
		
	}

}
