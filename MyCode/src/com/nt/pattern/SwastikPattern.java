/*
 * 				*   * * *
 * 				*	*
 * 				* * * * *
 *                  *   *
 *              * * *   *
 *              
 * */
package com.nt.pattern;

public class SwastikPattern {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==n/2 || j==n/2) {
					System.out.print("* ");
				}
				else if(j==0 && i<n/2) {
					System.out.print("* ");
				}
				else if(j==n-1 && i>n/2) {
					System.out.print("* ");
				}
				else if(i==0 && j>n/2) {
					System.out.print("* ");
				}
				else if(i==n-1 && j<n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");	
		}
	}
}
