package com.HRank.String;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		StringBuilder build = new StringBuilder();
		StringBuilder reverseBuild = new StringBuilder();
		int offset = 0;
		
		for(int i = 0; i<t; i++){
			build.append(scan.next());
			reverseBuild.append(build.reverse().toString());
			if(build.toString().equals(reverseBuild.toString())){
				System.out.println("-1");
			}else{
				build.reverse();
				offset = build.length()/2;
				for(int j = 0; j<offset; j++){
					
					if(build.charAt(j) != build.charAt(j)){
						
						System.out.println(build.toString().substring(0, i));
						
						
					}
					
					System.out.println(j);
				}
				
				
			}
			
			
		}
	}

}
