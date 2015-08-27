package org.shweta.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableActions {
	public static void main (String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://test1.absofttrainings.com/how-to-use/");
		driver.get("https://ca.finance.yahoo.com/gainers?e=TO");
			
		//WebTable webTable = new WebTable(driver.findElement(By.xpath("//table[@id='testaccounts']")));
		WebTable webTable = new WebTable(driver.findElement(By.xpath("//div[@id='yfitp']/table")));
		
		System.out.println("getCellElement(2,2)  :" +webTable.getCellElement(2, 2).getText());
		System.out.println("getCellElement(user5).getText  :" +webTable.getCellElement("BIOX").getText());
		System.out.println("getCellText(4,2)  :" +webTable.getCellText(4, 2));
		System.out.println("getColCount  :" +webTable.getColCount());
		System.out.println("getRowCount  :" +webTable.getRowCount());
		
		System.out.println("getRowElement(3)  :" +webTable.getRowElement(3).getText());
		System.out.println("getRowElement(pwd)  :" +webTable.getRowElement("BIOX").getText());
		System.out.println("----------Get Text Displayed in all rows ----------");
		String[][] rowText = webTable.getTextDisplayedInAllRows();
		for(String[] row:rowText)
		{
			for(String cell:row)
			{
				System.out.print(cell+" ");
			}
		}
		System.out.println("-------------------------------------------");
		
		String[] colText = webTable.getTextDisplayedInCol(2);
		for(String col: colText)
		{
			System.out.println(col);
		}
		System.out.println("-------------------------------------------");
		
		String [] tableRowText = webTable.getTextDisplayedInRow(2);
		for(String row: tableRowText)
		{
			System.out.println(row);
		}
		
		System.out.println("-------------------------------------------");
		
		
		driver.quit();
	}

}
