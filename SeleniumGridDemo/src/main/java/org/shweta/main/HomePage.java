package org.shweta.main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public MyAccountPage clickMyAccountLink()
	{
		driver.findElement(By.linkText("My Account")).click();
		return new MyAccountPage(driver);
	}
	
	public ShopPage clickShopLink()
	{
		driver.findElement(By.linkText("Shop")).click();
		return new ShopPage(driver);
	}
	
	
}
