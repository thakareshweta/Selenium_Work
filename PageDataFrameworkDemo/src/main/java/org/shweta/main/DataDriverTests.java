package org.shweta.main;

import org.shweta.util.DataDrivenHelper;

public class DataDriverTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataDrivenHelper ddh = new DataDrivenHelper("F:/Shweta/workspace/Selenium/DataDrivenFrameworkDemo/resources/MasterData.xlsx");
		Object testData[][]= ddh.getTestCaseDataSets("TestData", "testSuccessfulLogin");
		
		for(Object[] testRow : testData)
		{
			for(Object testCell : testRow )
			{
				System.out.println("Cell Data is : " + testCell.toString());
			}
		}
	}
}
