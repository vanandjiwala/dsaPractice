package com.HRank.Java.String;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
                                     
        String[] result = s.split("[ .,?!'@]+");
        for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
        scan.close();

	}

}
