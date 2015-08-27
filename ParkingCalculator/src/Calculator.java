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
		
	
		//close the driver
		driver.quit();
	
	}
	
	
	
	
	
}
