package com.nt.array;

public class SumOfDigits {

	public static void main(String[] args) {
		int a = 1555555;
		int temp = a;
		int sum = 0 ;
		while(temp!=0) {
			int temp1 = temp % 10; // 2
			sum = sum + temp1;
			temp = temp / 10;
			
		}
		System.out.println(sum);
	}

}
