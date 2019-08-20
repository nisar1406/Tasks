package com.MT.group5.tasks.taskDay1;

public class InterestCalculator {

	public static double compoundInterest(double p, double r, int n) {
		return p * (Math.pow((1 + (r / 100)), n));
	}

	public static double simpleInterest(double p, double r, int n) {
		return (p * r * n) / 100;
	}
}
