package com.nt.hackerrank;

import java.util.*;

public class SolutionException {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		try {
			int n = Integer.parseInt(S);
			System.out.println(n);
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}
}