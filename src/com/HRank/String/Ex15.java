package com.HRank.String;
import java.util.Scanner;


public class Ex15 {

	
	
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        System.out.println(s.length());
        System.out.println(s.length()-(k-1));
        for(int i = 0; i < s.length()-(k-1) ;  i++){
        	String ss = s.substring(i, i+k);
        	System.out.println(s.substring(i, i+k));
        	if(i == 0){
        		smallest = ss;
        		largest = ss;
        	}else{
        		if(ss.compareTo(smallest) < 0){
        			smallest = ss;
        		}else if(ss.compareTo(smallest) > 0){
        			largest = ss;
        		}
        	}
        }
        
        return smallest + "\n" + largest;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
       	}

}
