package com.nt.array;

public class dupicateLetterInString {

	public static void main(String[] args) {
		String str = "Sunil Kumar";
		String s = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					s = s + ch[j];
				}
			}
		}
		System.out.println(s);
	}

}
