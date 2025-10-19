package com.sunbeam;

//Enum representing traffic lights with duration
enum TrafficLight {
	RED(30), // duration in seconds
	GREEN(45), YELLOW(5);

	private int duration; // instance variable

	// Constructor
	TrafficLight(int duration) {
		this.duration = duration;
	}

	// Getter method
	public int getDuration() {
		return duration;
	}
}

//Test class
public class TestTrafficLight {
	public static void main(String[] args) {
		System.out.println("Traffic Light Durations:\n");

		// Loop through all enum constants
		for (TrafficLight light : TrafficLight.values()) {
			System.out.println(light + " light lasts for " + light.getDuration() + " seconds.");
		}
	}
}
