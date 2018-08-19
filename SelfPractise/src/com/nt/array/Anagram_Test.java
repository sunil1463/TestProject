package com.nt.array;

import java.util.Scanner;

public class Anagram_Test {
	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		} else {
			a = a.toUpperCase();
			b = b.toUpperCase();

			char[] ch = a.toCharArray();

			for (char c : ch) {
				int index = b.indexOf(c);
				if (index != -1) {
					b = b.substring(0, index) + b.substring(index + 1, b.length());
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}