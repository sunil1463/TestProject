package com.nt.array;

public class MaxArrayDiffrence {
	public static int maxDiff(int[] arr, int k) {
		int maxDiff = arr[0];
		for (int i = 0; i < k; i++) {
			for (int j = i + 1; j < k; j++) {
				if (maxDiff < arr[j] - arr[i]) {
					maxDiff = arr[j] - arr[i];
				}
			}
		}
		return maxDiff;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int k = arr.length;
		System.out.println("Maximum differnce is " + maxDiff(arr, k));
	}
}