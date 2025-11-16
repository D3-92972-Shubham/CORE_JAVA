package com.sunbeam;

import java.util.*;

public class Tester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students (Iterator)");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort Students by Roll No");
            System.out.println("5. Sort Students by Name");
            System.out.println("6. Sort Students by Marks");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1: // Add
                System.out.print("Enter roll no: ");
                int r = sc.nextInt();
                System.out.print("Enter name: ");
                String n = sc.next();
                System.out.print("Enter marks: ");
                double m = sc.nextDouble();

                list.add(new Student(r, n, m));
                System.out.println("Student added!");
                break;

            case 2: // Display using Iterator
                Iterator<Student> itr = list.iterator();
                System.out.println("---- Student List ----");
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;

            case 3: // Search
                System.out.print("Enter roll no to search: ");
                int sr = sc.nextInt();

                boolean found = false;
                for (Student s : list) {
                    if (s.getRollno() == sr) {
                        System.out.println("Student Found: " + s);
                        found = true;
                        break;
                    }
                }
                if (!found)
                    System.out.println("Student NOT found!");
                break;

            case 4: // Sort rollno
                Collections.sort(list, new SortByRoll());
                System.out.println("Sorted by Roll No!");
                break;

            case 5: // Sort name
                Collections.sort(list, new SortByName());
                System.out.println("Sorted by Name!");
                break;

            case 6: // Sort marks
                Collections.sort(list, new SortByMarks());
                System.out.println("Sorted by Marks!");
                break;

            case 7:
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
