package com.nt.array;

public class DistintArraySum {
	private static int distintSum(int[] arr) {
		int sum = 0;

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					arr[i]++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 4, 5, 2, 1 };

		System.out.println("Sum : " + distintSum(arr));

	}

}
