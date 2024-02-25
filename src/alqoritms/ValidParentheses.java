package alqoritms;

import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch2 = stack.pop();
                if ((ch == ')' && ch2 != '(') ||
                        (ch == '}' && ch2 != '{') ||
                        (ch == ']' && ch2 != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValidV2(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                if (List.of(']', '}', ')').contains(c)) {
                    return false;
                }
                stack.push(c);
            } else {
                char p = stack.peek();
                if (c == '}' | c == ']' | c == ')') {
                    if ((c == '}' && p == '{') | (c == ')' && p == '(') | (c == ']' && p == '[')) {
                        stack.pop();
                    } else
                        return false;
                } else
                    stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
