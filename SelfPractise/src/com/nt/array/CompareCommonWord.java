
package com.nt.array;

public class CompareCommonWord {

	public static void main(String[] args) {
		String s1 = "Himanshu";
		String s2 = "Hema";
		String s = "";
		int k = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = k; j < s2.length();j++) {
				if (s1.charAt(i)==s2.charAt(j)) {
					s = s+s1.charAt(i);
					k= j+1;
					break;
				}
			}
		}
		System.out.println(s);
	}
}