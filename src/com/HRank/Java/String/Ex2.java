package com.HRank.Java.String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String pattern = in.nextLine();
	             //Write your code
	         try{
	        	 Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
	      }
	}

}
