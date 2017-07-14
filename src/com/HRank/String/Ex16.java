package com.HRank.String;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        StringBuffer obj = new StringBuffer(A);
        if(A.equals(obj.reverse().toString())){
        	System.out.println("Yes");
        }
        
	}

}
