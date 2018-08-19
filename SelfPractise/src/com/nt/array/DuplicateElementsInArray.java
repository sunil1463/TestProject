package com.nt.array;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String[] str = {"jsp", "java", "jdbc", "servlet", "core", "java", "jsp", "sql", "html", "css" };
		
		for (int i = 0; i < str.length-1; i++) {
			for (int j= i+1 ; j < str.length; j++) {
				if(str[i].contains(str[j]) && i!=j) {
					System.out.println("Duplicate Elements : "+str[j]+" ");
				}
			}
		}

	}

}
