package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {

		double x1;
		double y1;

		double x2;
		double y2;

		System.out.println("Enter x co-ordinate of P1");
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextDouble();
		System.out.println("Enter y co-ordinate of P1");
		y1 = sc.nextDouble();

		System.out.println("Enter x co-ordinate of P2");
		x2 = sc.nextDouble();
		System.out.println("Enter y co-ordinate of P2");
		y2 = sc.nextDouble();

		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);

		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());

		System.out.println(p1.isEqual(p2) ? "Equal" : "Not equal");
		
		if(p1.isEqual(p2)) {
			System.out.println("Points are located at the same position");
		}else {
			System.out.println("Distance between two points is: "+p1.calculateDistance(p2));
		}

	}

}