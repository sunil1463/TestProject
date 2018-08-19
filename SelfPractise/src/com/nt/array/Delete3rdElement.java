package com.nt.array;

public class Delete3rdElement {
	public static void main(String[] args) {

		char[] chArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' };
		int n = 3;
		char[] newChArray = new char[chArray.length - chArray.length / n];
		int j = 0;
		for (int i = 0; i != chArray.length; i++) {
			if ((i + 1) % n != 0) {
				newChArray[j++] = chArray[i];
			}
		}

		for (int i = 0; i < newChArray.length; i++) {
			System.out.print(newChArray[i] + " ");
		}
	}
}
