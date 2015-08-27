package org.shweta.tests;

import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Open Shop page		
		driver.get("http://test1.absofttrainings.com/shop/");
		System.out.println("Main window handle is :"+driver.getWindowHandle());
		Thread.sleep(2000);
		//print window size
		System.out.println("Initial Window size is: "+ driver.getWindowHandles().size());		
		//Open facebook link
		driver.findElement(By.xpath("//a[@title='facebook']")).click();		
		//print total window count
		System.out.println("windows after opening facebook link: "+driver.getWindowHandles().size());
		System.out.println("FaceBook window handle is :"+driver.getWindowHandle());	
		//open Security link
		driver.findElement(By.id("sitelock")).click();
		//print window size
		System.out.println("SiteLock window handle is :"+driver.getWindowHandle());
		System.out.println("Windows after opening sitelock Link : " + driver.getWindowHandles().size());
		//Create an iterator instance to iterate through window handles		
		Iterator<String> whIterator = driver.getWindowHandles().iterator();
		String mainWindow = whIterator.next();
		String fbWindow = whIterator.next();
		String siteLockWindow = whIterator.next();
		Thread.sleep(2000);
		
		//Switch to  facebook window
		driver.switchTo().window(fbWindow);
		//Enter username password and click Ok
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.id("u_0_0")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		Thread.sleep(2000);
		//Switch to SiteLock Window
		driver.switchTo().window(siteLockWindow);
		Thread.sleep(2000);
		//print the domain nam1e
		System.out.println("The Domain name is :" + driver.findElement(By.xpath("//table[@id='inner-table']/tbody/tr[contains(.,'Domain')]/td[2]")).getText());
		//close the window
			
		driver.close();				
		driver.switchTo().window(mainWindow);
		driver.findElement(By.partialLinkText("Apple IPhone")).click();
				
		Thread.sleep(2000);		
		//close/quit the browser
		driver.close();
		//driver.quit();
	}
}
