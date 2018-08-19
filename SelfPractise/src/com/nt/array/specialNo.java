package com.nt.array;

import java.util.Scanner;

public class specialNo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int input = sc.nextInt();
		int temp = input;
		int sum = 0;
		int fact = 1;
		while (temp != 0) {
			int temp1 = temp % 10;
			fact = 1;
			for (int i = 1; i <= temp1; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			temp = temp / 10;
		}
		//System.out.println(sum);
		if (sum == input) {
			System.out.println("special no");
		} else {
			System.out.println("Not a special No");
		}
	}
}