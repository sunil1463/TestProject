package com.nt.array;

public class PowerOf2 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 16, 10, 81, 64, 100, 144 };
		int[] arr2 = new int[arr.length];
		arr2 = fun1(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

	static int[] fun1(int[] arr) {
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = powOf2(arr[i]);
		}
		return arr2;
	}

	static int powOf2(int n) {
		int k = 2;
		while (k < n) {
			k = k * 2;
		}
		if (k == n) {
			return 1;
		} else {
			return 0;
		}
	}
}