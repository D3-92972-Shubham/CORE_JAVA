package com.assignment;

import java.util.Scanner;

/*
 2. Accept 2 double values from User (using Scanner). Check data type. If 
arguments are not doubles, supply suitable error message & terminate. 
If numbers are double values, print its average.
 */

public class Assignment1_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter double num1 ");
		if (sc.hasNextDouble()&&!sc.hasNextInt()) {
			double num1 = sc.nextDouble();
			System.out.println("Enter double num2 ");
			if (sc.hasNextDouble()&&!sc.hasNextInt()) {
				double num2 = sc.nextDouble();
				System.out.println("Average of num1 nad num2: " + (num1 + num2) / 2);
			} else {
				System.out.println("Enter valid double value");
			}
		} else {
			System.out.println("Enter valid double value");
		}

		sc.close();
	}

}
