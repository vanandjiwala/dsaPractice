package com.CCI.ArrayString;

import java.util.Scanner;

public class Ex1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine().toLowerCase();
		String b = scan.nextLine().toLowerCase();
		System.out.println(permuteCheck(a,b));
		scan.close();
	}

	public static boolean permuteCheck(String s1, String s2){
		
		if(s1.length() != s2.length()){
			return false;
		}else{
			char[] a = s1.toCharArray();
			for(char c: a){
				
				if(s2.indexOf(c) == -1){
					return false;
				}
			}
			
		}

		return true;
	}
}
