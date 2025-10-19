package com.sunbeam;

import java.util.Scanner;

public class StrPalindrome {

	public static boolean isStrPalindrome(String str) {

		return str.equals(RevString.revString(str));

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string: ");

		String str = sc.next();

		if (StrPalindrome.isStrPalindrome(str)) {
			System.out.println("String " + str + " is palindrome");
		} else {
			System.out.println("String " + str + " is not palindrome");
		}
		
		sc.close();
	}

}
