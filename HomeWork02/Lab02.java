// package cz.cvut.fel.pjv;

import java.util.Scanner;
import java.lang.Math;

public class Lab02 {

	// does statistics for line of nums of unknown length
	public void start(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int num_counter = 0;
		int line_counter = 0;
		boolean is_a_ten = false;
		int nums[] = new int[10];

		while (scanf.hasNextLine()) {
			String line = scanf.nextLine();
			is_a_ten = false;
			line_counter++;

			if (!(TextIO.isInteger(line))) {
				System.out.printf("A number has not been parsed from line %d\n", line_counter);
				continue;
			}

			int num = Integer.parseInt(line);
			nums[num_counter++ % 10] = num;

			// print statistics every 10 nums
			if ((num_counter % 10) == 0) {
				is_a_ten = true;
				double mean = meanCalc(nums, 10);
				double deviation = standartDeviation(nums, 10, mean);
				System.out.printf("%d %.3f %.3f\n", 10, mean, deviation);
			}
		}
		System.out.println("End of input detected!");

		// print statistics for remaining nums
		if (!is_a_ten && (num_counter % 10) != 0) {
			double mean = meanCalc(nums, num_counter % 10);
			double deviation = standartDeviation(nums, num_counter % 10, mean);
			System.out.printf(" %d %.3f %.3f\n", num_counter % 10, mean, deviation);
		}

		scanf.close();
	}

	/*
	* Calculates mean for all numbers in interval (0;count) in nums[]
	*/
	public double meanCalc(int[] nums, int count) {
		double mean = 0;
		for (int i = 0; i < count; ++i) {
			mean += nums[i];
		}
		return (mean / count);
	}

	public double standartDeviation(int[] nums, int count, double mean) {
		double summ = 0;
		for (int i = 0; i < count; ++i) {
			summ += Math.pow((nums[i] - mean), 2);
		}
		return Math.sqrt(summ / count);
	}
}