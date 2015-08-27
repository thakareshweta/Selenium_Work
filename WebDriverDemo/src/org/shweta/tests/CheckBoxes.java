package org.shweta.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for checkboxes typical actions are
		 * Getting the state 
		 * checking
		 * unchecking
		 * getting attributes
		 * isSelected gives the state of the checkbox
		 * 
		
		 */
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String baseUrl = "http://test1.absofttrainings.com/my-account/";
		driver.get(baseUrl);
		
		System.out.println("Default state is : " +driver.findElement(By.id("rememberme")).isSelected());
		driver.findElement(By.id("rememberme")).click();
		System.out.println("Updated state is : " +driver.findElement(By.id("rememberme")).isSelected());
		
		CheckBox cb = new CheckBox(driver.findElement(By.id("rememberme")));
		System.out.println("Default state is : " +driver.findElement(By.id("rememberme")).isSelected());
		
		cb.check();
		System.out.println("After Check:  state is : " +driver.findElement(By.id("rememberme")).isSelected());
		
		cb.uncheck();
		System.out.println("After Uncheck is : " +driver.findElement(By.id("rememberme")).isSelected());
		
		cb.check();
		driver.close();
		
		

	}

}
