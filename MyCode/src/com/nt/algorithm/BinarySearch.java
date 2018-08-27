/* Array must be sorted*/
package com.nt.algorithm;

import java.util.Arrays;

public class BinarySearch {
	public static boolean binarySearch(int[] arr, int key) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + ((right - left) / 2);
			if (arr[mid] == key) {
				return true;
			} else if (key < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 2, 3, 10, 5, 6, 7, 8, 9 };
		int key = 2;
		boolean index = binarySearch(arr, key);
		System.out.println(index);
	}
}