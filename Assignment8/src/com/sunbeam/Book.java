package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Book implements Comparable<Book> {

	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book() {
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public int compareTo(Book o) {

		return this.getIsbn().compareTo(o.getIsbn());
	}

}

class DisplayBooksFwd implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {

		return o1.getIsbn().compareTo(o2.getIsbn());
	}

}

class DisplayBooksRev implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o2.getIsbn().compareTo(o1.getIsbn());
	}

}

class SortBooksByPriceDesc implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return Double.compare(o2.getPrice(), o1.getPrice());
	}

}

class Library {

	private static ArrayList<Book> library = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static Book[] sampleBooks() {
		Book[] barr = new Book[4];

		barr[0] = new Book("001", 500.00, "Shivaji Sawant", 10);
		barr[1] = new Book("004", 250.00, "Ranjeet Desai", 15);
		barr[2] = new Book("003", 400.00, "G A Kulkarni", 5);
		barr[3] = new Book("002", 150.00, "P L Deshpande", 20);

		return barr;
	}

	public static void addBooks(Book[] arr) {
		for (Book b : arr)
			library.add(b);
	}

	public static void displayBooksFwd() {
		library.sort(new DisplayBooksFwd());
		for (Book b : library)
			System.out.println(b);
	}

	public static void displayBooksRev() {

		library.sort(new DisplayBooksRev());
		for (Book b : library)
			System.out.println(b);

	}

	public static void acceptrecord(int[] arr) {
		System.out.println("Enter index: ");
		arr[0] = sc.nextInt();
	}

	public static boolean deleteBook(int index) {

		if (index <= library.size() - 1) {
			library.remove(index);
			return true;
		} else
			return false;
	}

	public static void sortBookByDescPrice() {
		library.sort(new SortBooksByPriceDesc());
		for (Book b : library)
			System.out.println(b);
	}

	public static int menuList() {
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Display all books in reverse order");
		System.out.println("4. Delete a book at given index");
		System.out.println("5. Sort all books by price in desc order");
		System.out.println("0. Exit");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int[] index = new int[1];
		int choice;
		while ((choice = menuList()) != 0) {

			switch (choice) {
			case 1:
				library.clear();
				Book[] barr = Library.sampleBooks();
				Library.addBooks(barr);
				break;

			case 2:
				Library.displayBooksFwd();
				break;

			case 3:
				Library.displayBooksRev();
				break;

			case 4:
				Library.acceptrecord(index);
				boolean bool = Library.deleteBook(index[0]);
				if (bool)
					System.out.println("Book deleted frokm index" + index);
				else
					System.out.println("Invalid index");
				break;

			case 5:
				Library.sortBookByDescPrice();
				break;
			}

		}

	}

}
