package edu.westga.cs1302.bill.test.model.bill_calculator;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;

class TestGetTip {
	
	@Test
	void testGetTipWithOne () {
		BillItem[] billArray = new BillItem[1];
		BillItem tea = new BillItem("tea", 3.0);
	
		billArray[0] = tea;
		
		double tip = 0;
		
		tip= BillCalculator.getTip(billArray);
		
		assertEquals(tip, .6);
	}
	
	@Test
	void testGetTipWithMultiple () {
		BillItem[] billArray = new BillItem[2];
		BillItem tea = new BillItem("tea", 3.0);
		BillItem cream = new BillItem("cream", 1.0);
	
		billArray[0] = tea;
		billArray[1] = cream;
		
		double tip = 0;
		
		tip = BillCalculator.getTip(billArray);
		
		assertEquals(tip, .8);
	}
	
	@Test
	void testGetTipNull () {
		BillItem[] billArray = new BillItem[2];
		
		assertThrows(NullPointerException.class, ()->{BillCalculator.getTip(billArray);});
		
	}
	

}
