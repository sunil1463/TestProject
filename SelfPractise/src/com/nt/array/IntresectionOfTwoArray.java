package com.nt.array;

import java.util.HashSet;

public class IntresectionOfTwoArray {
	
	public static void main(String[] args) {
		String[] str1 = {"ONE","TWO","SIX","FIVE","FOUR","THREE","SEVEN"};
		String[] str2 = {"SIX","ONE","NINE","ELEVEN","SEVEN"};
		
		
		HashSet<String> set = new HashSet<>();
		
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if(str1[i].equals(str2[j])) {
					set.add(str1[i]);
				}
			}
		}
		System.out.println(set);

	}

}
