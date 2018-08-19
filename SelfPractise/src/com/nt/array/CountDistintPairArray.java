package com.nt.array;
public class CountDistintPairArray {

	private static int countPairsWithDiffK(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		int count = 0;
		int i = 0;
		int j = 1;
		while (j < arr.length) {
			int diff = arr[j] - arr[i];
			if (diff == k) {
				count++;
				j++;
			} else if (diff > k) {
				i++;
				if (i == j) {
					j++;
				}
			} else if (diff < k) {
				j++;
			}
		}

		return count;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 5, 3, 4, 2 };
		int k = 3;
		System.out.println("Count of pairs with given diff is " + countPairsWithDiffK(arr, k));
	}
}