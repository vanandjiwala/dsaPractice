package com.HRank.String;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String S = scan.next().toUpperCase();
		
		String Pattern = "SOS";
		String expected = "";
		int count = 0;
		if((S.length())%3 == 0){
			StringBuilder build = new StringBuilder();
			for(int i=0;i<(S.length()/3);i++){
				build.append(Pattern);
			}
			expected = build.toString();
			
			int i = 0;
			while (i < S.length()) {
				
				if(expected.charAt(i) != S.charAt(i)){
					count++;
				}

				i++;	
			}
			
			
		System.out.println(count);
		}
		else{
			System.out.println("Incorrect Input");
		}
		
		scan.close();
				
	}

}
