package com.HRank.Java.Intro;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);   
        int i = 0;
           while(scan.hasNext()){
               i++;
               System.out.println(i + " " + scan.nextLine());
           }
	}

}
