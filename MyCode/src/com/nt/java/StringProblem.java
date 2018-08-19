/*
 * 
 * 		You are given 2 Strings
 *		s1 = "carpenter"
 *		s2 = "nap"
 *		find common subsequence after reversing second string
 * 		answer = "pn" 
 * 
 */
package com.nt.java;

public class StringProblem {

	public static void main(String[] args) {
		String s1 = "carpenter";
		String s2 = "nap";
		String reverse = "";
		String s = "";
		for (int i = s2.length() - 1; i >= 0; i--) {
			reverse = reverse + s2.charAt(i);
		}
		int k = 0;
		for (int i = 0; i < reverse.length(); i++) {
			for (int j = k; j < s1.length(); j++) {
				if (s1.charAt(j) == reverse.charAt(i)) {
					s = s + s1.charAt(j);
					k = j + 1;
				}
			}
		}
		
		System.out.println(s1);
		System.out.println(reverse);
		System.out.println(s);
	}

}
