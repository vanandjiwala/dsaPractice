package com.HRank.String;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/string-construction


public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result[] = new int[n];
		StringBuilder build = new StringBuilder();
		StringBuilder p = new StringBuilder();
		int cost = 0;
		int charIndex = 0;
		
		for(int i = 0; i<n; i++){
			build.append(scan.next());
			cost = 0;
			
			for(int j=0; j<build.length(); j++){
				charIndex = p.indexOf(Character.toString(build.charAt(j)));
				if( charIndex == -1){
					p.append(build.charAt(j));
					cost++;
				}else{
					p.append(p.charAt(charIndex));
				}
//			System.out.println(p);	
			}
			
			result[i] = cost;
			build.delete(0, build.length());
			p.delete(0, p.length());
			
		}
		
		
		for(int i=0;i<n;i++){
			System.out.println(result[i]);
		}
		
	}

}
