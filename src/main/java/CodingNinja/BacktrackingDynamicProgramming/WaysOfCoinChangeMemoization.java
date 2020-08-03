package CodingNinja.BacktrackingDynamicProgramming;

public class WaysOfCoinChangeMemoization {
    /**
     * Ways To Make Coin Change
     * Send Feedback
     * You are given an infinite supply of coins of each of denominations D = {D0, D1, D2, D3, ...... Dn-1}. You need to figure out the total number of ways W, in which you can make change for Value V using coins of denominations D.
     * Note : Return 0, if change isn't possible.
     * Input Format
     * Line 1 : Integer n i.e. total number of denominations
     * Line 2 : N integers i.e. n denomination values
     * Line 3 : Value V
     * Output Format
     * Line 1 :  Number of ways i.e. W
     * Constraints :
     * 1<=n<=10
     * 1<=V<=1000
     * Sample Input 1 :
     * 3
     * 1 2 3
     * 4
     * Sample Output
     * 4
     * Sample Output Explanation :
     * Number of ways are - 4 total i.e. (1,1,1,1), (1,1, 2), (1, 3) and (2, 2).
     */
    public static int countWaysToMakeChange(int denominations[], int value){
        int m = value+1;
        int n = denominations.length;
        int storage[][] = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                storage[i][j] = -1;
            }
        }

        return countWaysToMakeChange(denominations, value, 0, storage);
    }

    private static int countWaysToMakeChange(int[] denominations, int value, int si, int[][] storage) {
        if(value==0){
            storage[value][si] = 1;
            return storage[value][si];
        }

        if(value<0){
            return 0;
        }

        if(storage[value][si] != -1){
            return storage[value][si];
        }

        int ways = 0;

        for(int i=si; i<denominations.length; i++){
            ways += countWaysToMakeChange(denominations, value-denominations[i], i, storage);
        }

        storage[value][si] = ways;
        return storage[value][si];
    }

    public static void main(String [] args){
        int arr[] = {1,2,3};
        int value = 4;
        System.out.println(countWaysToMakeChange(arr, value));
    }
}
