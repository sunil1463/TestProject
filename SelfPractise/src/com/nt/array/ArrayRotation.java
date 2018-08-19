package com.nt.array;

class ArrayRotation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int d = 5;
		int temp;
		System.out.println("Before roation ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < d; i++) {
			temp = arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println("\nAfter Rotation ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}