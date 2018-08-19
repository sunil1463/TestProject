package com.nt.array;

public class reverseInteger {

	public static void main(String[] args) {
		int a = 87654321;
		String s = "";
		while (a != 0) {
			int temp = a % 10;
			s = s + temp;
			a = a / 10;
		}
		System.out.println("Reverse of no: "+s);

	}

}
