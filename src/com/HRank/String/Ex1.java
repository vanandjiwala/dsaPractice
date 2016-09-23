package com.HRank.String;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * https://www.hackerrank.com/challenges/reduced-string
*/		
		
		
		Scanner scan = new Scanner(System.in);
		String input = new String();
		input = scan.next();
		for(int i = 1;i<input.length();i++){
			
			if(input.charAt(i) == input.charAt(i-1)){
				input = input.substring(0,i-1) + input.substring(i+1);			
				i = 0;
				
			}
		}
		
		if(input.length() == 0){
			System.out.println("Empty String");
		}else{
			System.out.println(input);
		}
		scan.close();
	}

}
