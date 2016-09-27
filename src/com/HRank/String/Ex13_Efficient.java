package com.HRank.String;

import java.util.Scanner;

public class Ex13_Efficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int p = inputInt(scan);
		boolean result[] = new boolean[p];
		
		for(int i = 0; i < p ; i++){
			String a = inputString(scan).toLowerCase();
			String b = inputString(scan).toLowerCase();

			result[i] = checkSubstring(a, b);

		}
		
		PrintBooleanArray(result);
		scan.close();
	}
	
	
	public static boolean checkSubstring(String S, String B){
		char bCharArray[] = ("abcdefghijklmnopqrstuvwxyz").toCharArray();
		for(int i = 0; i<bCharArray.length; i++){
			
			if((S.indexOf(bCharArray[i]) != -1) && (B.indexOf(bCharArray[i]) != -1)){
				return true;
			}
		
			
		}
		
		return false;
	}
	
	public static int inputInt(Scanner scan){
		return scan.nextInt();
	}
	
	public static String inputString(Scanner scan){
		return scan.next();
	}


	
	static void PrintBooleanArray(boolean[] a){
		for(int i =0; i< a.length; i++){
			if(a[i]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
