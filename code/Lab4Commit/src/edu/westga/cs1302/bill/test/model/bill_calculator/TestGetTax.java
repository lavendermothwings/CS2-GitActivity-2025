package edu.westga.cs1302.bill.test.model.bill_calculator;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;

class TestGetTax {
	
	@Test
	void testGetTaxOneItem () {
		BillItem[] billArray = new BillItem[1];
		BillItem tea = new BillItem("tea", 3.0);
	
		billArray[0] = tea;
		
		double tax = 0;
		
		tax = BillCalculator.getTax(billArray);
		
		assertEquals(tax, .30);
	}
	
	@Test
	void testGetTaxMultipleItems () {
		BillItem[] billArray = new BillItem[2];
		BillItem tea = new BillItem("tea", 3.0);
		BillItem cream = new BillItem("cream", 1.0);
	
		billArray[0] = tea;
		billArray[1] = cream;
		
		double tax = 0;
		
		tax = BillCalculator.getTax(billArray);
		
		assertEquals(tax, .4);
	}
	
	@Test
	void testGetTaxNull () {
		BillItem[] billArray = new BillItem[2];
		
		assertThrows(NullPointerException.class, ()->{BillCalculator.getTax(billArray);});
		
	}

}
