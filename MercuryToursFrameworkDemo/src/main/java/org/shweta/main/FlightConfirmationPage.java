package org.shweta.main;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FlightConfirmationPage extends PageBase{

	public FlightConfirmationPage(WebDriver driver) throws IOException
	{
		super(driver);
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(imgFile, new File("resources/test1.png"));
		
	}
		
}
