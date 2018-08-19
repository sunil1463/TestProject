package com.nt.array;

public class MinimalArraySum {
	private static int minSum(int[] arr) {
		int sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				int j = i;
				while (j < arr.length && arr[j] <= arr[j - 1]) {
					arr[j] = arr[j] + 1;
					j++;
				}
			}
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 2, 3, 5, 6 };
		System.out.println(minSum(arr));
	}
}