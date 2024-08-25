package com.takeuforward.stack;

import java.util.Stack;

public class PostfixToInfix {
	
	public static void main(String[] args) {
		
		
		String str = "953+4*6/-";
		System.out.println(str);
		Stack<String> val = new Stack<String>();
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			int value = (int)ch;
			
			if(value <= 57 && value >= 48) {
				val.push(ch+"");
			}else {
				
				String val2 = val.pop();
				String val1 = val.pop();
				char c  = ch;
				
				// Postfix to infix  == val1 operator val2
				
				String string = "("+val1+ch+val2+")";
				val.push(string);
			}
			
		}
		System.out.println(val.pop());
	}
}
