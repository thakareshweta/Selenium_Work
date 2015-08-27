import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Calculator {
	
	public static void main(String[] args){

		WebDriver driver = new FirefoxDriver();
		driver.get("http://adam.goucher.ca/parkcalc/index.php");
	    Select lotList = new Select(driver.findElement(By.id("Lot")));
	    lotList.selectByVisibleText("Economy Parking");
	    
	    driver.findElement(By.id("EntryTime")).clear();
	    driver.findElement(By.id("EntryDate")).clear();
	    driver.findElement(By.id("EntryTime")).sendKeys("12:00");
	    driver.findElement(By.id("EntryDate")).sendKeys("08/27/2015");
	    driver.findElement(By.xpath("//input[@name='EntryTimeAMPM'][2]")).click();
	    
	  //input[@name='EntryTimeAMPM' and @value='PM']
	    ////input[@name='EntryTimeAMPM'][2]
	    
	    driver.findElement(By.id("ExitTime")).clear();
	    driver.findElement(By.id("ExitDate")).clear();

	    driver.findElement(By.id("ExitTime")).sendKeys("12:00");
	    driver.findElement(By.id("ExitDate")).sendKeys("08/28/2015");

	    driver.findElement(By.name("Submit")).click();
	    //close the driver
		//driver.quit();
	
	}
	
	
	
	
	
	
	
}
