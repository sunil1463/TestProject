package com.nt.array;

import java.util.Scanner;

public class divisorOfaPassedNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int a = sc.nextInt() ;
		for (int i=1 ; i<=a/2; i++) {
			if(a%i==0)
			System.out.print(i+" ");
		}
	}
}
