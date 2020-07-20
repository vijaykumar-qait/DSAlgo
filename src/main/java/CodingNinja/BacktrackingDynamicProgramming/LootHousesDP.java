package CodingNinja.BacktrackingDynamicProgramming;

import java.util.Arrays;

public class LootHousesDP {
    /**
     * Loot Houses
     * Send Feedback
     * A thief wants to loot houses. He knows the amount of money in each house. He cannot loot two consecutive houses. Find the maximum amount of money he can loot.
     * Input Format
     * Line 1 : An integer N
     * Line 2 : N spaced integers denoting money in each house
     * Output Format
     *  Line 1 : Maximum amount of money looted
     * Input Constraints
     * 1 <= n <= 10^4
     * 1 <= A[i] < 10^4
     * Sample Input :
     * 6
     * 5 5 10 100 10 5
     * Sample Output 1 :
     * 110
     */

    public static int getMaxMoney(int arr[], int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return arr[0];
        }
        int dp[] = new int [n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        int max_value = 0;

        for(int i=2; i<arr.length; i++){
            max_value = Math.max(max_value, (arr[i] + dp[i-2]));
            max_value = Math.max(max_value, dp[i-1]);
            dp[i] = max_value;
        }

        System.out.println(Arrays.toString(dp));

        return max_value;

    }

    public static void main(String [] args){
//        int arr[] = {5,5,10,100,10,5};
//        int n = arr.length;

        int arr[] = {20,1412,6970,9998,1772,7156,4482,2153,8972,3811,902,6586,2988,1417,5124,2305,1344,6585,2881,6369,4089};
        int n = arr.length;
        System.out.println(getMaxMoney(arr, n));
    }
}
