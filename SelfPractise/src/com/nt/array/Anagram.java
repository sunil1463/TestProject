package com.nt.array;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Sunil";
		String s2 = "lunjsi";

		if (s1.length() != s2.length()) {
			System.out.println("Not anagram");
		} else {
			s1 = s1.toUpperCase();
			s2 = s2.toUpperCase();
			char[] ch1 = s1.toCharArray();
			Arrays.sort(ch1);
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2))
				System.out.println("anagram");
			else
				System.out.println("Not anagram");
		}
	}
}