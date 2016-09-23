package com.HRank.Implementation;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int x1,v1,x2,v2;
		x1=v1=x2=v2=0;
		String ResultNO = "NO";
		String ResultYES = "YES";
		int flag = 0;
		try {
			
			String[] jump = input.nextLine().split(" ");
			x1 = Integer.valueOf(jump[0]).intValue();
			v1 = Integer.valueOf(jump[1]).intValue();
			x2 = Integer.valueOf(jump[2]).intValue();
			v2 = Integer.valueOf(jump[3]).intValue();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

		if(x2 > x1 && v2 > v1 ){
			System.out.println(ResultNO);			
		}
		else{
			
			for(int i = 0; i < 10000; i++){
				x1 += v1;
				x2 += v2;
				if(x1 == x2){
					flag = 1;
					break;
				}	
			}
			if(flag == 1){
				System.out.println(ResultYES);
			}else if(flag == 0){
				System.out.println(ResultNO);
			}else{
				System.out.println("Something wrong");
			}
			
		}

	}

}
