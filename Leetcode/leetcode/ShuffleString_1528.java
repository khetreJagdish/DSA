package com.leetcode;

public class ShuffleString_1528 {
	public static void main(String[] args) {
		
		int[] arr = {4,5,6,7,0,2,1,3};
		String s = restoreString("codeleet", arr);
		System.out.println(" --  > "+s);
	}
	
	public static String restoreString(String s, int[] indices) {
        // codeleet
        int stringLength = s.length();
        char[] charArr = new char[stringLength];
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i< stringLength; i++){
            charArr[indices[i]] = s.charAt(i);
          //                      =   c 
        }
        sb.append(charArr);
        return sb.toString();
    }
}
