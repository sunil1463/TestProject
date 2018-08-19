package com.nt.java;

import java.util.Random;

public class primeOrNot {

	public static void main(String[] args) {

		Random rc = new Random(); // taking random input nos

		int input = rc.nextInt(100); // it will generate two digit random nos
		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(input); i++) {
			if (input % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(input + " is prime no");
		} else {
			System.out.println(input + " is not prime no");
		}

	}// main
}// class