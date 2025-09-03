package edu.westga.cs1301.library.test.book;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.library.model.Book;

class TestConstructor {
	

	@Test
	public void TestTitleCannotBeNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book (null, "Card", 1980, 5, 2.00);
		});
	}
	
	@Test
	public void TestTitleCannotBeEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book ("", "Card", 1980, 5, 2.00);
		});
	}
	
	@Test
	public void TestAuthorCannotbeNull () {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book ("Speaker of the Dead", null, 1980, 5, 2.00);
		});
	}
	
	@Test
	public void TestAuthorCannotBeEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book ("Speaker of the Dead", "", 1980, 5, 2.00);
		});
	}
	
	@Test
	public void TestYearBefore1900() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book ("Speaker of the Dead", "Card", 1899, 5, 2.00);
		});
	}
	
	@Test
	public void TestYearIsOneAboveMinimum() {
		Book newBook = new Book("Speaker of the Dead", "Card", 1901, 5, 2.00);
		assertEquals(1901, newBook.getPublishYear());
	}
	
	@Test
	public void TestYearIsAtMinimum() {
		Book newBook = new Book("Speaker of the Dead", "Card", 1900, 5, 2.00);
		assertEquals(1900, newBook.getPublishYear());
	}
	
	
	@Test
	public void TestYearAfter3000() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book ("Speaker of the Dead", "Card", 3001, 5, 2.0);
		});
	}
	
	@Test
	public void TestRatingIsBelowMinimum() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book ("Speaker of the Dead", "Card", 1980, 0, 2.00);
		});
	}
	
	@Test
	public void TestRatingIsAtMinimum() {
		Book newBook = new Book("Speaker of the Dead", "Card", 1980, 1, 2.00);
		assertEquals(1, newBook.getRating());
	}
	
	@Test
	public void TestRatingIsAtMaximum() {
		Book newBook = new Book("Speaker of the Dead", "Card", 1980, 5, 2.00);
		assertEquals(5, newBook.getRating());
	}
	
	@Test
	public void TestRatingIsAboveMaximum() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book ("Speaker of the Dead", "Card", 1980, 6, 2.00);
		});
	}
	
	@Test
	public void TestPriceIsBelowMinimum() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Book ("Speaker of the Dead", "Card", 1980, 5, .98);
		});
	}
	
	@Test
	public void TestPRiceIsAtMinimum() {
		Book newBook = new Book("Speaker of the Dead", "Card", 1980, 5, .99);
		assertEquals(.99, newBook.getPrice());
	}
	
	@Test
	public void TestPRiceIsAboveMinimum() {
		Book newBook = new Book("Speaker of the Dead", "Card", 1980, 5, 1.00);
		assertEquals(1.00, newBook.getPrice());
	}

}
