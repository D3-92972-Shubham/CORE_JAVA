package com.sunbeam;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack stack = null;  // no stack chosen initially
        boolean exit = false;

        while (!exit) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Choose Fixed Stack");
            System.out.println("2. Choose Growable Stack");
            System.out.println("3. Push Employee");
            System.out.println("4. Pop Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (stack == null) {
                        stack = new FixedStack();
                        System.out.println("Fixed Stack Selected.");
                    } else {
                        System.out.println("Stack already selected. Cannot change now!");
                    }
                    break;

                case 2:
                    if (stack == null) {
                        stack = new GrowableStack();
                        System.out.println("Growable Stack Selected.");
                    } else {
                        System.out.println("Stack already selected. Cannot change now!");
                    }
                    break;

                case 3:  // Push
                    if (stack == null) {
                        System.out.println("NO Stack Chosen Yet!!");
                    } else {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter Name: ");
                        String name = sc.next();
                        System.out.print("Enter Salary: ");
                        double sal = sc.nextDouble();

                        Employee e = new Employee(id, name, sal);
                        stack.push(e);
                    }
                    break;

                case 4:  // Pop
                    if (stack == null) {
                        System.out.println("NO Stack Chosen Yet!!");
                    } else {
                        Employee e = stack.pop();
                        if (e != null) {
                            System.out.println("Popped: " + e);
                        }
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
