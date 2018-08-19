/*
 *             *
 *            * *
 *           *   *
 *          * * * *
 *  
 */
package com.nt.pattern;

public class trianglePattern {

	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n * 2; j++) {

				if (i + j == n + 1 || j - i == n - 1) {
					System.out.print("*");
				} else if (i == n && j != k) {
					System.out.print("*");
					k = k + 2;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}