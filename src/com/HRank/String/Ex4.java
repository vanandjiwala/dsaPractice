package com.HRank.String;

import java.util.Scanner;

public class Ex4 {

	/*https://www.hackerrank.com/challenges/beautiful-binary-string
*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String S = scan.next();
		String Pattern = "010";
		StringBuilder build = new StringBuilder(S);
		int count = 0;
		
		for(int i=0;i<n-2;i++){
						
			if(build.substring(i, i+3).equals(Pattern)){
				if((i+3) == n){
					build.setCharAt(i+1, '0');
					count++;
				}else{
					build.setCharAt(i+2, '1');
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
