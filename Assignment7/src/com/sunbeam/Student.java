package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {

	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student() {
	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {

		return this.getRoll() - o.getRoll();
	}

}

class StudentSortOnName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class StudentSortingOnCityDesc implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getCity().compareTo(o1.getCity());
	}
}

class StudentSortingOnMarksDesc implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return Double.compare(o2.getMarks(), o1.getMarks());
	}

}

class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student(3, "Shubham", "Pune", 89.83);
		Student s2 = new Student(1, "Akash", "Ahmedabad", 85.00);
		Student s3 = new Student(27, "Saurabh", "Kolhapur", 87.7);
		Student s4 = new Student(79, "Veer", "Mumbai", 91.25);
		Student s5 = new Student(30, "Sachin", "Sangli", 94.65);
		Student s6 = new Student(45, "Samarth", "Solapur", 85.85);

		Student arr[] = { s1, s2, s3, s4, s5, s6 };

		for (Student s : arr) {
			System.out.println(s);
		}

		Arrays.sort(arr);

		System.out.println("\nAfter sort on Roll no. (comparable): ");

		for (Student s : arr) {
			System.out.println(s);
		}

		System.out.println("\nAfter sort on Name: ");

		Arrays.sort(arr, new StudentSortOnName());

		for (Student s : arr) {
			System.out.println(s);
		}

		Arrays.sort(arr, new StudentSortingOnCityDesc());

		System.out.println("\nAfter sort on City Desc: ");

		for (Student s : arr) {
			System.out.println(s);
		}
		
		Arrays.sort(arr, new StudentSortingOnMarksDesc());

		System.out.println("\nAfter sort on Marks Desc: ");

		for (Student s : arr) {
			System.out.println(s);
		}
	}

}