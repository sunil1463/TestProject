package com.nt.array;

public class FindIsOrNotIdentityMatrix {

	public static void main(String[] args) {
		int a[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		System.out.println(IdentityMatrix(a)?"Identity matrix":"not identity matrix");
	}
	public static boolean IdentityMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j && a[i][j] != 1)
					return false;
				else if (i != j && a[i][j] != 0)
					return false;
				else
					return true;
			}
		}
		return true;
	}

}