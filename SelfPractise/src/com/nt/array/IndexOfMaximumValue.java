package com.nt.array;

public class IndexOfMaximumValue {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 5, -9, -10, 10 };
		int max = arr[0];
		int index = 0;
		// for maximum and its index
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("MAX " + max);
		System.out.println("INDEX " + index);

	}
}