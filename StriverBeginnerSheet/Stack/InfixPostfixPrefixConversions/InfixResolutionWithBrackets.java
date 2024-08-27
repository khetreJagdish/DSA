package com.algo.stack.infixpostfixprefixexpression;

import java.util.Stack;

public class InfixResolutionWithBrackets {

	public static void main(String[] args) {

		String str = "9-(5+3)*4/6";

		Stack<Integer> val = new Stack<>();
		Stack<Character> operators = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			int ascii = (int) ch;

			// '0' --> 48 & '9' --> 57
			if (ascii >= 48 && ascii <= 57) {
				val.push(ascii - 48);
			} else if (operators.size() == 0 || ch == '(' || operators.peek() == '(') {
				operators.push(ch);
			}else if(ch == ')') {
				while(operators.peek() != '(') {
					
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
					operators.pop();
				}
				operators.pop();
				
			} else {
				if (ch == '+' || ch == '-') {

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

					operators.pop();
					operators.push(ch);
				}

				if (ch == '*' || ch == '/') {

					if (operators.peek() == '*' || operators.peek() == '/') {

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
						operators.push(ch);
					}

				}
			}

		}

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

			operators.pop();
		}
		System.out.println(val.peek());
	}
}
