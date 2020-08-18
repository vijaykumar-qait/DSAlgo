package CodingNinja.StackAndQueue;

import java.util.Stack;

public class BalancedParanthesis {
    /**
     * Solution approach
     *
     * If Brackets are balanced?
     * Problem Description: You are given with a string expression, write a program to find whether
     * brackets are balanced or not, i.e. if a bracket opens last, then it should get closed first. Print true
     * if the brackets are balanced, otherwise print false.
     * For example: { a + [ b+ (c + d)] + (e + f) }
     *  Here, all the brackets are balanced, so the output for this input string must be true.
     *
     *
     *
     * Algorithm to approach:
     * 1. You need to declare a Stack S.
     *
     * 2. Now, traverse the string expression.
     * ● If the current character of the string is an opening bracket(‘(‘ or ‘{‘ or ‘[‘), then
     * push it to the stack.
     *
     * ● If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack
     * and if the popped character is the matching opening bracket then fine, else
     * parentheses are not balanced. This is because of the fact that in a balanced
     * brackets expression, whichever bracket opens last, should be closed first.
     *
     * ● After complete traversal, if there is some starting bracket left in stack then the
     * expression is “not balanced” because this means there are some extra opening
     * brackets.
     *
     *
     * Let us take an example:
     * { a + [ b+ (c + d)] + (e + f) }
     * Make a stack S.
     * We have an opening bracket first, insert it into the stack.
     * Again an opening bracket, insert into the stack.
     * Again, an opening bracket, insert into the stack.
     * Now, we encounter a closing bracket, pop the topmost element from the stack and it matches the
     * closing bracket. Hence, we continue the process.
     * Again, we encounter a closing bracket, pop the topmost element from the stack and it matches
     * the closing bracket. Hence, we continue the process.
     * Again, we encounter a closing bracket, pop the topmost element from the stack and it matches
     * the closing bracket. Hence, we continue the process.
     * Now, the string finished and we have an empty stack left, hence the brackets are balanced.
     *
     *
     * Pseudo Code:
     * Function: checkBalanced(exp) {
     * Create a Stack s
     *
     * For i=0 to i less than length of exp:
     *      if(exp[i] = '(' or exp[i] = '{' or exp[i] = '[') :
     *          push(exp[i]) on stack s
     *      else if(exp[i] = ')' or exp[i] = '}' or exp[i] = ']') :
     *          if(stack is empty) :
     *              return false
     *          ch = top of stack
     *          Pop from stack
     *          if(exp[i] = ')' and ch = '(') :
     *              Do nothing and continue
     *          else if(exp[i] = '}' and ch = '{') :
     *              Do nothing and continue
     *          else if(exp[i] = ']' and ch = '[') :
     *              Do nothing and continue
     *          else :
     *              return false
     * if(stack is empty) :
     *      return true
     * else :
     *      return false
     */

    /**
     * Code : Balanced Parenthesis
     * Send Feedback
     * Given a string expression, check if brackets present in the expression are balanced or not.
     * Brackets are balanced if the bracket which opens last, closes first.
     * You need to return true if it is balanced, false otherwise.
     * Note: This problem was asked in initial rounds in Facebook
     * Sample Input 1 :
     * { a + [ b+ (c + d)] + (e + f) }
     * Sample Output 1 :
     * true
     * Sample Input 2 :
     * { a + [ b - c } ]
     * Sample Output 2 :
     * false
     *
     */

    public static boolean checkBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<exp.length(); i++){
            if(exp.charAt(i) == '[' || exp.charAt(i) == '{' || exp.charAt(i) == '('){
                stack.push(exp.charAt(i));
            }

            if(exp.charAt(i) == '}' || exp.charAt(i) == ')' || exp.charAt(i) == ']'){
                if(!stack.isEmpty()){
                    char c = exp.charAt(i);
                    switch (c){
                        case ')':
                            if(stack.peek() == '('){
                                stack.pop();
                            }
                            else {
                                return false;
                            }
                            break;
                        case '}':
                            if(stack.peek() == '{'){
                                stack.pop();
                            }
                            else {
                                return false;
                            }
                            break;
                        case ']':
                            if(stack.peek() == '['){
                                stack.pop();
                            }
                            else {
                                return false;
                            }
                            break;
                    }
                }
                else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String [] args){
        //String exp = "{a+[b+(c+d)]+(e+f)}";
        String exp = "]";
        System.out.println(checkBalanced(exp));
    }
}
