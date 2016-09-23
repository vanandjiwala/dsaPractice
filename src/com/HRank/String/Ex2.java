package com.HRank.String;

import java.util.Scanner;

public class Ex2 {
	/*
	 * https://www.hackerrank.com/challenges/camelcase
	 * 
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int count = 0;
		for(int i = 0; i< S.length(); i++){
			int ascii = S.charAt(i);
			
			if(ascii >= 56 && ascii <=90){
				count++;
			}
		}
		
		System.out.println(count+1);
	}

}
