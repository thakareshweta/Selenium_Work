package org.shweta.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicLists {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException
	{
		 driver = new FirefoxDriver();
			driver.get("http://test1.absofttrainings.com/shop/");
			WebElement dropdownElement  = driver.findElement(By.name("orderby"));
			Select sortOrder  = new Select(dropdownElement);	
			
			System.out.println("The first selected value is : " + sortOrder.getFirstSelectedOption().getText());
			Thread.sleep(5000);
			sortOrder.selectByVisibleText("Sort by newness");
			Thread.sleep(2000);
			
			dropdownElement  = driver.findElement(By.name("orderby"));
			sortOrder  = new Select(dropdownElement);
			////div[@id='product-63']/div[2]/form/div/input
			
			//select[@name='orderby']/options/value
			System.out.println("The Current selected value is : " + sortOrder.getFirstSelectedOption().getText());
			
			
			sortOrder.selectByValue("rating");
			
			Thread.sleep(2000);
			dropdownElement  = driver.findElement(By.name("orderby"));
			sortOrder  = new Select(dropdownElement);
			
			System.out.println("The Current selected value is : " + sortOrder.getFirstSelectedOption().getText());
			
			List<WebElement> options = sortOrder.getOptions();
			System.out.println("Options count is : " + options.size());
			for(WebElement element : options)
			{
				System.out.println("Element is " + element.getText());
			}
			driver.quit();

	}
	
	public static boolean isElementPresent(By by)
	{
		try
		{
			driver.findElement(by);
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
}
