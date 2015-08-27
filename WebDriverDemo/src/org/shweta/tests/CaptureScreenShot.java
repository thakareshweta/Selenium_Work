package org.shweta.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CaptureScreenShot {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/ajax-and-dynamic-html-behaviour/");
		Thread.sleep(2000);
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(imgFile, new File("F:\\Shweta\\workspace\\ScreenShots\\test1.png"));
		driver.quit();
		
	}	
}
