package com.HRank.String;

import java.util.Scanner;

/*https://www.hackerrank.com/challenges/richie-rich
*/

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		String S1 = scan.next();
		StringBuilder S = new StringBuilder(S1);
		
		if(S.length() == n){
			
			if(S1.equals(S.reverse())){
				System.out.println(S);
			}
			else{
				//
				S.reverse();
				int lastIndex = n-1;
				int i = 0;
				int count = 0;
				
				while(i < n/2){
/*					System.out.println(i);
					System.out.println(lastIndex-i);*/
					
					if(count >= k){
						break;
					}
					
					if(Character.getNumericValue(S.charAt(i)) != Character.getNumericValue(S.charAt(lastIndex-i))){
						count++;
						S.setCharAt(lastIndex-i,S.charAt(i));
					
					}
					i++;
				}
				
				if(S.toString().equals(S.reverse().toString())){
					System.out.println(S);
				}else{
					System.out.println("-1");
				}
				
			}

		}else{
			System.out.println("Invalid Input");
		}
	}

}
