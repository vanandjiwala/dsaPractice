package com.HRank.String;

import java.util.Scanner;

public class Ex11 {
	
//	https://www.hackerrank.com/challenges/the-love-letter-mystery

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String S = "";
		StringBuilder build = new StringBuilder();
		int last = 0;
		int result[] = new int[t];
		int count = 0;
		for(int i = 0; i < t; i++){
			S = scan.next().toLowerCase();
			last = S.length() - 1;
			build.append(S);
//			System.out.println(build);
			count = 0;
			
			for(int j = 0; j< S.length()/2; j++){
					
					if(S.equals(build.reverse().toString())){
						//
						//reset stringbuilder
						build.delete(0, build.length());
						result[i] = count;
						break;
					}
					//getting back the original string
					build.reverse();
					if(S.charAt(j) == S.charAt(last - j)){
						continue;
					}else if(S.charAt(j) > S.charAt(last - j)){
//						System.out.println("Option 1: "+ (S.charAt(j) > S.charAt(last - j)));
						if((((int)build.charAt(j))-1) >= 97){
							build.setCharAt(j, (char)(((int)build.charAt(j))-1));
							S = build.toString();
//							System.out.println("String in option 1: " + S);
//							if(S.charAt(j) != S.charAt(last - j)){
//								j = -1;
//							}
							count++;
							j = -1;
						}
					}else{
//						System.out.println("Option 2: "+ (S.charAt(j) < S.charAt(last - j)));
						//build.setCharAt(last-j, (char)(((int)build.charAt(last-j))+1));
						if((((int)build.charAt(last-j))-1) >= 97){
							build.setCharAt(last-j, (char)(((int)build.charAt(last-j))-1));
							S = build.toString();
//							System.out.println("String in option 2: " + S);
//							if(S.charAt(j) != S.charAt(last - j)){
//								j = -1;
//							}
							count++;
							j = -1;
						}
						
					}

				}
			
			//reset stringbuilder
			build.delete(0, build.length());
			
		}
		
		PrintIntArray(result);
		scan.close();
	}
	
	static void PrintIntArray(int[] a){
		for(int i =0; i< a.length; i++){
			System.out.println(a[i]);
		}
	}
	

}
