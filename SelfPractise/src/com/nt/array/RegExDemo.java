package com.nt.array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExDemo {
	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("i");
		Matcher m = p.matcher("sunil kumar");
		while (m.find()) {
			count++;
			System.out.println(m.start()+"..."+m.group()+" ");

		}
		System.out.println(" ");
		System.out.println("The no of occurance " + count );
	}
}