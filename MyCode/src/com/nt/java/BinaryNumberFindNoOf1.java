package com.nt.java;

public class BinaryNumberFindNoOf1 {

	public static void main(String[] args) {
		int n = 6;
		int temp = n;
		int count = 0;
		int maxcount = 0;
		while (temp != 0) {
			int rem = temp % 2;
			if (rem == 1) {
				count++;
				if (count > maxcount) {
					maxcount = count;
					count = 0;
				}
			}
			temp = temp / 2;
			System.out.print(rem);
		}
		System.out.println("");
		System.out.println("no of 1's in " + n + " : " + maxcount);
	}
}