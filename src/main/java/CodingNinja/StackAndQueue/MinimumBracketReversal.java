package CodingNinja.StackAndQueue;

import java.util.Stack;

public class MinimumBracketReversal {
    /**
     * Minimum bracket Reversal
     * Send Feedback
     * Given a string expression which consists only ‘}’ and ‘{‘. The expression may not be balanced.
     * You need to find the minimum number of bracket reversals which are required to make the expression balanced.
     * Return -1 if the given expression can't be balanced.
     * Input Format :
     * String S
     * Output Format :
     * Required count
     * Sample Input 1 :
     * {{{
     * Sample Output 1 :
     * -1
     * Sample Input 2 :
     * {{{{}}
     * Sample Output 2 :
     * 1
     */

    public static int countBracketReversals(String input){
        if((input.length() & 1) == 1){
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '{'){
                stack.push(ch);
            }
            else if(stack.size()>0 && stack.peek()=='{'){
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        int count = 0;
        while(stack.size()>0){
            char ch1 = stack.pop();
            char ch2 = stack.pop();
            if(ch1 == ch2){
                count++;
            }
            else {
                count+=2;
            }
        }
        return count;
    }

    public static void main(String [] args){
        //String expression = "{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{}}}}}";
        String expression = "()))((";
        expression = expression.replaceAll("[(]", "{");
        expression = expression.replaceAll("[)]", "}");
        System.out.println(expression);
        System.out.println(countBracketReversals(expression));
    }
}
