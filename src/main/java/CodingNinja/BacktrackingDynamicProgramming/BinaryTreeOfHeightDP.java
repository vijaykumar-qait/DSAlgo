package CodingNinja.BacktrackingDynamicProgramming;

public class BinaryTreeOfHeightDP {
    /**
     * Code: Number of Balanced BTs Using DP
     * Send Feedback
     * Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the count of possible binary trees which are balanced.
     * This number can be huge, so return output modulus 10^9 + 7.
     * Time complexity should be O(h).
     * Input Format :
     * Integer h
     * Output Format :
     * Count % 10^9 + 7
     * Input Constraints :
     * 1 <= h <= 10^7
     * Sample Input 1:
     * 3
     * Sample Output 1:
     * 15
     * Sample Input 2:
     * 4
     * Sample Output 2:
     * 315
     */

    public static int balancedTreesOfHeightH(int height){
        // Write your code here
        int dp[] = new int[height+1];
        dp[0] = 1;
        dp[1] = 1;
        int mod = (int)Math.pow(10,9)+7;

        for(int i=2; i<=height; i++){
            int x = dp[i-1];
            int y = dp[i-2];

            long res1 = (long)x*x;
            long res2 = (long)x*y*2;

            int val1 = (int)(res1%mod);
            int val2 = (int)(res2%mod);

            dp[i] = (val1+val2)%mod;
        }
        return dp[height];
    }

    public static void main(String [] args){
        int height = 4;
        System.out.println(balancedTreesOfHeightH(height));
    }
}
