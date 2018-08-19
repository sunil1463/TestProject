package com.nt.array;

import java.util.Scanner;

public class SimpleIntrest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float SI;
		System.out.println("enter time");
		float time = sc.nextFloat();
		System.out.println("enter rate of intrest");
		float rate = sc.nextFloat();
		System.out.println("principle amount");
		int principle = sc.nextInt();
		
		SI = (principle*rate*time)/100;
		System.out.println("Simple Interest = "+SI);
	}

}
