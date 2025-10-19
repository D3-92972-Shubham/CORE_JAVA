package com.sunbeam;

public class NoOfWordsInString {

	public static int noOfWordsInString(String str) {
		int count = 0;
		str = str.trim();
		String cleanedString = str.replaceAll("[^a-zA-Z ]", "");
		String sarr[] = cleanedString.split(" ");
		for (String s : sarr) {
			if (s.length() != 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String str = " write a java program to count number 55 of words in a String. Hint:  You can use , trim() , length() and split() methods  ";

		int count = NoOfWordsInString.noOfWordsInString(str);

		System.out.println(count);

	}

}
