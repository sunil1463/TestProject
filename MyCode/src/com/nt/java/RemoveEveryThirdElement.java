package com.nt.java;

public class RemoveEveryThirdElement {
	static String removeElement(String s) {
		String s1 = "";
		int l = (s.length() - (s.length() % 3));

		for (int i = 0; i < l; i++) {
			if ((i + 1) % 3 != 0) {
				s1 = s1 + s.charAt(i);

			}
		}
		String s3 = "";
		for (int i = l; i < s.length(); i++) {
			s3 = s3 + s.charAt(i);
		}
		return s3 + s1;
	}

	public static void main(String[] args) {
		String s = "abcdefghijk";

		while (s.length() >= 3) {
			System.out.println(s);
			s = removeElement(s);
		}
		System.out.println(s);
		// while
	}// main
}// class