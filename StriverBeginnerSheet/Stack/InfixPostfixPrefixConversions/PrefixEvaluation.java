package com.takeuforward.stack;

import java.util.Stack;

public class PrefixEvaluation {
	
	public static void main(String[] args) {
		
		String str = "-9/*+5346";
		
		Stack<Integer> stack =new Stack<Integer>();
		
		for(int i =str.length()-1; i>=0; i--) {
			
			char ch = str.charAt(i);
			int  val = (int)ch;
			
			if(val <= 57 && val >= 48) {
				stack.push(Character.getNumericValue(ch));
			}else {
				int val1 = stack.pop();
				int val2 = stack.pop();
				if(ch == '+') {stack.push(val1 +  val2);}
				if(ch == '-') {stack.push(val1 -  val2);}
				if(ch == '/') {stack.push(val1 /  val2);}
				if(ch == '*') {stack.push(val1 *  val2);}				
			}
			
		}
		System.out.println(stack.pop());
		
	}
}
