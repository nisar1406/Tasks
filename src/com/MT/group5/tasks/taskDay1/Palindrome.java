package com.MT.group5.tasks.taskDay1;

public class Palindrome {
	public static boolean palindrome(String input) {

		String reverse = "";

		int length = input.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + input.charAt(i);
		if (input.equals(reverse))
			return true;
		else
			return false;
	}
}
