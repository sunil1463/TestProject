package com.nt.java;

public class RemoveCharacterToMakeAnagram {

	private static int isAnagram(int[] arr1, int[] arr2) {
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (arr1[i] > arr2[i]) {
				count = count + (arr1[i]-arr2[i]);
			}
			if (arr2[i] > arr1[i]) {
				count = count + (arr2[i]-arr1[i]);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s1 = "unS";
		String s2 = "unS";
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) > 'A' && s1.charAt(i) < 'Z') {
				arr1[s1.charAt(i) - 'A']++;
			}
			if (s1.charAt(i) > 'a' && s1.charAt(i) < 'z') {
				arr1[s1.charAt(i) - 'a']++;
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) > 'A' && s2.charAt(i) < 'Z') {
				arr2[s2.charAt(i) - 'A']++;
			}
			if (s2.charAt(i) > 'a' && s2.charAt(i) < 'z') {
				arr2[s2.charAt(i) - 'a']++;
			}
		}

		System.out.println(isAnagram(arr1, arr2));
	}
}