package org.shweta.main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public SignOnPage clickSignOnLink()
	{
		driver.findElement(By.linkText("SIGN-ON")).click();
		return new SignOnPage(driver);
	}
	
	
}
