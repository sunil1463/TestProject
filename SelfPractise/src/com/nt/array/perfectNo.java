package com.nt.array;

import java.util.Scanner;

public class perfectNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no: ");
		int a = sc.nextInt();
		int temp = a;
		int sum = 0;
		for (int i = 1; i <= a / 2; i++) {
			if (a % i == 0) {
				 //System.out.print(i + " ");
				sum = sum + i;
			}
		}
		if (sum == temp) {
			System.out.println("perfact no");
		} else
			System.out.println("Not perfact no");

	}
}
