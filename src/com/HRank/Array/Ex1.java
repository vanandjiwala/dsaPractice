package com.HRank.Array;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n = Integer.parseInt(input.nextLine());
		int array[] = new int[n];
		for(int i=0;i<n;i++){
			 
			array[i] = input.nextInt();	
			
		}
		
		
        for(int i=(array.length-1); i>=0; --i){
        	 
            System.out.print(array[i]+ " ");
        }
		
		input.close();
		
	}

}
