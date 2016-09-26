package com.HRank.String;

import java.util.Scanner;

public class Ex11_Efficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = inputInt(scan);
		int result[] = new int[t];
		StringBuilder build = new StringBuilder();
		String s = "";
		int last = 0;
		int count = 0;
		for(int i = 0; i< t; i++){
			s = inputString(scan);
			last = s.length() - 1;
			build.append(s.toString());
			count = 0;
			
			if(s.equals(build.reverse())){
				result[i] = count;
				build.delete(0, build.length());
				break;
			}
			else{
				
				for(int j = 0; j< s.length()/2; j++){
					if(s.charAt(j) != s.charAt(last - j)){
						count += Math.abs(((int)s.charAt(j)) - ((int)s.charAt(last - j))); 
					}
				}
				
				result[i] = count;
				build.delete(0, build.length());
				
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
