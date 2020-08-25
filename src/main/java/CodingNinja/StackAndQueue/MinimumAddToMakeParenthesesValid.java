package CodingNinja.StackAndQueue;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    /**
     * 921. Minimum Add to Make Parentheses Valid
     * Medium
     *
     * Add to List
     *
     * Share
     * Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and
     * in any positions ) so that the resulting parentheses string is valid.
     *
     * Formally, a parentheses string is valid if and only if:
     *
     * It is the empty string, or
     * It can be written as AB (A concatenated with B), where A and B are valid strings, or
     * It can be written as (A), where A is a valid string.
     * Given a parentheses string, return the minimum number of parentheses we must add to make the resulting
     * string valid.
     *
     *
     *
     * Example 1:
     *
     * Input: "())"
     * Output: 1
     * Example 2:
     *
     * Input: "((("
     * Output: 3
     * Example 3:
     *
     * Input: "()"
     * Output: 0
     * Example 4:
     *
     * Input: "()))(("
     * Output: 4
     */

    static public int minAddToMakeValid(String S) {
        if(S.length() == 0){
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }
            else if(stack.size()>0 && stack.peek()=='('){
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        return stack.size();
    }

    public static void main(String [] args){
        String expression = "()";
        System.out.println(minAddToMakeValid(expression));
    }
}
