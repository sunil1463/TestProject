package com.nt.java;

public class MaximumDiff {
	public static int findMaxDiff(int[] arr, int k) {
		int diff = arr[0] - arr[1];
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				if (diff < arr[i] - arr[j]) {
					diff = arr[i] - arr[j];
				}
			}
		}
		return diff;
	}

	public static void main(String[] args) {
		int[] arr = { 31,0, 5, 2, 9, 8, 6, 1, 10, 30 };
		int k = arr.length;
		int maxDiff = findMaxDiff(arr, k);
		System.out.println(maxDiff);
	}
}