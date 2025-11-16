package com.sunbeam2;

import java.util.ArrayList;
import java.util.Collections;

public class ColorList {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Sort the list
        Collections.sort(colors);

        // Print sorted list
        System.out.println("Sorted Colors: ");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
