package org.shweta.test;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class FlightReservationTest extends TestBase{
	 

	  @Test(dataProvider="dataProvider")	 
	   public void testFlightReservation(String userName , String password, 
			   String passCount,
			   String fromCity , String toCity ,String departDate , String departMonth , String returnDate , String returnMonth
			   ) throws InterruptedException, IOException{
		 // SelectFlightPage testResult =  
		  String title = homePage.clickSignOnLink()
		  			.loginAs(userName,password)
		  			.setReservationValues( passCount, fromCity ,  toCity, departDate , departMonth , returnDate, returnMonth).selectOutFlight().addPassengerDetails().getTitle();
		 // Assert.assertTrue(title , "Selection is unsuccessful!!");
		  System.out.println("Title is : "+title);
		  Assert.assertEquals(title, "Flight Confirmation: Mercury Tours");
		  
	   }
}
