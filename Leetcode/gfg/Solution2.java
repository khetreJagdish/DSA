package com.gfg;

public class Solution2 {
	
	public static void main(String[] args) {
		
	}
public static void reverseString(char[] s) {
        
        int i = 0;
        int j = s.length-1;
        
        while(j >= 0){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
        
    }
}
