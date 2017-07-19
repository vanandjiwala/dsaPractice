package com.HRank.Java.String;

import java.util.Scanner;

public class Ex3 {
/**
 * https://www.hackerrank.com/challenges/reduced-string
 * @param args
 */
	
    static String super_reduced_string(String s){
    	for(int i = 1; i < s.length() ; i++){
    		if(s.charAt(i) == s.charAt(i-1)){
    			System.out.println(i-1);
    			s = s.substring(0, i-1) + s.substring(i+1);
    			i = 0;
    		}
    	}

    	return s;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
	}

}
