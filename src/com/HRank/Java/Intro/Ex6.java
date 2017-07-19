package com.HRank.Java.Intro;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 0; i < 10; i++){
            System.out.println(N + " x  "+ (i+1) +" = " + (N * (i+1)));
        }
	}

}
