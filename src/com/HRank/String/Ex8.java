package com.HRank.String;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String S = scan.next().toUpperCase();
		String Pattern = "SOS";
		int count = 0;
		if((S.length())%4 == 0){
//			 
			for(int i = 0;i< S.length(); i+=3){
				System.out.println(S.substring(i, i+3));
				if(!(S.substring(i, i+3).equals(Pattern))){
					System.out.println(S);
					if(S.charAt(i) != Pattern.charAt(i)){
						count++;
					}else if(S.charAt(i+1) != Pattern.charAt(i+1)){
						count++;
					}else if(S.charAt(i+2) != Pattern.charAt(i+2)){
						count++;
					}
				}else{
					System.out.println("No Operation");
				}
			}
		System.out.println(count);
		}
		else{
			System.out.println("Incorrect Input");
		}
				
				
	}

}
