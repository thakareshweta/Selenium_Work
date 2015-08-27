package org.shweta.main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends PageBase{
	
	
	public MyAccountPage(WebDriver driver) {
	
			super(driver);
	}

	
	public MyAccountPage loginAs(String userName, String password)
	{
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		return new MyAccountPage(driver);
	}
	
	public boolean isloginSuccessful(String userName)
	{
		return driver.findElement(By.className("myaccount_user")).getText().contains(userName);
		
	}

}
