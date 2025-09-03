package edu.westga.cs1302.lab2.test.model.bill_item;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.Bill;
import edu.westga.cs1302.lab2.model.BillItem;

class TestConstructor {

	//test: billitem null name, billitem 0 or neg, billitem name, billitem amount
	
	@Test
	void testBillItemName() {
		BillItem apple = new BillItem("apple", 3.0);
		assertEquals(apple.getName(), "apple");		
	}
	
	
	@Test
	void testBillItemAmount() {
		BillItem apple = new BillItem("apple", 3.0);
		assertEquals(apple.getAmount(), 3.0);		
	}
	
	@Test
	void testBillItemNameIsNull() {
		assertThrows(IllegalArgumentException.class,
				() -> new BillItem(null, 3.0));
	}

	@Test
	void testBillItemAmountIsZero() {
		assertThrows(IllegalArgumentException.class,
				() -> new BillItem("apple", 0));
	}
	
	@Test
	void testBillItemAmountIsNegative() {
		assertThrows(IllegalArgumentException.class,
				() -> new BillItem("apple", -1));
	}
}
