package org.shweta.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxWebApplication {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		//Go to expedia website
		driver.get("http://www.expedia.com/");
		//click on flight's tab id = "tab-flight-tab"
		driver.findElement(By.id("tab-flight-tab")).click();
		//type new in the Flight Origin TextBox  id= flight-origin
		driver.findElement(By.id("flight-origin")).sendKeys("Indian");
		//wait till the ajax box comes up
		//Lets wait explicilty
		
		WebDriverWait wdWait = new	WebDriverWait(driver,30);
		wdWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='results']/li/a")));
		
		
		//get all the elements from the ajax box
		
		List<WebElement> locationList = driver.findElements(By.xpath("//ul[@class='results']/li/a"));
		// print the total nr of elements present in the ajax box
		System.out.println("Total nr of locations are : "+ locationList.size());
		// print all the elements 
		for(WebElement location : locationList)
		{
			System.out.println(location.getText());
		}
		
		//click on the second element
		//driver.findElement(By.xpath("//ul[@class='results']/li[2]/a")).click();
		
		driver.findElement(By.xpath("//ul[@class='results']/li/a[contains(.,'Pitts')]")).click();
		
		
		// quit the browser
		driver.quit();
		
		
	}

}
