package com.assignment2_2;

/*
 * Write a test application named 
EmployeeTest that demonstrates class Employee’s capabilities. Create two 
Employee objects and display each object’s yearly salary. Then give each 
Employee a 10% raise and display each Employee’s yearly salary again.
 */

public class EmployeeTest {

	public static double yearlySalary(double monthlySalary) {
		return monthlySalary * 12;
	}

	public static double raise(double monthlySalary) {

		return monthlySalary * 1.1;
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("Amit", "Yadav", 8000.00);
		Employee emp2 = new Employee("Sumit", "Raghav", 9000.00);

		System.out.println("Yearly salary of Emp1 before raise is: " + yearlySalary(emp1.getMonthlySalary()));
		emp1.setMonthlySalary(raise(emp1.getMonthlySalary()));
		System.out.println("Yearly salary of Emp1 after raise is: " + yearlySalary(emp1.getMonthlySalary()));
		System.out.println();
		System.out.println("Yearly salary of Emp2 before raise is: " + yearlySalary(emp2.getMonthlySalary()));
		emp2.setMonthlySalary(raise(emp2.getMonthlySalary()));
		System.out.println("Yearly salary of Emp1 after raise is: " + yearlySalary(emp2.getMonthlySalary()));

	}

}
