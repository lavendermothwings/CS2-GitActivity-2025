package edu.westga.cs1302.bill.model;

/** Calculates the sub total, tax, tip, and total for bill.
 * 
 * @author Valor Bright
 * @version Fall 2025
 */

public class BillCalculator {

	/** Gets the sub total of the bill items in a bill
	 * 
	 * @precondition items != null
	 * 
	 * @param items the items in the BillItem[]
	 * 
	 * @return subTotal the sub total of the bill items
	 */
	public static double getSubTotal(BillItem[] items) {
		if (items == null) {
			throw new IllegalArgumentException("item must not be null.");
		}
		double subTotal = 0;
		for (BillItem currItem : items) {
			subTotal += currItem.getAmount();	
		}
		return subTotal;
	}
	
	/** Gets the tax from the sub total of the bill items in a bill
	 * 
	 * @precondition items != null
	 * 
	 * @param items the items in the BillItem[]
	 * 
	 * @return tax the tax of the sub total of the bill items
	 */
	public static double getTax(BillItem[] items) {
		if (items == null) {
			throw new IllegalArgumentException("item must not be null.");
		}
		double tax = 0;
		double subTotal = 0;
		for (BillItem currItem : items) {
			subTotal += currItem.getAmount();
		}
		tax = subTotal * Bill.TAX_RATE;
		tax = BillCalculator.roundToNearestHundredth(tax);
		return tax;
	}
	
	/** Gets the tip from the sub total of the bill items in a bill
	 * 
	 * @precondition items != null
	 * 
	 * @param items the items in the BillItem[]
	 * 
	 * @return tip the tip of the sub total of the bill items
	 */
	public static double getTip(BillItem[] items) {
		if (items == null) {
			throw new IllegalArgumentException("item must not be null.");
		}
		double subTotal = 0;
		double tip = 0;
		for (BillItem currItem : items) {
			subTotal += currItem.getAmount();
		}
		tip = subTotal * Bill.TIP_RATE;
		tip = BillCalculator.roundToNearestHundredth(tip);
		
		return tip;
	}
	
	/** Gets the total from the sub total && tax && tip of the bill items in a bill
	 * 
	 * @precondition items != null
	 * 
	 * @param items the items in the BillItem[]
	 * 
	 * @return total the total of the sub total && tax && tip of the bill items
	 */
	public static double getTotal(BillItem[] items) {
		if (items == null) {
			throw new IllegalArgumentException("item must not be null.");
		}
		double subTotal = 0;
		double tip = 0;
		double tax = 0;
		double total = 0;
		for (BillItem currItem : items) {
			subTotal += currItem.getAmount();
		}
		tip = subTotal * Bill.TIP_RATE;
		tax = subTotal * Bill.TAX_RATE;
		total = subTotal + tip + tax;
		total = BillCalculator.roundToNearestHundredth(total);
		return total;
	}
	
	private static double roundToNearestHundredth(double value) {
		return (int) (value * 100) / 100.0;
	}
	
}
