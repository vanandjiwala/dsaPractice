package com.HRank.Array;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = 6;
		int matrix[][] = new int[n][n];
		int result = Integer.MIN_VALUE;
		
		
		for(int i=0;i<n;i++){	
			for(int j=0;j<n;j++){
				matrix[i][j] = input.nextInt();	
			}
		}
		int count = 0;
		for(int i=0;i<n-2;i++){	
			
			for(int j=0;j<n-2;j++){
				count++;
				int sum = 0;
				sum = (matrix[i][j]+
					matrix[i][j+1]+
					matrix[i][j+2]+
					matrix[i+1][j+1]+
					matrix[i+2][j]+
					matrix[i+2][j+1]+
					matrix[i+2][j+2]
				);
				System.out.println(sum);
				if(sum > result){
					result = sum;
				}
			}
		}
		
		System.out.println(result);
		input.close();
		
	}

}
