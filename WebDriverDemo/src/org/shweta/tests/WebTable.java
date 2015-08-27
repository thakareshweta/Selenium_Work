package org.shweta.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/* This is a helper class which has been desgined to perform table operation.
 * 
 */
public class WebTable {

	private WebElement _webTable;
	
	//Constructor
	public WebTable(WebElement webTable)
	{
		_webTable = webTable;
	}
	
	public  WebElement getWebTable()
	{
		return _webTable;
	}
	
	public int getRowCount()
	{
		return  _webTable.findElements(By.xpath("tbody/tr")).size();
	}
	
	public int getColCount()
	{
		//return  _webTable.findElements(By.xpath("thead/td")).size();
		WebElement firstRow = _webTable.findElement(By.xpath("tbody/tr"));
		return firstRow.findElements(By.tagName("td")).size();
		
	}
	
	public  WebElement getRowElement(int rowNumber)
	{
			return _webTable.findElement(By.xpath("tbody/tr["+rowNumber+"]"));
	}
	public  WebElement getCellElement(int rowNumber, int colNumber)
	{
			return _webTable.findElement(By.xpath("tbody/tr["+rowNumber+"]/td["+colNumber+"]"));
	}
	
	public  String getCellText(int rowNumber, int colNumber)
	{
			return getCellElement(rowNumber,colNumber).getText();
	}
	public  String[] getTextDisplayedInRow(int rowNumber)
	{		
			int colCount = getColCount();
			String[] rowText = new String[colCount];
			for (int i=1;i<=colCount;i++)
			{
				rowText[i-1] =  getCellText(rowNumber , i);
			}
			return rowText;
			//return getRowElement(rowNumber).getText();
	}
	
	public  String[] getTextDisplayedInCol(int colNumber)
	{		
			int rowCount = getRowCount();
			String[] colText = new String[rowCount];
			for (int i=1;i<=rowCount;i++)
			{
				colText[i-1] =  getCellText(i , colNumber);
			}
			return colText;
			//return getRowElement(rowNumber).getText();
	}
	
	public String[][] getTextDisplayedInAllRows()
	{
		int colCount = getColCount();
		int rowCount = getRowCount();
		String[][] rowColText = new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=1;j<=colCount;j++)
			{
				rowColText[i-1][j-1] = getCellText(i,j);
			}
		}
		return rowColText;
	}
	
	public WebElement getCellElement(String cellText)
	{
		String cellXPath = "tbody/tr/td[contains(.,'"+cellText +"')]";
		return _webTable.findElement(By.xpath(cellXPath));
				
	}

	public WebElement getRowElement(String rowText)
	{
		String rowXPath = "tbody/tr[contains(.,'"+rowText +"')]";
		return _webTable.findElement(By.xpath(rowXPath));
	}
	
}
