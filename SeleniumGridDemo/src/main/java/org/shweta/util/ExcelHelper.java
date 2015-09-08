package org.shweta.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;

public class ExcelHelper {

	private String filePath;//path of the file where it is physically located
	private FileInputStream fis;//inputstream for file
	private Workbook workbook;//Excel File
	//Consructor which takes the filePath as input and then initialises the member variable filepath
	//Create a workbook using fileInputStream 
	//The constructor creates a workbook object which points to our EXcel Filepath
	public ExcelHelper(String filePath)
	{
		this.filePath = filePath;
		try{
			fis = new FileInputStream(filePath);
			//Create the workbook object 
			workbook = WorkbookFactory.create(fis);
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	//returns the filePath 
	public String getFilePath()
	{
		return filePath;
	}
	
	//returns the nummber of rows present in the WorkSheet
	public int getRowCount(String sheetName)
	{
		try
		{
			return workbook.getSheet(sheetName).getPhysicalNumberOfRows();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			return 0;
		}
	}
	//returns the nummber of Columns present in the WorkSheet for a particular row 
		public int getCellCount(String sheetName , int rowNumber)
		{
			try
			{
				return workbook.getSheet(sheetName).getRow(rowNumber-1).getPhysicalNumberOfCells();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
				return 0;
			}
		}
	
		//Get the data present in the cell 
		//Input SheetName , rowNumber , colNumber
		public String getCellData(String sheetName ,int colNumber, int rowNumber )
		{
			try
			{	
				return workbook.getSheet(sheetName).getRow(rowNumber-1).getCell(colNumber-1).toString();
			}catch(NullPointerException e)
			{
				System.out.println(e.getMessage());
				return " ";
			}
		}
	
		//Write the cellValue in the 'SheetName' at row rowNumbwe nd col 'colnumber'
		public void setCellData(String sheetName , int colNumber ,int rowNumber , String cellValue)
		{
			Cell  cell;
			Row  row;
			//set cell value
			//if the row or col is not present then you might neeed to create it first
			try{
			cell = workbook.getSheet(sheetName).getRow(rowNumber-1).getCell(colNumber-1);
			}catch(Exception e)
			{
				row = workbook.getSheet(sheetName).createRow(rowNumber-1);
				cell = row.createCell(colNumber-1);
			}
			
			cell.setCellValue(cellValue);
			//fileoutput stream
			
			//write 
			//close fos
			try{
				FileOutputStream fos = new FileOutputStream(filePath);
				workbook.write(fos);
				fos.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
		//return the row number if the cellValue matches
		public int getRowNumber(String sheetName,int colNumber, String cellValue)
		{

			
			Iterator<Row> itr  = workbook.getSheet(sheetName).rowIterator();
			while(itr.hasNext())
			{
				Row row = itr.next();
				try{
					if(row.getCell(colNumber-1).toString().equals(cellValue))
					{
						return row.getRowNum()+1;
					}
				}catch(NullPointerException e)
				{
					continue;
				}
			}
			return -1;
			
		}

	// return the row number if the cellValue matches
	public int getColNumber(String sheetName, int rowNumber, String cellValue) 
	{

		try{
			Row row = workbook.getSheet(sheetName).getRow(rowNumber);
			Iterator<Cell> itr = row	.cellIterator();	
		while (itr.hasNext()) 
		{
			Cell cell = itr.next();	
			if (cell.toString().equals(cellValue)) 
			{
				return cell.getColumnIndex() +1;
			}
			
		}
		return -1;

	}catch(NullPointerException e)
	{
		return -1;
	}
		
	}	

}
