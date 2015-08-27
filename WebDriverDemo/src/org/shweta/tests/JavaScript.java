package org.shweta.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		//now the alert box will be displayed.
		//This switch to alert changes the control to the java script alert box
		//Similarly we can switch to another frame as well
		Alert jsAlert = driver.switchTo().alert();
		System.out.println(jsAlert.getText());
		Thread.sleep(3003);
		jsAlert.accept();
		driver.switchTo().defaultContent();
		System.out.println("THe Go button : "+driver.findElement(By.name("proceed")).getAttribute("value"));
		
	}

}
