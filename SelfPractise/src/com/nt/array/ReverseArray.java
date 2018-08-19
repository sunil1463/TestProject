package com.nt.array;

import java.util.Scanner;
public class ReverseArray {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		// scanning no of elements in num
		System.out.println("Enter the no of Elements");
		int num = sc.nextInt();

		// creating array objs
		System.out.println("Enter the  Elements");
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		int temp;
		int start = 0;
		int end = num - 1;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println("Array after reversing ");
		for (int j = 0; j < num; j++) {
			System.out.println(arr[j]);
		}
	}
}