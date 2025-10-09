package com.assignment;

import java.util.Scanner;

/*
Display food menu to user. User will select items from menu along with the 
quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed 
prices to food items(hard code the prices)  When user enters 'Generate Bill' 
option , display total bill & exit.
 */

public class Assignment1_3 {

	public int menu() {
		int choice = 0;
		System.out.println("Enter choice: ");
		System.out.println("0. Exit: ");
		System.out.println("1. Dosa: ");
		System.out.println("2. Samosa: ");
		System.out.println("3. Idli: ");
		System.out.println("4. Wada Pav: ");
		System.out.println("5. Uttapa: ");
		System.out.println("6. Pohe: ");
		System.out.println("7. Upama: ");
		System.out.println("8. Wada Sambar: ");
		System.out.println("9. Maggie: ");
		System.out.println("10. Kachori: ");
		Scanner sc = new Scanner(System.in);

		choice = sc.nextInt();

		return choice;
	}

	public static void main(String[] args) {

		int choice;
		int dosa = 0;
		int samosa = 0;
		int idli = 0;
		int wada_pav = 0;
		int uttapa = 0;
		int pohe = 0;
		int upama = 0;
		int wada_sambar = 0;
		int maggie = 0;
		int kachori = 0;

		Assignment1_3 a = new Assignment1_3();
		Scanner s = new Scanner(System.in);
		while ((choice = a.menu()) != 0) {
			switch (choice) {
			case 1: {
				System.out.println("Enter quantity: ");
				dosa = s.nextInt();
				break;
			}
			case 2: {
				System.out.println("Enter quantity: ");
				samosa = s.nextInt();
				break;
			}
			case 3: {
				System.out.println("Enter quantity: ");
				idli = s.nextInt();
				break;
			}
			case 4: {
				System.out.println("Enter quantity: ");
				wada_pav = s.nextInt();
				break;
			}
			case 5: {
				System.out.println("Enter quantity: ");
				uttapa = s.nextInt();
				break;
			}
			case 6: {
				System.out.println("Enter quantity: ");
				pohe = s.nextInt();
				break;
			}
			case 7: {
				System.out.println("Enter quantity: ");
				upama = s.nextInt();
				break;
			}
			case 8: {
				System.out.println("Enter quantity: ");
				wada_sambar = s.nextInt();
				break;
			}
			case 9: {
				System.out.println("Enter quantity: ");
				maggie = s.nextInt();
				break;
			}
			case 10: {
				System.out.println("Enter quantity: ");
				kachori = s.nextInt();
				break;
			}
			}
		}

		System.out.println("Your total bill: ");
		int total = 0;
		if (dosa != 0) {
			System.out.println("Dosa: " + dosa + "X" + 25 + "=" + dosa * 25);
			total = total + (dosa * 25);
		}
		if (samosa != 0) {
			System.out.println("Samosa: " + samosa + "X" + 15 + "=" + samosa * 15);
			total = total + (samosa * 15);
		}
		if (idli != 0) {
			System.out.println("Idli: " + idli + "X" + 25 + "=" + idli * 25);
			total = total + (idli * 25);
		}
		if (wada_pav != 0) {
			System.out.println("Wada Pav: " + wada_pav + "X" + 15 + "=" + wada_pav * 15);
			total = total + (wada_pav * 15);
		}
		if (uttapa != 0) {
			System.out.println("Uttapa: " + uttapa + "X" + 25 + "=" + uttapa * 25);
			total = total + (uttapa * 25);
		}
		if (pohe != 0) {
			System.out.println("Pohe: " + pohe + "X" + 15 + "=" + pohe * 15);
			total = total + (pohe * 15);
		}
		if (upama != 0) {
			System.out.println("Upama: " + upama + "X" + 20 + "=" + upama * 20);
			total = total + (upama * 20);
		}
		if (wada_sambar != 0) {
			System.out.println("Wada Sambar: " + wada_sambar + "X" + 30 + "=" + wada_sambar * 30);
			total = total + (wada_sambar * 30);
		}
		if (maggie != 0) {
			System.out.println("Maggie: " + maggie + "X" + 25 + "=" + maggie * 25);
			total = total + (maggie * 25);
		}
		if (kachori != 0) {
			System.out.println("Kachori: " + kachori + "X" + 15 + "=" + kachori * 15);
			total = total + (kachori * 15);
		}

		System.out.println("=====================");
		System.out.println("Total Bill:       ₹" + total);
		System.out.println("=====================");
	}

}
