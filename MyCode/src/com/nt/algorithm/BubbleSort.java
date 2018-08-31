/*	    50,40,30,20,10,60
 * 		40,50,30,20,10,60
 * 		40,30,50,20,10,60
 * 		40,30,20,50,10,60
 * 		40,30,20,10,50,60
 * 
 * 		30,40,20,10,50,60
 * 		30,20,40,10,50,60
 * 		30,20,10,40,50,60
 * 
 * 		20,30,10,40,50,60
 * 		20,10,30,40,50,60
 * 	
 * 		10,20,30,40,50,60	
 * 
*/
package com.nt.algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10, 60 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
				}
				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}// main
}// class