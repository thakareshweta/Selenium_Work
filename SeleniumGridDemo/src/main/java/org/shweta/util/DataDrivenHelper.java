package org.shweta.util;

public class DataDrivenHelper extends ExcelHelper {
	
	//Specify the column number where all the testcases names are written.
	public final static int testNameColumn  =1 ;
	//column number from where the testData begins
	public final static int testDataStartColumn = 2;
	
	//Constructor which takes Excel path as input and then passes it to Super i.e. ExcelHelper class 
	public DataDrivenHelper(String filePath)
	{
		super(filePath);
		
	}
	
	//This will return the test case data set 
	public Object[][] getTestCaseDataSets(String sheetName,String testName)
	{
		int testRowNumber = getRowNumber(sheetName,testNameColumn,testName);
		int testDataStartRow = testRowNumber +1;
			
		//calcuate test data row count
		int testDataRows = 0;
		for(int i = testDataStartRow ; getCellData(sheetName ,testNameColumn , i ).equals(testName);i++)
		{
			testDataRows++;
		}
		//calculate test Data column count
		int testDataCols = getCellCount(sheetName ,testRowNumber ) - testDataStartColumn +1;
		
		//Define two dimensional Array Object to hold test Sets
		Object[][] testCaseDataSets = new Object[testDataRows][testDataCols];
		
		for(int i =0;i< testDataRows ; i++)
		{
			for(int j=0;j<testDataCols;j++)
			{
				testCaseDataSets[i][j] = getCellData(sheetName, testDataStartColumn+j,testDataStartRow+ i);
			}
		}
		return testCaseDataSets;
	}
	
	

}
