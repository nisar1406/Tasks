package com.MT.group5.tasks;

import java.util.ArrayList;

import com.MT.group5.tasks.taskDay2.ReadingFile;

public class ReadingCSV {
	public static void main(String[] args) {
		String csvFile = "D://Programs//Java//Assignments//pry.csv";
		ArrayList<ArrayList<Double>> arr = new ArrayList<>();
		arr = ReadingFile.readingCSV(csvFile);
		System.out.print("All calculated Simple Interests for given input file: ");
		System.out.println(arr.get(0));
		System.out.print("All calculated Compound Interests for given input file: ");
		System.out.println(arr.get(1));

	}

}
