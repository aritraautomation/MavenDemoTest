package org.qa.javaprogram;

public class FindQuotientReminder {

	public static void main(String[] args) {
		
		int dividend = 15;
		int divisor = 4;
		
		int quotient = dividend/divisor;
		
		int reminder = dividend%divisor;
		
		System.out.println("Quotient : " + quotient);
		System.out.println("Reminder : " + reminder);
	}

}
