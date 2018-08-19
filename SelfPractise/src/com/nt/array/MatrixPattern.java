package com.nt.array;

class MatrixPattern {
	public static void main(String[] args) {
		int a[][] = new int[5][5];

		matrixFunction(a);
	}
	public static void matrixFunction(int[][] a) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || j == 0 || i == 4 || j == 4) {
					a[i][j] = 1;
				} else
					a[i][j] = 0 ;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}