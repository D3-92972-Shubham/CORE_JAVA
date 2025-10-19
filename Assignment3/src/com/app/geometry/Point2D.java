package com.app.geometry;

public class Point2D {

	private double x;
	private double y;

	public Point2D() {

	}

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getDetails() {
		return "x co-ordinate: " + this.x + ", " + "y co-ordinate: " + this.y;
	}

	public boolean isEqual(Point2D p) {

		return ((this.x == p.getX()) && (this.y == p.getY()));

	}

	public double calculateDistance(Point2D p) {

		return Math.sqrt((Math.pow((this.x - p.getX()), 2)) + (Math.pow((this.y - p.getY()), 2)));

	}

}
