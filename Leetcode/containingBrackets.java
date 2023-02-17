/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.
Input: s = "()"
Output: true
*/
import java.util.Stack;

public class containingBrackets {
    public static boolean isValid(String s) {
        Stack<Character> leftSymbols = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                leftSymbols.push(c);
            }
            else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }

    public static void main(String[] args) {
        boolean result= isValid("()");
        boolean result2= isValid("()[]{}");
        boolean result3= isValid("(]");
        System.out.println("Given String have open and close Parentheses :"+result);
        System.out.println("Given String have open and close Parentheses :"+result2);
        System.out.println("Given String have open and close Parentheses :"+result3);
    }
}

