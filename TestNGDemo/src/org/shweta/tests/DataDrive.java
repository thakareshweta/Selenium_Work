package org.shweta.tests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataDrive {
	
  @Test(dataProvider = "getIndeedJobSearchParam")
  
  public void f(String keyword , String location) {
	  
  }

  @DataProvider
  public Object[][] getIndeedJobSearchParam() {
    
	  return new Object[][] {
		  new Object[] { "Selenium", "London" },
		  new Object[] { "Cucumber", "Chicago" },
		  new Object[] { "Testing", "Indianapolis" },
    };
    
  }
}
