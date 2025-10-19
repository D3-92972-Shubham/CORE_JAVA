package com.sunbeam;

public class MinimunNum {

	public static <T extends Number & Comparable<T>> T minimumNumber(T[] numbers) {

		if (numbers.length == 0 || numbers == null)
			return null;

		T min = numbers[0];

		for (T num : numbers) {
			if (num.compareTo(min) < 0) {
				min = num;
			}
		}

		return min;
	}
}

class TestMinimunNum {

	public static void main(String[] args) {

		Integer[] intArray = { 15, 2, 30, 8, 9 };
		Double[] doubleArray = { 10.5, 2.3, 7.7, 1.1 };
		Long[] longArray = { 50L, 12L, 65L, 8L };
		Float[] emptyArray = {}; // test empty array

		System.out.println("Minimum in Integer array: " + MinimunNum.minimumNumber(intArray));
		System.out.println("Minimum in Double array: " + MinimunNum.minimumNumber(doubleArray));
		System.out.println("Minimum in Long array: " + MinimunNum.minimumNumber(longArray));
		System.out.println("Minimum in Empty array: " + MinimunNum.minimumNumber(emptyArray)); // will print null
	}

}
