/**

Approach 1 :

1) Initialize a stack to keep track of opening brackets.
2) Iterate through each character in the string:

3)  if the stack is empty or If the character is an opening bracket ('(', '{', '['), push it onto the stack.
4)  If the character is a closing bracket (')', '}', ']'):
        a) if the top element of the stack does not match the corresponding opening bracket.
        b) Otherwise, pop the top element from the stack.

After iterating through the string, check if the stack is empty. If it is not empty, return false.
Return true if all brackets are correctly matched and the stack is empty.


**/

public class ValidParanthesis_20 {
    public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			if (stack.isEmpty() || s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				if (s.charAt(i) == ')') {
					if (stack.peek() != '(') {
						return false;
					}
					stack.pop();
				} else if (s.charAt(i) == '}') {
					if (stack.peek() != '{') {
						return false;
					}
					stack.pop();
				} else if (s.charAt(i) == ']') {
					if (stack.peek() != '[') {
						return false;
					}
					stack.pop();
				}
			}

		}
		if(!stack.isEmpty()) return false;
		return true;
    }
}


/**

Approach 2 : 

1) Continuously remove "()", "{}", and "[]" from the string.
2) Repeat until no more pairs are found.
3) Return true if the string is empty; otherwise, return false.


**/


class Solution {
    public boolean isValid(String s) {
        

		while (true) {
			if (s.contains("()")) {
				s = s.replace("()", "");
			} else if (s.contains("{}")) {
				s = s.replace("{}", "");
			} else if (s.contains("[]")) {
				s = s.replace("[]", "");
			} else {
				// If the string becomes empty, it indicates all brackets are matched.
				return s.isEmpty();
			}
		}

	
    }
}

