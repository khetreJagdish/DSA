package com.takeuforward.stack;

import java.util.Stack;

public class PrefixToPostfix {
	
	public static void main(String[] args) {
		
		String str = "-9/*+5346";
		
		Stack<String> stack = new Stack<String>();
		// whenever we are doining anything with Prefix then every time traverse from reverse
		for(int i = str.length()-1; i>= 0; i--) {
			char ch = str.charAt(i);
			int val = (int)ch;
			
			if(val >= 48 && val <= 57) {
				stack.push(String.valueOf(ch));
			}else {
				String s1 = stack.pop();
				String s2 = stack.pop();
				stack.push(s1+s2+ch);
			}
		}
	System.out.println(stack.pop());
	}
}
