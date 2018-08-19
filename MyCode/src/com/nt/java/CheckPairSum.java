package com.nt.java;
public class CheckPairSum {
	
	public static int printpairs(int[] arr, int n) {
		int count = 0 ;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int sum = arr[i]+arr[j];
				if(sum==n) {
					count++;
				}
			}		
		}
		return count;
	}
	public static void main(String[] args) {
		 int arr[] = {1, 2, 4, 45, 6, 9, 8};
	        int n = 10;
	        int value =printpairs(arr,  n);
	        System.out.print(value);
	}	
}