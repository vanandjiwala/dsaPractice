package com.HRank.Implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] nk = new String[2];
		
		int t = Integer.parseInt(input.nextLine());
		ArrayList result = new ArrayList();
		for(int i_t = 0 ; i_t < t ; i_t++){
			nk = input.nextLine().split(" ");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			String[] a = new String[n];
			a = input.nextLine().split(" ");
			int count = 0;
			for(int j = 0;j<a.length;j++){
				if(Integer.parseInt(a[j]) <= 0){
					count += 1;
				}
			}

			if(count >= k){
				result.add("NO");
			}
			else{
				result.add("YES");
			}
			

			
			
		}
		
		for(int result_i=0; result_i<result.toArray().length;result_i++){
			System.out.println(result.toArray()[result_i]);
		}
		
			
	}

}
