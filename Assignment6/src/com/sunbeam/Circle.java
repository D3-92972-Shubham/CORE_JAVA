package com.sunbeam;

class NegativeDiameterException extends Exception {

	public NegativeDiameterException() {
		super("Invalid diameter:Cannot be negative");
	}

}

public class Circle {

	private double myX;
	private double myY;
	private double myDiameter;

	public Circle() {
		this.myX = 0;
		this.myY = 0;
		this.myDiameter = 100;
	}

	public Circle(double myX, double myY, double myDiameter) throws NegativeDiameterException {

		if (myDiameter < 0)
			throw new NegativeDiameterException();
		this.myX = myX;
		this.myY = myY;
		this.myDiameter = myDiameter;
	}

	public double getMyX() {
		return myX;
	}

	public void setMyX(double myX) {
		this.myX = myX;
	}

	public double getMyY() {
		return myY;
	}

	public void setMyY(double myY) {
		this.myY = myY;
	}

	public double getMyDiameter() {
		return myDiameter;
	}

	public void setMyDiameter(double myDiameter) throws NegativeDiameterException {
		if (myDiameter < 0)
			throw new NegativeDiameterException();
		this.myDiameter = myDiameter;
	}

}

class testCircle {
	public static void main(String[] args) {
		try {
			Circle c = new Circle(20.0, 20.0, -5.0);
		} catch (NegativeDiameterException e) {
			System.out.println(e.getMessage());
		}
	}
}
