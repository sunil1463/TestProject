package com.nt.algorithm;

public class BinarySearch {
	public static int binarySearch(int[] arr, int n, int key) {
		int l = 0;
		int h = n;
		int mid = 0;

		while (l <= h) {

			if (arr[n - 1] == key) {
				return n - 1;
			}
			mid = (l + h) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (key < arr[mid]) {
				h = mid - 1;
			} else if (key > arr[mid]) {
				l = mid + 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 9, 51, 31, 145, 62 };
		int key = 31;
		int n = arr.length;
		int index = binarySearch(arr, n, key);
		System.out.println(index);
	}
}