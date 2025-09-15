package edu.westga.cs1302.bill.test.model.bill_calculator;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.BillItem;
import edu.westga.cs1302.bill.model.BillCalculator;

class TestGetSubTotal {
	
	@Test
	void testGetSubTotalWithOne() {
		BillItem[] billArray = new BillItem[1];
		BillItem tea = new BillItem("tea", 3.0);
	
		billArray[0] = tea;
		
		double cost = 0;
		
		cost = BillCalculator.getSubTotal(billArray);
		
		
		assertEquals(cost, 3.0);
	}
	
	@Test
	void testGetSubTotalWithMultiple() {
		BillItem[] billArray = new BillItem[2];
		BillItem tea = new BillItem("tea", 3.0);
		BillItem cream = new BillItem("cream", 1.0);
	
		billArray[0] = tea;
		billArray[1] = cream;
		
		double cost = 0;
		
		cost = BillCalculator.getSubTotal(billArray);
		
		
		assertEquals(cost, 4.0);
	}
	
	@Test
	void testGetSubTotalNull () {
		BillItem[] billArray = new BillItem[2];
		
		assertThrows(NullPointerException.class, ()->{BillCalculator.getSubTotal(billArray);});
		
	}

}
