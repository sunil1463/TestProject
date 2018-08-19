package com.nt.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionBinary {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a No:");
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int i = 0;
		int count = 0;
		int binary[] = new int[100];

		while (n != 0) {
			binary[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (int j = 0; j <=i - 1 ; j++) {
			if(j==1) {
				count = count + 1;
				System.out.println(count);
			}
		}
		
		scanner.close();
	}
}
