package com.day3;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		int arr[] = { 11, 45, 98, 53, 41, 9 };

		for (int x : arr)
			System.out.print(x + " ");
		System.out.println();
		Arrays.sort(arr);
		for (int x : arr)
			System.out.print(x + " ");
		System.out.println();
		System.out.println(Arrays.binarySearch(arr, 53));
	}

}
