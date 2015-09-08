package org.shweta.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException{
		//HSSF excel 97-2003
		
		//XSSF 2007+
		
		//SS USer Model
		
		FileInputStream fis = new FileInputStream("F:/Shweta/workspace/Selenium/DataDrivenFrameworkDemo/resources/MasterData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		
		//reading the values
		Sheet dataSheet = wb.getSheet("TestData");
		//POI takes the indexes so the row number and col nr begins at 0 . so EXCEL rowNum is POI rowNum-1 and 
		//Excel colNum is POI colNum -1 
		
		
		
		//When you try to read a cell which does not have any value JAva throws null pointer exeception
		//so make sure you hadle exceptions while reading data.
		//get cell element returns the cell element so the method to retrieve should be .geCell(n).toString() or to double etc
		
		
		String Val1;
		String Val2;
		try {
			Val2= dataSheet.getRow(6).getCell(5).toString();
			
		}
		catch(NullPointerException e)
		{
			Val2 = "No value in the Excel";
		}
		System.out.println("The value at row 7 and col 2 is : " +dataSheet.getRow(6).getCell(1));
		System.out.println("The second value is : "+ Val2);
		
		
		//create a worksheet
		Sheet testSheet = wb.getSheet("TestSheet");
		testSheet.createRow(5).createCell(1).setCellValue("Hello World!!!");
		
		//create  a fileoutput stream
		FileOutputStream fos = new FileOutputStream("F:/Shweta/workspace/Selenium/DataDrivenFrameworkDemo/resources/MasterData.xlsx");
		//write 
		wb.write(fos);
		//close outputstream
		fos.close();
		
	}
}
