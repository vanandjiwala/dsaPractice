package com.HRank.String;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = inputInt(scan);
		int result[] = new int[t];
		String S = "";
		int count = 0;
		for(int i = 0;i<t;i++){
			S = inputString(scan).toLowerCase();
			count = 0;
			if(S.length() % 2 != 0){
				result[i] = -1;
			}else{
				
				for(int j = 0; j<S.length()/2;j++){
					if(S.charAt(j) != S.charAt(S.length() -1 - j)){
						count++;
					}
				}
				
				result[i] = count;
				S = "";
				
			}
		}
		
		PrintIntArray(result);
		scan.close();
		
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
	

}
