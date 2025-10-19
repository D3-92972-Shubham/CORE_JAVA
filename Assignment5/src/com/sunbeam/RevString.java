package com.sunbeam;

import java.util.Scanner;

public class RevString {

	public static String revString(String str) {
		String rev = "";

		char charr[] = str.toCharArray();

		for (int i = charr.length - 1; i >= 0; i--) {
			rev = rev.concat(String.valueOf(charr[i]));
		}

		return rev;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();

		String rev = RevString.revString(str);

		System.out.println("Reverse of string: " + rev);

		sc.close();
	}

}
