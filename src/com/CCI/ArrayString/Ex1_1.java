package com.CCI.ArrayString;

import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(stringUnique(s));
		
		
	}
	
	public static boolean stringUnique(String S){
		boolean result[] = new boolean[256];
		//256 ascii, each index represent an ascii value
		for(int i = 0; i<S.length(); i++){
			
			if(result[(int)S.charAt(i)]){
				return false;
			}
			
			result[(int)S.charAt(i)] = true;
			
		}
		return true;
	}

}
