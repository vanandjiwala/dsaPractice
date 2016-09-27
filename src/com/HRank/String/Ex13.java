package com.HRank.String;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int p = inputInt(scan);
		boolean result[] = new boolean[p];
		
		for(int i = 0; i < p ; i++){
			String a = inputString(scan);
			String b = inputString(scan);
			
			if(a.length() >= b.length()){
				
				 result[i] = checkSubstring(a, b);
				
				
			}else{
				result[i] = checkSubstring(b, a);
			}
			
		}
		
		PrintBooleanArray(result);
		scan.close();
	}
	
	
	public static boolean checkSubstring(String S, String B){
		char bCharArray[] = B.toCharArray();
		for(int i = 0; i<B.length(); i++){
			CharSequence seq = String.valueOf(bCharArray[i]);
			if(S.contains(seq)){
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

	static void PrintIntArray(int[] a){
		for(int i =0; i< a.length; i++){
			System.out.println(a[i]);
		}
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
