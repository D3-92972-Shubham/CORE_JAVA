package com.creditcard;

import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter account number (or -1 to quit): ");
            int accountNumber = sc.nextInt();

            if (accountNumber == -1) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.print("Enter beginning balance: ");
            int beginningBalance = sc.nextInt();

            System.out.print("Enter total charges: ");
            int totalCharges = sc.nextInt();

            System.out.print("Enter total credits: ");
            int totalCredits = sc.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = sc.nextInt();

            int newBalance = beginningBalance + totalCharges - totalCredits;

            System.out.println("\nAccount Number: " + accountNumber);
            System.out.println("New Balance: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.\n");
            } else {
                System.out.println("Credit limit NOT exceeded.\n");
            }
        }

        sc.close();
    }
}
