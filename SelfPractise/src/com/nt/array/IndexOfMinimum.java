package com.nt.array;

public class IndexOfMinimum {

	public static void main(String[] args) {
		int [] arr = {-9,-5,-10,0,5,1,0,10,6};
		int min = arr[0];
		int index  = 0;
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
				index = i;
			}
		}
		System.out.println("MIN " +min);
		System.out.println("INDEX " +index);

	}

}
