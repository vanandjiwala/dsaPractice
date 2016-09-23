package com.HRank.Implementation;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int count = 0;
                
        for(int i=0;i<n;i++){
        	int element = a[i];
        	for(int j=i;j<n;j++){
        		if(j != i){
        			int temp = element + a[j];
        			
        			if(temp % k == 0){
        				count +=1;
        				
        			}
        		}
        	}
        }

        System.out.println(count);
	}

}
