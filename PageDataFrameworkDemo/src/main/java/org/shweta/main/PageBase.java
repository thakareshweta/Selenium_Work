package org.shweta.main;

import org.openqa.selenium.WebDriver;

public class PageBase {
	protected WebDriver driver;
	
	
	public PageBase(WebDriver driver)
	{
		this.driver = driver;
	}
	public String getTitle()
	{
		return driver.getTitle();
	}

}
