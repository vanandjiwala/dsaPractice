package com.CCI.ArrayString;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1_3_Efficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine().toLowerCase();
		String b = scan.nextLine().toLowerCase();
		System.out.println(permuteCheck(StringSort(a),StringSort(b)));
		scan.close();

	}
	
	public static boolean permuteCheck(String s1, String s2){

		if(s1.equals(s2)){
			return true;
		}
		
		return false;
	}
	
	public static String StringSort(String s){
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		return String.valueOf(temp);	
	}

}
