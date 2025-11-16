package com.sunbeam2;

import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        System.out.println("Original List: " + list);

        // Replace 2nd element (index 1)
        list.set(1, "Orange");   // replacing "Banana" with "Orange"

        System.out.println("Updated List:  " + list);
    }
}
