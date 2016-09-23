package com.HRank.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] NQ = new String[2];
		int inputoparams = 3;
		int seq_index = 0;
		int x = 0;
		int y = 0;
		//query types 2
		int query_type = 1;
		int lastAns = 0;
		NQ = input.nextLine().split(" ");
		int n = Integer.parseInt(NQ[0]);
		int q = Integer.parseInt(NQ[1]);
		//three input params: q, x, y
		int matrix[][] = new int[q][inputoparams];
		ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();
		
		for(int i =0; i<n ;i++){
			ArrayList<Integer> temp = new ArrayList<Integer>();
			seqList.add(temp);
		}
		
		for(int query_i = 0; query_i<q;query_i++){
			for(int col=0; col < inputoparams ; col++){
				matrix[query_i][col] = input.nextInt();
			}
		}
		
		
		for(int read_i=0; read_i < q ; read_i++){
			query_type = matrix[read_i][0];
			x = matrix[read_i][1];
			y = matrix[read_i][2];
					
			if(query_type == 1){
				seq_index = ((matrix[read_i][1])^lastAns) % n;
				seqList.get(seq_index).add(y);
			}
			else if(query_type == 2){
				seq_index = ((matrix[read_i][1])^lastAns) % n;
				lastAns = seqList.get(seq_index).get(y % (seqList.get(seq_index).size()));
				System.out.println(lastAns);
			}else{
				System.out.println("Something is wrong!!!");
			}
		}
		
		
		input.close();
		

		
	}

}
