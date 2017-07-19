package com.HRank.Java.Intro;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;
            StringBuffer buffer = new StringBuffer();
            for(int j = 0; j < n ; j++){
            	if(j == 0){
            		result = (int) (result + a + ((Math.pow(2, j))*b));
            	}else{
            		result = (int) (result + ((Math.pow(2, j))*b));
            	}
            	buffer.append(result).append(" ");
            	
            }
            
            System.out.println(buffer.toString().trim());
        }
        in.close();

	}

}
