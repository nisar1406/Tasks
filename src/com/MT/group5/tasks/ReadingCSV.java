package com.MT.group5.tasks;

import java.util.ArrayList;

import com.MT.group5.tasks.taskDay2.ReadingFile;

public class ReadingCSV {
	public static void main(String[] args) {
		String csvFile = "D://Programs//Java//Assignments//pry.csv";
		ArrayList<ArrayList> arr = new ArrayList<ArrayList>();
		arr = ReadingFile.readingCSV(csvFile);
		System.out.println("All calculated Simple Interests for given input file");
		System.out.println(arr.get(0));
		System.out.println("All calculated Compound Interests for given input file");
		System.out.println(arr.get(1));

	}

}
