package com.HRank.String;

import java.util.Scanner;

public class Ex5 {

	
/*
 * 	https://www.hackerrank.com/challenges/alternating-characters
*/	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		int n = scan.nextInt();
		StringBuilder build = new StringBuilder();
		int[] result = new int[n];
		int count = 0;
		
		for(int i=0;i<n;i++){
			build.append(scan.next());
			count = 0;
			for(int j = 1; j< build.length(); j++){
				if(build.charAt(j) == build.charAt(j-1)){
					count++;
				}
			}
			
			//System.out.println(count);
			result[i] = count;
			build.delete(0, build.length());
			
		}
		
		for(int i = 0; i< result.length; i++){
			System.out.println(result[i]);
		}
		
		scan.close();
	}

}


