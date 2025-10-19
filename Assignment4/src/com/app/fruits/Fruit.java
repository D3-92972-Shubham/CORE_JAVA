package com.app.fruits;

public  class Fruit {
    private String name;
    private String color;
    private double weight;
    private boolean isFresh;

    // Constructor
    public Fruit(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.isFresh = true; // default fresh when created
    }

    // Abstract method
    public String taste() {
		return "";
    	
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        this.isFresh = fresh;
    }

    // toString
    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight + "kg";
    }
}
