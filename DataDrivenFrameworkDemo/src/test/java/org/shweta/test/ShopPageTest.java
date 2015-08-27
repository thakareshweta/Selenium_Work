package org.shweta.test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopPageTest extends TestBase{
	
	  @Test
	  public void testSortOrder() {
		 String sortOrder = homePage.clickShopLink().setSortOrder("Sort by average rating").getSortOrder();
		 Assert.assertTrue(sortOrder.equals("Sort by average rating") , "The Sort Order does not match");
		 
	  }
}
