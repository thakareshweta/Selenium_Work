package org.shweta.tests;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSetInterface {

	public static void main(String[] args) {
	
		Set<String> products = new HashSet<String>();
		products.add("IPhone");
		products.add("Tablet");
		products.add("Desktop");
		products.add("Tablet");
		products.add("Desktop");
		//Print out the count of elements in the set
		
		System.out.println("Count is :" +products.size());
		
		Iterator<String> itr = products.iterator();
		
		for(int i=0;i< products.size();i++)
		{
			System.out.println(itr.next());
		}

		
		System.out.println("-----------------------");
		
		for(String prod: products)
		{
			System.out.println(prod);
		}
	}

}
