package com.takeuforward.stack;

import java.util.Stack;

public class PostfixEvaluation {
	
	public static void main(String[] args) {
		
		String str = "953+4*6/-";
		
		Stack<Integer> stack =new Stack<Integer>();
		
		for(int i =0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			int  val = (int)ch;
			
			if(val <= 57 && val >= 48) {
				stack.push(Character.getNumericValue(ch));
			}else {
				int val2 = stack.pop();
				int val1 = stack.pop();
				if(ch == '+') {stack.push(val1 +  val2);}
				if(ch == '-') {stack.push(val1 -  val2);}
				if(ch == '/') {stack.push(val1 /  val2);}
				if(ch == '*') {stack.push(val1 *  val2);}				
			}
			
		}
		System.out.println(stack.pop());
		
	}
}
