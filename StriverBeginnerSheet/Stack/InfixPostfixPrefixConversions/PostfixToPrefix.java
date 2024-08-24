package com.takeuforward.stack;

import java.util.Stack;

public class PostfixToPrefix {
	
	public static void main(String[] args) {
		
		String str ="953+4*6/-";
		
		Stack<String> stack = new Stack<String>();
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			int val = (int)ch;
			
			if(val >= 48 && val <= 57) {
				stack.push(String.valueOf(ch));
			}else {
				String value2 = stack.pop();
				String value1 = stack.pop();
				
				stack.push(ch+value1+value2);
			}
		}
		System.out.println(stack.pop());
	}
}
