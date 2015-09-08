package org.shweta.test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopPageTest extends TestBase{
	
	  @Test(dataProvider="dataProvider")
	  public void testSortOrder(String sortOrderInput) {
		 String sortOrder = homePage.clickShopLink().setSortOrder(sortOrderInput).getSortOrder();
		 Assert.assertTrue(sortOrder.equals(sortOrderInput) , "The Sort Order does not match");
		 
	  }
}
