package edu.westga.cs1302.bill.test.model.bill_calculator;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;

class TestGetTotal {

	@Test
	void testGetTotalWithOne () {
		BillItem[] billArray = new BillItem[1];
		BillItem tea = new BillItem("tea", 3.0);
	
		billArray[0] = tea;
		
		double total = 0;
		
		total = BillCalculator.getTotal(billArray);
		
		assertEquals(total, 3.9);
		
	}
	
	
	@Test
	void testGetTotalWithMultiple () {
		BillItem[] billArray = new BillItem[2];
		BillItem tea = new BillItem("tea", 3.0);
		BillItem cream = new BillItem("cream", 1.0);
	
		billArray[0] = tea;
		billArray[1] = cream;
		
		double total = 0;
		
		total = BillCalculator.getTotal(billArray);
		
		assertEquals(total, 5.2);
		
	}
	
	@Test
	void testGetTotalNull () {
		BillItem[] billArray = new BillItem[2];
		
		assertThrows(NullPointerException.class, ()->{BillCalculator.getTip(billArray);});
		
	}
}
