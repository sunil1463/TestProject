package com.nt.array;

import java.util.Arrays;

public class EqualityofTwoArray {

	public static void main(String[] args) {
		int[] arr1 = { 21, 57, 11, 37, 24 };
		int[] arr2 = { 21, 57, 37, 11, 24 };
		// boolean status = true;
		
		if(Arrays.equals(arr1, arr2)){
			System.out.println("same");
		}
		else {
			System.out.println("false");
		}
				
	}

}
