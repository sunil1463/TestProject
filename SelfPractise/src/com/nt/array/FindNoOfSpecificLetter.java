package com.nt.array;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindNoOfSpecificLetter {

	public static void main(String[] args) {
		String st = "asdsdssncaocnacnasdsasd";
		char[] ch = st.toCharArray();
		int count = 0;
		Set<String> s1 = new TreeSet<>();
		Arrays.sort(ch);
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			s1.add(ch[i] + " " + count);
		}
		System.out.println(s1);
	}

}