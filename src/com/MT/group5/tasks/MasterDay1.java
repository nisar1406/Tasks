package com.MT.group5.tasks;

import java.util.Scanner;

import com.MT.group5.tasks.taskDay1.InterestCalculator;
import com.MT.group5.tasks.taskDay1.Palindrome;

public class MasterDay1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int years;
		double principle, rate;

		System.out.println("Enter principle, ROI, Number of years:");
		principle = sc.nextDouble();
		rate = sc.nextDouble();
		years = sc.nextInt();

		System.out.println(InterestCalculator.simpleInterest(principle, rate, years));

		System.out.println(InterestCalculator.compoundInterest(principle, rate, years));

		System.out.println("Enter any string");
		String str = sc.next();
		sc.close();

		if (Palindrome.palindrome(str)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
