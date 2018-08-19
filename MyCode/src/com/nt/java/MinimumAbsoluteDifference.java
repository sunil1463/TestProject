package com.nt.java;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

	static int minimumAbsoluteDifference(int[] arr) {
		Arrays.sort(arr);
		int mindiff = arr[1] - arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < i; j++) {
				if (mindiff > arr[i] - arr[j] && i != j) {
					mindiff = arr[i] - arr[j];
				}
			}
		}
		return Math.abs(mindiff);
	}

	public static void main(String[] args) {

		int[] arr = { -59, -36, -13, 1, -53, -92, -2, -96, -54, 75 };

		int minvalue = minimumAbsoluteDifference(arr);
		System.out.println(minvalue);
	}

}
