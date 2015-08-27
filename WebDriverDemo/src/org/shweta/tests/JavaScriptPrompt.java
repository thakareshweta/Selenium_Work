package org.shweta.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptPrompt {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
		driver.findElement(By.id("prompt")).click();
		Alert jsPromptAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("The Alert Text is : "+jsPromptAlert.getText());
		jsPromptAlert.sendKeys("Shweta");
		Thread.sleep(2000);
		jsPromptAlert.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
	}

}
