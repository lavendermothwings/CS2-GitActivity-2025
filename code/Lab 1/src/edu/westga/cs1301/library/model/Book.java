package edu.westga.cs1301.library.model;

//book has squiggles
//what are the params?

/**
 * Class that is Book
 *
 * @author Valor Bright - Spring 2022
 *
 */

public class Book{
	
	public static final double MINIMUM_PRICE = .99;
	private String title;
	private String author;
	private int publishYear;
	private int rating;
	private double price;
	
	/**
	 * Set the default
	 */
	
	public Book() {
		
		this.publishYear = 1900;
		this.price = MINIMUM_PRICE;
		this.rating = 1;
		this.title = null;
		this.author = null;
		
	}
	
	/**
	 * @precondition The title cannot be null and cannot be empty. The author cannot be null
	 * and cannot be empty. The publish year must be after 1900. The price must be greater than
	 * or equal to the minimum price. The rating must be between 1 and 5, inclusive.
	 * @param title  title of book
	 * @param author  author of book
	 * @param publishYear  year book was published
	 * @param rating rating of book
	 * @param price price of book
	 * 
	 * @postcondition getTitle() == title && getAuthor() == author && getPublishYear == publishYear
	 * && getRating() == rating && getPrice() == price && getMinimumPrice() == MINIMUM_PRICE
	 */
	
	public Book(String title, String author, int publishYear, int rating, double price) {
		
		if (title == null) {
			throw new IllegalArgumentException ("Title can not be null");
		}
		
		if (title.isEmpty()) {
			throw new IllegalArgumentException ("Title can not be empty");
		}
		
		if (author == null) {
			throw new IllegalArgumentException ("Author can not be null");
		}
		
		if (author.isEmpty()) {
			throw new IllegalArgumentException ("Author can not be empty");
		}
		
		if (publishYear < 1900) {
			throw new IllegalArgumentException ("Publish Year can not be before 1900");
		}
		
		if (publishYear > 3000) {
			throw new IllegalArgumentException ("Publish Year can not be after 3000");
		}
		
		if (price < MINIMUM_PRICE) {
			throw new IllegalArgumentException ("Price can not be less than .99");
		}
		
		if (rating < 1 || rating > 5) {
			throw new IllegalArgumentException ("Rating must be 1-5");
		}
		
		this.publishYear = publishYear;
		this.price = price;
		this.rating = rating;
		this.title = title;
		this.author = author;
		
	}
	
	/**
	 * ToString
	 */
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publishYear=" + publishYear + ", rating=" + rating
				+ ", price=" + price + "]";
	}
	/**
	 * Getters
	 */
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getPublishYear() {
		return this.publishYear;
	}
	
	public int getRating() {
		return this.rating;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public static double getMinimumPrice() {
		return MINIMUM_PRICE;
	}
	/**
	 * Setters	
	 */

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}