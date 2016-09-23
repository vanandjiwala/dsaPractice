package com.HRank.Commons;
import java.util.ArrayList;


public class PrintUtils {

	public static void PrintAListInt(ArrayList<Integer> list){
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	public static void PrintIntArray(int[] input){
		StringBuffer buffer = new StringBuffer();
		for(int i = 0;i<input.length;i++){
			buffer.append(input[i]);
			buffer .append(" ");
		}
		
		System.out.println(buffer.toString());
		
		
	}
	
	
}
