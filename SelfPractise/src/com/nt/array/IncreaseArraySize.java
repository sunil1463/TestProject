package com.nt.array;

public class IncreaseArraySize {
	public static void main(String[] args) {
		int arr[] = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = 5;
//		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Before increasing Size of an array :" + arr.length);
		
		
		int arr2[] = new int[10];

		arr = arr2;
		arr2 = null;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("After increasing Size of an array : " + arr.length);
	}
}