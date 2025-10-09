package com.assignment2_1;

public class InvoiceTest {
	public static void main(String[] args) {

		Invoice i = new Invoice("P01", "Seat", 2, 800.00);
		
		System.out.println(i.getInvoiceAmount());
		
	}
}
