package com.CCI.ArrayString;

import java.util.Scanner;

public class Ex1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		S = S.trim();
		System.out.println(reverseString(S));
	}
	
	public static String reverseString(String s){
		StringBuffer build = new StringBuffer(s);
		return build.reverse().toString();
		
	}

}
