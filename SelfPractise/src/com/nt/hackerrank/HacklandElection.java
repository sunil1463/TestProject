package com.nt.hackerrank;

public class HacklandElection {
	public static void main(String[] args) {

		String[] votes = { "Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary" };
		int[] arr = new int[votes.length];
		
		for (int i = 0; i < votes.length; i++) {
			System.out.print("");
			for (int j = 0; j < arr.length; j++) {
				if (votes[i].equals(votes[j])) {
					arr[i]++;
				}		
			}
			System.out.print(arr[i]+" ");
			
		}
		System.out.print("\n");
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			System.out.print(max+" ");
			
		}

		String s = "";
		for (int i = 0; i < votes.length; i++) {
			if (arr[i] == max) {
				if (votes[i].compareTo(s) > 0) {
					s = votes[i];
				}
			}
		}
		System.out.print("\n"); 
		System.out.println(s);
	}
}