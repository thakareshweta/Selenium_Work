package org.shweta.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWebElements {
	public static void main (String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://test1.absofttrainings.com/");
		
		List<WebElement> menus = driver.findElements(By.xpath("//nav[@id='top-menu-nav']/ul/li/a"));
		
		System.out.println("Total Webelements found are : " + menus.size());
		for (WebElement menu:menus)
		{
			System.out.println(menu.getText() + " Url is : " + menu.getAttribute("href") );
		}
		
	}

}
