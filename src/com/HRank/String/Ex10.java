package com.HRank.String;

import java.util.Scanner;

public class Ex10 {
	
	
//	https://www.hackerrank.com/challenges/palindrome-index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		StringBuilder build = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		int offset = 0;
		int n = 0;
		int result[] = new int[t];
		
		for(int i = 0; i<t; i++){
			build.append(scan.next());
			temp.append(build.toString());
			n = build.length()/2;
			//System.out.println(build);
			if(build.toString().equals(build.reverse().toString())){
				result[i] = -1;
			}else{
				build.reverse();
				offset = build.length() - 1;
				//System.out.println("offset is " + offset);
				for(int j = 0; j<n; j++){
					
					if(build.charAt(j) != build.charAt(offset - j)){

						if((temp.deleteCharAt(j).toString()).equals(temp.reverse().toString())){
							
							build.deleteCharAt(j);
							//System.out.println(j);
							result[i] = j;
							break;
						}else{
							
							build.deleteCharAt(offset - j);
							//System.out.println(offset - j);
							result[i] = offset - j;
							break;
						}
						
						
					}
					
					
				}
				
				
			}
			
			build.delete(0, build.length());
			temp.delete(0, temp.length());
			
		}
		
		for(int i=0;i < result.length; i++){
			System.out.println(result[i]);
		}
		
		scan.close();
		
	}

}
