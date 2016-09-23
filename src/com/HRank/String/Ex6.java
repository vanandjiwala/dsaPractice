package com.HRank.String;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		StringBuilder build = new StringBuilder();
		int result[] = new int[26];
		boolean UniqueCheck[] = new boolean[26];
		int ascii = 0;
		int count = 0;
		
		for(int i = 0; i < n; i++){
			build.append(scan.next().toLowerCase());
			
			for(int j = 0; j< build.length(); j++){
				
				ascii = (build.charAt(j));
				//to get the index from 0 to 25
				if(!UniqueCheck[ascii-97]){
					UniqueCheck[ascii-97] = true;
					result[ascii-97] += 1;
				}
			}
			
			
			//reset the array
			Arrays.fill(UniqueCheck, false);
			build.delete(0, build.length());
			
		}
		
		for(int a: result){
			if(a == n){
				count++;
			}
		}
		
		System.out.println(count);
	}

}
