package com.algo.stack.infixpostfixprefixexpression;

import java.util.Stack;
// there are only 3 steps:
// 1) 


public class InfixResolution {

	public static void main(String[] args) {

		String str = "4-5+3*4/6";

		Stack<Integer> val = new Stack<>();
		Stack<Character> operators = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			
			// extreact the character
			char ch = str.charAt(i);

			// convert to ascii format
			int ascii = (int) ch;	
			
			//if it's inbetween  48 to 57 that means it is a number and without thinking you can directly push in "val" stack
			// '0' --> 48 & '9' --> 57
			if (ascii >= 48 && ascii <= 57) {
				val.push(ascii - 48); // convert number to char again before pushing to val stack (we don't want to push numbers)
			// if "operators" stack size is empty then directly add the operator in stack
			} else if (operators.size() == 0) { 
				operators.push(ch);
			}
		    //if both above condition are not true then 	
		     else {
				 // check if character that we want to add is '+' or '-'
				if (ch == '+' || ch == '-') {
					// if yes then do some work
					int value2 = val.pop();
					int value1 = val.pop();

					char ch1 = operators.peek();

					if (ch1 == '+')
						val.push(value1 + value2);
					if (ch1 == '-')
						val.push(value1 - value2);
					if (ch1 == '*')
						val.push(value1 * value2);
					if (ch1 == '/')
						val.push(value1 / value2);
					// then pop the character
					operators.pop();
					// and then push the current character
					operators.push(ch);
				}
				// check if character that we want to add is '*' or '/'
				if (ch == '*' || ch == '/') {
					// and then check if character on the top of stack is '*' or '/'
					if (operators.peek() == '*' || operators.peek() == '/') {
						// then do some work
						int value2 = val.pop();
						int value1 = val.pop();

						char ch1 = operators.peek();

						if (ch1 == '*')
							val.push(value1 * value2);
						if (ch1 == '/')
							val.push(value1 / value2);
						operators.pop();
						operators.push(ch);

					} else {
						// else direcly add the current char to 'operators' stack
						operators.push(ch);
					}

				}
			}

		}
		
		// in last do all the calculations from val stack 
		while (val.size() > 1) {
			int value2 = val.pop();
			int value1 = val.pop();

			char ch1 = operators.peek();

			if (ch1 == '+')
				val.push(value1 + value2);
			if (ch1 == '-')
				val.push(value1 - value2);
			if (ch1 == '*')
				val.push(value1 * value2);
			if (ch1 == '/')
				val.push(value1 / value2);
			// just pop the operators from 'operator' stack , do not push anything
			operators.pop();
		}
		// lastly print the top element
		System.out.println(val.peek());
	}
}
