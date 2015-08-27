package org.shweta.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {
	
	
	/* typical Action for radio button are
	 * Getting the default state
	 * Selecting the radio button
	 * getting the current state
	 * getting the attribute
	 */
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new FirefoxDriver();
			driver.get("http://test1.absofttrainings.com/");
			
			driver.findElement(By.xpath("//article[@id='post-4']/div/div[2]/div/div/div/div/ul/li[5]/a/h3")).click();
			driver.findElement(By.className("single_add_to_cart_button")).click();
			
			//driver.findElement(By.className("wc-forward")).click();
			driver.findElement(By.linkText("View Cart")).click();
			driver.findElement(By.className("checkout-button")).click();
			
			
			//radio buttons check if the button is selected or not 
			System.out.println("The default state for BACS is : " + driver.findElement(By.id("payment_method_bacs")).isSelected());
			
			System.out.println("The default state for Check is : " +driver.findElement(By.id("payment_method_cheque")).isSelected());
			System.out.println("The default state for Paypal is : "  +driver.findElement(By.id("payment_method_paypal")).isSelected());
			
			Thread.sleep(5000);
			System.out.println("-------------After Clicking-------------------");
			driver.findElement(By.id("payment_method_paypal")).click();
			System.out.println("The default state for BACS is : " + driver.findElement(By.id("payment_method_bacs")).isSelected());			
			System.out.println("The default state for Check is : " +driver.findElement(By.id("payment_method_cheque")).isSelected());
			System.out.println("The default state for Paypal is : "  +driver.findElement(By.id("payment_method_paypal")).isSelected());
			
			
			//driver.quit();
		}

}
