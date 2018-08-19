package com.nt.array;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int[] input = { 1, 2, 2, 3, 3, 3, 4};
		int n = input.length;
		int j = 0;
		/*
		  With extra space 
		 */ 
		int num = 0;
		int[] temp = new int[n];
		  for (int i = 0; i < n-1; i++) { 
		  if (input[i] != input[i + 1]) { 
		  temp[num] =input[i]; 
		  num++;
		  } 
		  else 
		  temp[num] = input[n - 1]; 
		  }
		  
		 

		/*
		 * without extra space
		 

		for (int i = 0; i < n - 1; i++) {
			if (input[i] != input[i + 1]) {
				input[j] = input[i];
				j++;
			}
			
		}
		input[j] = input[n - 1];
		*/
		for (j = 0; j < n - 1; j++) {
			System.out.print(input[j]);
		}
	}
}