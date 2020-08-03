package CodingNinja.BacktrackingDynamicProgramming;

public class SmallestSuperSequenceDP {

    /**
     * Smallest Super-Sequence
     * Send Feedback
     * Given two strings S and T, find and return the length of their smallest super-sequence.
     * A shortest super sequence of two strings is defined as the shortest possible string containing both strings as subsequences.
     * Note that if the two strings do not have any common characters, then return the sum of lengths of the two strings.
     * Input Format:
     * Line 1 : A string
     * Line 2: Another string
     * Output Format:
     * Length of the smallest super-sequence of given two strings.
     * Sample Input:
     * ab
     * ac
     * Sample Output:
     * 3
     * Sample Output Explanation:
     * Their smallest super-sequence can be "abc" which has length=3.
     */

    public static int smallestSuperSequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int dp [][] = new int [m+1][n+1];

        //base case
        for(int i=0; i<=m; i++){
            dp[i][0] = i;
        }

        for(int j=0; j<=n; j++){
            dp[0][j] = j;
        }

        //dp approach
        for(int i=1; i<=m ; i++){
            for(int j=1;  j<=n; j++){
                if(str1.charAt(m-i) ==  str2.charAt(n-j)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = 1 + Math.min(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String [] args){
        String s1 = "wr";
        String s2 = "lrq";

        System.out.println(smallestSuperSequence(s1, s2));
    }
}
