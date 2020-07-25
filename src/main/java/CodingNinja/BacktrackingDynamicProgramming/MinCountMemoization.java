package CodingNinja.BacktrackingDynamicProgramming;

public class MinCountMemoization {
    /**
     * Minimum Count
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
     * Sample Output 1 :
     * 3
     * Sample Output 1 Explanation :
     * 12 can be represented as :
     * 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1
     * 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 2^2
     * 1^1 + 1^1 + 1^1 + 1^1 + 2^2 + 2^2
     * 2^2 + 2^2 + 2^2
     * As we can see, the output should be 3.
     * Sample Input 2 :
     * 9
     * Sample Output 2 :
     * 1
     */

    public static int minCount(int n, int storage[]) {
        if(n<=3){
            storage[n] = n;
            return storage[n];
        }

        if(storage[n]!=0){
            return storage[n];
        }

        int res = n;

        for(int i=1; i*i<=n; i++){
            int temp = i*i;
            res = Math.min(res, minCount(n-temp, storage));
        }

        storage[n] = res+1;
        return storage[n];
    }


    public static int minCount(int n) {
        int storage [] = new int[n+1];
        return minCount(n, storage);
    }


    public static void main(String [] args){
        int n = 1000;
        System.out.println(minCount(n));
    }
}
