package com.nt.dataStrucure;

public class InsertionSortTechnique {

	public static void main(String[] args) {
		int[] list = { 50, 40, 30, 20, 10, 60 };
		int i, j = 0, key = 0, temp;

		for (i = 0; i < list.length; i++) {
			key = list[i];
			j = i - 1;
			while (j >= 0 && key < list[j]) {
				temp = list[j];
				list[j] = list[j + 1];
				list[j + 1] = temp;
				j--;
			}
		}
		for (i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}