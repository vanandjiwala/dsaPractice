package com.HRank.String;

import java.util.HashMap;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		StringBuilder build = new StringBuilder();
		StringBuilder reverseBuild = new StringBuilder();
		int S_diff = 0;
		int R_diff = 0;
		boolean flag = true;
		
		for(int i = 0; i < n ; i++){
			build.append(scan.next().trim());
			reverseBuild.append(build.toString());
			reverseBuild = reverseBuild.reverse();
			
			for(int j=1; j<build.length();j++){
				S_diff = Math.abs((build.charAt(j)-build.charAt(j-1)));
//				System.out.println(build.charAt(j) + "-" + build.charAt(j-1));
				R_diff = Math.abs((reverseBuild.charAt(j)-reverseBuild.charAt(j-1)));
//				System.out.println(reverseBuild.charAt(j) + "-" + reverseBuild.charAt(j-1));
//				System.out.println(S_diff + "||||" + R_diff);
				if(S_diff != R_diff){
					flag = false;
					break;
				}
			}
			
			if(flag){
				System.out.println("Funny");
			}else{
				System.out.println("Not Funny");
			}
			
			build.delete(0, build.length());
			reverseBuild.delete(0, reverseBuild.length());
			flag = true;
			
		}
		
	}

}
