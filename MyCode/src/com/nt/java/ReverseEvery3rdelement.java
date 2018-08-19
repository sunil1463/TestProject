package com.nt.java;

public class ReverseEvery3rdelement {
	public static void main(String[] args) {
		String s1 = "my name is sunil";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				s2 = s2 + '!';
			} else {
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s2);
	
		char[] ch = s2.toCharArray();
		for (int i = 0; i < s2.length(); i += 3) {
			int left = i;
			int right = Math.min(i + 3 - 1, s2.length() - 1);
			char temp;
			while (left < right) {
				temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left = left + 1;
				right = right - 1;
			}
		}
		System.out.println(ch);
		/*	
		String s3= "";
		for (int i = 0; i < s2.length(); i+=3) {
			int k = 2;
			while(k>=0 && (i+k)<s2.length()) {
				s3+= s2.charAt(i+k);
				k--;
			}
		}
		int k=s2.length()-(s2.length()%3);
		
		for (int i = k; i < s2.length(); i++) {
			s3+=s2.charAt(i);
		}
		System.out.println(s3);
		*/
	}
}