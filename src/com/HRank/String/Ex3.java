package com.HRank.String;

import java.util.Scanner;

public class Ex3 {

	/*
	 * https://www.hackerrank.com/challenges/pangrams
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String S = scan.nextLine();
		S = S.toUpperCase();
		boolean resultFlag = true;
		boolean[] result = new boolean[255];
		
		for(int i = 0; i< S.length(); i++){
			
			int ascii = S.charAt(i);
			if(ascii >= 65 && ascii <=90){
				if(!result[ascii]){
					result[ascii] = true;				
				}
			}
		}
			
		for(int j = 65; j<=90; j++){
			
			if(!result[j]){
				resultFlag = false;
			}
			
		}
		
		
		if(resultFlag){
			System.out.println("pangram");
		}else{
			System.out.println("not pangram");
		}
		
		scan.close();
		
	}

}

