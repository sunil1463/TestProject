package com.nt.array;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] m2 = { { 7, 8 }, { 9, 10 }, { 11, 12 } };
		int[][] resultant = new int[2][2];
		int sum = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					sum = sum + m1[i][k] * m2[k][j];
				}
				resultant[i][j] = sum;
				sum = 0;
			}

		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(resultant[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
