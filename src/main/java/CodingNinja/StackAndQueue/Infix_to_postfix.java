package CodingNinja.StackAndQueue;

import java.util.Stack;

public class Infix_to_postfix {
    /**
     * Infix to postfix
     * Send Feedback
     * Given an infix expression S in the form of a string. You need to convert and print that input expression in
     * postfix form. After that, evaluate and print the result of given expression in next line.
     * Input Format :
     * Infix expression
     * Output Format :
     * Line 1 : Corresponding postfix expression
     * Line 2 : Result of input expression after evaluation
     * Constraints :
     * 1 <= Length of S <= 100
     * Sample Input 1 :
     * 3+4
     * Sample Output 1 :
     * 34+
     * 7
     */

    static int getOperationResult(int num1, int num2, char operator){
        int ans = 0;
        switch (operator){
            case '/':
                ans = num2 / num1;
                break;
            case '*':
                ans = num2 * num1;
                break;
            case '+':
                ans = num2 + num1;
                break;
            case '-':
                ans = num2 - num1;
                break;
        }
        return ans;
    }

    static int getPreference(char c){
        if(c == '/' || c == '*'){
            return 3;
        }
        else if(c == '+' || c == '-'){
            return 2;
        }
        else {
            return 1;
        }
    }

    private static int evaluateProfixExpresstion(String input){
        if(input.length()==0){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch>=48 && ch<=57){
                stack.push(ch-48);
            }
            else {
                if(stack.size()>1){
                    int ans = getOperationResult(stack.pop(), stack.pop(), ch);
                    stack.push(ans);
                }
            }
        }
        return stack.pop();
    }

    public static void evaluatePostfix(String input){
        Stack<Character> stack = new Stack<>();
        String output="";
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if((ch>= 65 && ch<=90) ||  (ch>=97 && ch<=122) || (ch >=48 && ch<=57) ){
                output += ch;
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.size()>0){
                    while(true){
                        char c = stack.pop();
                        if(c == '(' || c == '[' || c == '{'){
                            break;
                        }
                        output+=c;
                    }
                }
            }
            else {
                if(ch == '(' || ch == '[' || ch == '{'){
                    stack.push(ch);
                }else if(stack.size()>0 && getPreference(ch)<=getPreference(stack.peek())){
                    while (stack.size()>0 && getPreference(ch)<=getPreference(stack.peek())){
                        output += stack.pop();
                    }
                    stack.push(ch);
                }
                else {
                    stack.push(ch);
                }
            }
        }
        while(stack.size()>0){
            output+=stack.pop();
        }
        System.out.println(output);
        int ans = evaluateProfixExpresstion(output);
        System.out.println(ans);
    }

    public static void main(String [] args){
        //String expression = "a*b-(c+d)+e";
        //String expression = "a*b*((c*d)*e)+g";
        //String expression = "((2+8)/5)";
        //String expression = "(((3*5)+3)/2)";
        String expression = "2+5*8-9";
        evaluatePostfix(expression);
    }
}
