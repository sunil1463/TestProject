package com.nt.array;

import java.util.*;

public class BalanceArray {
	static int balancedSum(List<Integer> sales) {
		int[] arr = new int[sales.size()];
		int i = 0;
		for (int input : sales) {
			arr[i] = input;
			i++;
		}
		for (int j = 1; j < arr.length - 1; j++) {
			int startSum = 0, endSum = 0;
			for (int k = 0; k < j; k++) {
				startSum = startSum + arr[k];
			}
			for (int l = j + 1; l < arr.length; l++) {
				endSum = endSum + arr[l];
			}
			if (startSum == endSum) {
				return j;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		List<Integer> sales = new ArrayList<>();
		sales.add(1);
		sales.add(2);
		sales.add(3);
		sales.add(4);
		sales.add(4);
		sales.add(10);
		int values = balancedSum(sales);
		System.out.println(values);
	}
}