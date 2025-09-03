package edu.westga.cs1302.lab2.test.view.bill_view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.Bill;
import edu.westga.cs1302.lab2.model.BillItem;
import edu.westga.cs1302.lab2.view.BillView;


class TestGetText {

	@Test
	public void testViewBillWithOneItem() {
		Bill myBill = new Bill();
		BillItem apple = new BillItem("apple", 3.0);
		BillView billView = new BillView();
		String bill; 
		
		myBill.addItem(apple);
		bill = billView.getText(myBill);
		
		assertEquals(bill.substring(0, 5), "ITEMS");
		assertEquals(bill.substring(7, 12), "apple");
		assertEquals(bill.substring(25, 37), "TOTAL - $3.0");
		
		System.out.print(bill);

	}
	
	@Test
	public void testViewBillWithTwoItems() {
		Bill myBill = new Bill();
		BillItem apple = new BillItem("apple", 3.0);
		BillItem pear = new BillItem("pear", 4.0);
		BillView billView = new BillView();
		String bill; 
		
		myBill.addItem(apple);
		myBill.addItem(pear);
		bill = billView.getText(myBill);
		System.out.print(bill);
		
		assertEquals(bill.substring(0, 5), "ITEMS");
		assertEquals(bill.substring(7, 12), "apple");
		assertEquals(bill.substring(20, 24), "pear");
		assertEquals(bill.substring(105, 117), "TOTAL - $9.1");
		
		
	

	}
}


