package com.recursion;
public class ReverseStringUsingRecursion {
    public static String reverseString(String str) {
        // Write your code here.
    	char[] ch = str.toCharArray();
        return reverseArrayRecursively(ch,0,str.length()-1);
    }

    static String reverseArrayRecursively(char[] ch, int low, int high){
		
    	if(low > high) {
    		return new String(ch);
    	}
    	char temp = ch[low];
    	ch[low] = ch[high];
    	ch[high] = temp;
    	
    	return reverseArrayRecursively(ch, ++low, --high);
    	
    }

}