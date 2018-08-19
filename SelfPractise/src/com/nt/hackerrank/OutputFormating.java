package com.nt.hackerrank;

import java.util.Scanner;

public class OutputFormating {

	private static Scanner sc;
	static void javaOutputFormatting(String s1, int x) {
        System.out.printf("%-15s%03d%n", s1, x);
      }
        public static void main(String[] args) {
            sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.println("");
                //Complete this line                
                javaOutputFormatting(s1, x);
            }
            System.out.println("================================");
   }
}
