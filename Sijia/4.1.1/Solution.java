public class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack();
		int len = s.length();
		int i = 0;
		while (i < len) {
			if (!stack.isEmpty()) {
				if (!match(stack.peek(), s.charAt(i))) {
					stack.add(s.charAt(i));
				} else {
					stack.pop();
				}
			}
			else if (stack.isEmpty()) {
				stack.add(s.charAt(i));
			}
			i++;
		}
		if (i < len || !stack.isEmpty())
			return false;
		return true;
	}

	public boolean match(char ch1, char ch2) {
		if (ch1 == '{' && ch2 == '}')
			return true;
		else if (ch1 == '[' && ch2 == ']')
			return true;
		else if (ch1 == '(' && ch2 == ')')
			return true;
		else
			return false;
	}
}