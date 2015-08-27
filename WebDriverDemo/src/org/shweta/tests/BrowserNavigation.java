package org.shweta.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://test1.absofttrainings.com/");
		
		driver.findElement(By.xpath("//article[@id='post-4']/div/div[2]/div/div/div/div/ul/li[5]/a/h3")).click();
		driver.findElement(By.className("single_add_to_cart_button")).click();
		
		//driver.findElement(By.className("wc-forward")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("View Cart")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		//VerifyCartPage();
		Thread.sleep(2000);
		
		driver.navigate().back();
		//VerifyCartPage();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		//VerifyCartPage();
		Thread.sleep(2000);
		driver.navigate().to("http://test1.absofttrainings.com/how-to-use/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Page Title is : " + driver.getTitle());
		System.out.println("Page url is : " + driver.getCurrentUrl());
		System.out.println("Page source : "+driver.getPageSource());
		driver.quit();

	}

}
