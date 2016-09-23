package com.HRank.Array;

import java.util.Scanner;

public class Ex4_Efficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
       	Scanner input = new Scanner(System.in);
		int[] nd = new int[2];
		for(int i=0;i<2;i++){
			nd[i] = input.nextInt();
		}
		
		int n = nd[0];
		int d = nd[1]; 
        int[] inputArray = new int[n];
        StringBuffer buffer = new StringBuffer();
        
        for(int i=0;i<n;i++){
			inputArray[(i+n-d)%n] = input.nextInt();
		}
        
        for(int i = 0;i<inputArray.length;i++){
			buffer.append(inputArray[i]);
			buffer.append(" ");
		}
		
		System.out.println(buffer.toString());
	}

}
