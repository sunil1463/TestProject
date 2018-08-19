// find Largest , minimum no in Array and second Largest no:
package com.nt.array;

public class MaximumAndMinimum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, -5, -9, 0, 6, 10 };
		int max = arr[0];
		int sec_max = arr[0];
		int min = arr[0];
		int sec_min = arr[0];
		System.out.println("elements of array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		// for minimum and second minimum

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				sec_min = min;
				min = arr[i];
			} else if (min > arr[i]) {
				sec_min = arr[i];
			}
		}

		// for maximum and sec maximum

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				sec_max = max;
				max = arr[i];
			} else if (max < arr[i]) {
				sec_max = arr[i];
			}
		}

		System.out.println("MAX " + max);
		System.out.println("SEC_MAX " + sec_max);
		System.out.println("MIN " + min);
		System.out.println("SEC_MIN " + sec_min);

	}
}
