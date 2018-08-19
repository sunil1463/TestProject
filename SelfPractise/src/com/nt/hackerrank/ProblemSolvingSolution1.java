package com.nt.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

@SuppressWarnings("unused")
public class ProblemSolvingSolution1 {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		int n = arr.length;
		float neg_count = 0;
		float pos_count = 0;
		float zero_count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				neg_count = neg_count + 1;
			} else if (arr[i] > 0) {
				pos_count = pos_count + 1;
			} else if (arr[i] == 0) {
				zero_count = zero_count + 1;
			}
		}
		System.out.println("negetive " + neg_count / n);
		System.out.println("positive " + pos_count / n);
		System.out.println("zero " + zero_count / n);

	}

	private static final Scanner scanner = new Scanner(System.in);

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int n = scanner.nextInt();
		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			int arrItem = scanner.nextInt();
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
