package com.nt.java;

public class ReverseByWord {

	public static void main(String[] args) {
		String str = "programming love i &#034;";
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
		System.out.println(" ");
		for (int i = st.length - 1; i >= 0; i--) {
			System.out.print(st[i] + " ");
		}
	}
}
