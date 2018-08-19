// wap to display your number is a  special 2 digit no. or not.

package com.nt.array;

public class SpecialNoOrNot {

	public static void main(String[] args) {
		int a = 21;
		int temp = a;
		int sum = 0;
		int mul =1;
		while(temp!=0) {
			int temp1 = temp% 10;
			sum = sum +temp1;
			temp = temp /10;
			mul= mul * temp1;
		}
		if (a == (sum+mul)) {
			System.out.println("special no");
		}
		else 
			System.out.println("not special no");
	}

}
