package com.HRank.String;

import java.util.Scanner;

public class Ex18 {

	
	/**
	 * 
	 * https://www.hackerrank.com/challenges/java-string-tokens
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String delims = "[ .',?!]+";
        String[] tokens = s.split(delims);
        
        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
			
		}
        
        scan.close();
	}

}
