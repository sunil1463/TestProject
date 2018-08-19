package com.nt.array;

import java.util.Scanner;

public class decimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal no :");
		int a = sc.nextInt();
		int input = a;
		String s = "";
		while (input != 0) {
			int temp = input % 2;
			s = s + temp;
			input = input / 2;
		}
		System.out.print("binary of " + a + " is :");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
