package com.takeuforward.stack;

import java.util.Stack;

public class PrefixToInfix {
	
	public static void main(String[] args) {
		
		String str = "-9/*+5346";
		
		Stack<String> stack = new Stack<String>();
		// whenever we are doining anything with Prefix then every time traverse from reverse
		for(int i = str.length()-1; i>= 0; i--) {
			char ch = str.charAt(i);
			int val = (int)ch;
			
			if(val >= 48 && val <= 57) {
				stack.push(ch+"");
			}else {
				String s1 = stack.pop();
				String s2 = stack.pop();
				
				stack.push("("+s1+ch+s2+")");
			}
		}
	System.out.println(stack.pop()); // (9-(((5+3)*4)/6))   

	}
}
