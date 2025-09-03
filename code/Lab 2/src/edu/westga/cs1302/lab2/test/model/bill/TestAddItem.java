package edu.westga.cs1302.lab2.test.model.bill;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.Bill;
import edu.westga.cs1302.lab2.model.BillItem;

class TestAddItem {

	
				@Test
				
				public void testAddOneItem() {
				
					Bill myBill = new Bill();
					BillItem apple = new BillItem("apple", 3.0);
					
					myBill.addItem(apple);
					ArrayList<BillItem> foodBill = new ArrayList<>();
					foodBill = myBill.getItems();
					int countItems = 0;
					int il;
					for  (il = 0; il < foodBill.size(); ++il) {
						
						countItems += 1;
					}
					
					assertEquals(countItems, 1);	
				}	
				
				
				@Test
							
				public void testAddTwoItems() {
								
					Bill myBill = new Bill();
					BillItem apple = new BillItem("apple", 3.0);
					BillItem pear = new BillItem("pear", 1.5);
					myBill.addItem(apple);
					myBill.addItem(pear);
					ArrayList<BillItem> foodBill = new ArrayList<>();
					foodBill = myBill.getItems();
					int countItems = 0;
								
					for (int il = 0; il < foodBill.size(); ++il) {
									
							countItems += 1;
					}
								
							assertEquals(countItems, 2);
						
						}

					
			@Test
         			
         	public void testAddThreeItems() {
         				
         			Bill myBill = new Bill();
         			BillItem apple = new BillItem("apple", 3.0);
         			BillItem pear = new BillItem("pear", 1.5);
         			BillItem strawberry = new BillItem("Strawberry", 1.5);
         			myBill.addItem(apple);
         			myBill.addItem(pear);
         			myBill.addItem(strawberry);
         			ArrayList<BillItem> foodBill = new ArrayList<>();
         			foodBill = myBill.getItems();
         			int countItems = 0;
         				
         			for (int il = 0; il < foodBill.size(); ++il) {
         					
         				countItems += 1;
         			}
         				
         				assertEquals(countItems, 3);	
         			}
}
