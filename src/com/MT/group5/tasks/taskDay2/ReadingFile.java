package com.MT.group5.tasks.taskDay2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.MT.group5.tasks.taskDay1.InterestCalculator;

public class ReadingFile {
	public static final String csvDellimeter = ",";

	public static ArrayList<ArrayList<Double>> readingCSV(String file) {
		double principle, rate;
		int years;
		ArrayList<Double> list_si = new ArrayList<Double>();
		ArrayList<Double> list_ci = new ArrayList<Double>();
		ArrayList<ArrayList<Double>> arr = new ArrayList<>();
		BufferedReader br = null;
		String line = "";

		try {
			br = new BufferedReader(new FileReader(file));
			int iteration = 0;
			while ((line = br.readLine()) != null) {
				if (iteration == 0) {
					iteration++;
					continue;
				}
				String[] value = line.split(csvDellimeter);

				System.out
						.println("Values [Principle= " + value[0] + ", Rate=" + value[1] + ", Years=" + value[2] + "]");

				principle = Double.parseDouble(value[0]);
				rate = Double.parseDouble(value[1]);
				years = Integer.parseInt(value[2]);

				double si = InterestCalculator.simpleInterest(principle, rate, years);
				list_si.add(Double.parseDouble(String.format("%.2f", si)));

				double ci = InterestCalculator.compoundInterest(principle, rate, years);
				list_ci.add(Double.parseDouble(String.format("%.2f", ci)));
			}
			arr.add(list_si);
			arr.add(list_ci);

		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return arr;

	}
}
