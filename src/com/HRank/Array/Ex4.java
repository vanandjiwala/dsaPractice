package com.HRank.Array;

import java.util.Scanner;

public class Ex4 {

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
		int temp = 0;
		StringBuffer buffer = new StringBuffer();
		
		for(int i=0;i<n;i++){
			inputArray[i] = input.nextInt();
		}
		
		
		for(int j_rotate=0;j_rotate<d;j_rotate++){
			
			for(int j=0;j<n-1;j++){
				if(j == 0){
					temp = inputArray[0];
				}
				
				inputArray[j] = inputArray[j+1];
			}
			inputArray[n-1] = temp;
		}
	
		for(int i = 0;i<inputArray.length;i++){
			buffer.append(inputArray[i]);
			buffer .append(" ");
		}
		
		System.out.println(buffer.toString());

		
	}

}
