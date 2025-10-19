package com.sunbeam;

import java.util.Scanner;

class ExceptionLineTooLong extends Exception {
	public ExceptionLineTooLong() {
		super("The strings is too long");
	}
}

public class TestStringLength {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();

		try {

			if (str.length() > 80) {
				throw new ExceptionLineTooLong();
			}
			System.out.println("String accepted");

		} catch (ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}
	}

}
