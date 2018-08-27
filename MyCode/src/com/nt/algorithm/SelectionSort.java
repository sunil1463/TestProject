/*								 Selection Sort  O(n^2)
 * 
 * 
 * */

package com.nt.algorithm;

public class SelectionSort {
	public static void selectionSort(int[] arr, int l) {
		for (int i = 0; i < l - 1; i++) {
			int iMin = i;
			for (int j = i + 1; j < l; j++) {
				if (arr[j] < arr[iMin]) {
					iMin = j;
				}
				int temp = arr[i];
				arr[i] = arr[iMin];
				arr[iMin] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 1, 3, 6, 14, 15 };
		int l = arr.length;
		selectionSort(arr, l);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
