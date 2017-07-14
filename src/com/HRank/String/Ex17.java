package com.HRank.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex17 {
	
    static boolean isAnagram(String a, String b) {
        // Complete the function
    	a = a.toLowerCase();
    	b = b.toLowerCase();
    	HashMap<Character, Integer> objA = new HashMap<Character, Integer>();
    	for(int i = 0 ; i<a.length() ; i++){
    		if(objA.get(a.charAt(i)) == null){
    			objA.put(a.charAt(i), 1);
    		}else{
    			int index = objA.get(a.charAt(i));
    			objA.put(a.charAt(i), index + 1);
    		}
    	}
    	
    	
    	HashMap<Character, Integer> objB = new HashMap<Character, Integer>();
    	for(int i = 0 ; i<b.length() ; i++){
    		if(objB.get(b.charAt(i)) == null){
    			objB.put(b.charAt(i), 1);
    		}else{
    			int index = objB.get(b.charAt(i));
    			objB.put(b.charAt(i), index + 1);
    		}
    	}
    	
    	for (Character c : objA.keySet()) {
    		   System.out.println("key: " + c + " value: " + objA.get(c));
    	}

    	for (Character d : objB.keySet()) {
 		   System.out.println("key: " + d + " value: " + objB.get(d));
 	}

    	
    	if(objA.equals(objB)){
    		return true;
    	}else{
    		return false;
    	}
    	
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
