package com.nt.array;

public class Bomb {
	public static void main(String[] args) {
		int[][] a = { { 1, 0, 0, 1, 1 }, { 0, 1, 0, 0, 1 }, { 1, 0, 1, 0, 1 }, { 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 0 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == 1) {
					if (i < a.length - 1 && a[i + 1][j] == 0) {
						a[i][j]++;
					}

					if (i > 0 && a[i - 1][j] == 0) {
						a[i][j]++;
					}

					if (j < a.length - 1 && a[i][j + 1] == 0) {
						a[i][j]++;
					}

					if (j > 0 && a[i][j - 1] == 0) {
						a[i][j]++;
					}

					if (i > 0 && j < a.length - 1 && a[i - 1][j + 1] == 0) {
						a[i][j]++;
					}

					if (j > 0 && i < a.length - 1 && a[i + 1][j - 1] == 0) {
						a[i][j]++;
					}

					if (j < a.length - 1 && i < a.length - 1 && a[i + 1][j + 1] == 0) {
						a[i][j]++;
					}

					if (j > 0 && i > 0 && a[i - 1][j - 1] == 0) {
						a[i][j]++;
					}
				}
			}
		}
		System.out.println("\n");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] != 0) {
					a[i][j]--;
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
