package com.HRank.Commons;

public class ArrayOperationUtils {

	public static void rotateleft(int[] intArray){
		int n = intArray.length;
		int temp = 0;
		for(int j=0;j<n-1;j++){
			if(j == 0){
				temp = intArray[0];
			}
			
			intArray[j] = intArray[j+1];
			
		}
		intArray[n-1] = temp;
		
		PrintUtils.PrintIntArray(intArray);
	}

}
