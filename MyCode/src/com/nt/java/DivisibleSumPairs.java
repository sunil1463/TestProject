package com.nt.java;

public class DivisibleSumPairs {
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = ar[i] + ar[j];
				if (sum % k == 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] ar = { 1, 3, 2, 6, 1, 2 };
		int n = ar.length;
		int k = 3;
		int value = divisibleSumPairs(n, k, ar);
		System.out.println(value);

	}

}
