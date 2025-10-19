package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];
        int counter = 0;

        int choice;
        do {
            System.out.println("\n--- Fruit Basket Menu ---");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display all fruit names");
            System.out.println("5. Display all fresh fruits details");
            System.out.println("6. Display all stale fruits' tastes");
            System.out.println("7. Mark a fruit as stale");
            System.out.println("8. Mark all sour fruits as stale");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add Mango
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Mango(name, weight, color);
                    } else
                        System.out.println("Basket is full!");
                    break;

                case 2: // Add Orange
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Orange(name, weight, color);
                    } else
                        System.out.println("Basket is full!");
                    break;

                case 3: // Add Apple
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[counter++] = new Apple(name, weight, color);
                    } else
                        System.out.println("Basket is full!");
                    break;

                case 4: // Display names
                    System.out.println("\n--- Fruit Names ---");
                    for (Fruit f : basket) {
                        if (f != null)
                            System.out.println(f.getName());
                    }
                    break;

                case 5: // Fresh fruits details
                    System.out.println("\n--- Fresh Fruits ---");
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh())
                            System.out.println(f.toString() + ", Taste: " + f.taste());
                    }
                    break;

                case 6: // Stale fruits' taste
                    System.out.println("\n--- Stale Fruits' Tastes ---");
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh())
                            System.out.println(f.getName() + ": " + f.taste());
                    }
                    break;

                case 7: // Mark a fruit as stale
                    System.out.print("Enter index to mark stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println("Marked " + basket[index].getName() + " as stale.");
                    } else
                        System.out.println("Invalid index!");
                    break;

                case 8: // Mark all sour fruits stale
                    for (Fruit f : basket) {
                        if (f != null && f.taste().equals("sour")) {
                            f.setFresh(false);
                        }
                    }
                    System.out.println("All sour fruits marked stale.");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
