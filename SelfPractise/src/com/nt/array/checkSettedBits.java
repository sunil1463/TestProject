package com.nt.array;

public class checkSettedBits {

	public static void main(String[] args) {
		int input = 101010101;
		int zeroCount = 0;
		int oneCount = 0;
		
		while(input!=0) {
			int temp = input % 10;
			input  = input /10;
			
			if(temp == 0) {
				zeroCount = zeroCount + 1;
			}
			else if(temp == 1) {
				oneCount = oneCount +1;
			}
		}
		System.out.println("No of zeros "+zeroCount);
		System.out.println("No of Ones "+oneCount);

	}

}