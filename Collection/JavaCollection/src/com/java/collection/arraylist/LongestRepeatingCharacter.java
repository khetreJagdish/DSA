package com.java.collection.arraylist;

import java.util.HashMap;

public class LongestRepeatingCharacter {
			
	public static int characterReplacement(String s, int k) {

		        int maxLength = 0;
		        for(int i = 0; i<s.length(); i++){
		            HashMap<Character,Integer> map = new HashMap<>();
		            int maxF = 0;
		            for(int j = i; j<s.length(); j++){
		                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
		                maxF = Math.max(maxF,map.get(s.charAt(j)));
		                int changes = (j-i+1)-maxF;

		                if(changes <= k){
		                    maxLength = Math.max(maxLength,j-i+1); 
		                }else{
		                    break;
		                }
		            }
		        }
		    return maxLength;
	}
	public static void main(String[] args) {
		System.out.println(characterReplacement("AABABBA",2));
	}
}
