package com.nt.array;

public class ArmStrongNo {

	public static void main(String[] args) {
		int a = 54748;
		int temp = a;
		int noOgDigit = String.valueOf(a).length();
		int sum = 0;
		while (temp != 0) {
			int div = temp % 10;
			int temp2 = 1;
			for (int i = 1; i <= noOgDigit; i++) {
				temp2 = temp2 * div;
			}
			sum = sum + temp2;
			temp = temp / 10;
		}

		if (sum == a) {
			System.out.println("Armstrong");
		} else
			System.out.println("Not an armstrong");
	}
}
