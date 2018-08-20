package com.nt.java;

import java.util.Set;
import java.util.TreeSet;

public class CheckPairSum {

	public static int printpairs(int[] arr, int n) {
		Set<Integer> s = new TreeSet<>();
		for (int i : arr) {
			s.add(i);
		}

		int[] arr1 = new int[s.size()];
		int a = 0;
		for (int i : s) {
			arr1[a] = i;
			a++;
		}
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				int sum = arr1[i] + arr1[j];
				if (sum == n) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 45, 6, 9, 8 };
		int n = 6;
		int value = printpairs(arr, n);
		System.out.print(value);
	}
}