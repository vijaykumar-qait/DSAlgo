package CodingNinja.BacktrackingDynamicProgramming;

public class RMinStepToOne {
    /**
     * Code: Min Steps to One
     * Send Feedback
     * Given a positive integer n, find the minimum number of steps s, that takes n to 1.
     * You can perform any one of the following 3 steps.
     * 1.) Subtract 1 from it. (n= n - ­1) ,
     * 2.) If its divisible by 2, divide by 2.( if n%2==0, then n= n/2 ) ,
     * 3.) If its divisible by 3, divide by 3. (if n%3 == 0, then n = n / 3 ).
     * Just write brute-force recursive solution for this.
     * Input format :
     * Line 1 : A single integer i.e. n
     * Output format :
     * Line 1 : Single integer i.e number of steps
     * Constraints :
     * 1 <= n <= 500
     */

    public static int countStepsTo1(int n) {
        if(n == 1){
            return 0;
        }

        int option = countStepsTo1(n-1);
        if(n % 2 == 0){
            option = Math.min(option, countStepsTo1(n/2));
        }
        if(n % 3 == 0){
            option = Math.min(option, countStepsTo1(n/3));
        }
        return 1 + option;
    }

    public static void main(String [] args){
        int n = 7;
        System.out.println(countStepsTo1(n));

    }
}
