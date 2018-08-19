package com.nt.array;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {

		public static void main (String[] args) {
			
			int[] arr ;
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int K = sc.nextInt();
			arr = new int[K];
			for(int i = 0; i<N; i++){
			    for(int j = 0; j<K; j++ ){
			         arr[j] = sc.nextInt();
			    }
			}
			
			for(int j = 0; j<K; j++ ){
		        System.out.print(arr[j]);
		    }
			
			
		}
	}

