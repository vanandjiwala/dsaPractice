package com.HRank.String;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = inputInt(scan);
		int result[] = new int[t];
		String S = "";
		String a;
		String b;
		int count = 0;
		for(int i = 0;i<t;i++){
			S = inputString(scan).toLowerCase();
			count = 0;
			if(S.length() % 2 != 0){
				result[i] = -1;
			}else{
				char[] a1 = new char[S.length()/2];
				a = S.substring(0,S.length()/2);
				b = S.substring(S.length()/2);
				a1 = a.toCharArray();

				for(char c: a1){
					int index = b.indexOf(c);
					
					if(index == -1){
						count++;
					}else{
						b= b.substring(0,index)+ b.substring(index+1);
						
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
