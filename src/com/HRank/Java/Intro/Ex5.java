package com.HRank.Java.Intro;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            
            String num = String.format("%03d", x);
            String result = String.format("%-15s", s1);
            System.out.println(result + num);
        }
        System.out.println("================================");
	}

}
