package CodingNinja.BacktrackingDynamicProgramming;

public class MinimunCountOfSquare {
    /**
     * Code: Minimum Count of Squares
     * Send Feedback
     * Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.
     * That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. Output will be 1, as 1 is the minimum count of numbers required.
     * Note : x^y represents x raise to the power y.
     * Input Format :
     * Integer N
     * Output Format :
     * Required minimum count
     * Constraints :
     * 1 <= N <= 1000
     * Sample Input 1 :
     * 12
     * @param n
     * @return
     */

    public static int minCount(int n) {
        // Write your code here
        if(n<3){
            return n;
        }
        int res = n;
        for(int i=1; i*i<=n; i++){
            int temp = i*i;
            res = Math.min(res, minCount(n-temp));
        }
        return  res+1;
    }

    public static void main(String args[]){
        int n =10;
        System.out.println(minCount(n));
    }
}
