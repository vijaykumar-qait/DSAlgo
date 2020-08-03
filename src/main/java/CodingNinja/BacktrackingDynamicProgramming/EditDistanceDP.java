package CodingNinja.BacktrackingDynamicProgramming;

public class EditDistanceDP {

    /**
     * Code: Edit Distance
     * Send Feedback
     * Given two strings s and t of lengths m and n respectively, find the Edit Distance between the strings. Edit Distance of two strings is minimum number of steps required to make one string equal to other. In order to do so you can perform following three operations only :
     * 1. Delete a character
     *
     * 2. Replace a character with another one
     *
     * 3. Insert a character
     * Note - Strings don't contain spaces
     * Input Format :
     * Line 1 : String s
     * Line 2 : String t
     * Output Format :
     * Line 1 : Edit Distance value
     * Constraints
     * 1<= m,n <= 10
     * Sample Input 1 :
     * abc
     * dc
     * Sample Output 1 :
     * 2
     */

    public static int editDistance(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        int dp[][] = new int [m+1][n+1];

        for(int j=0; j<=n; j++){
            dp[0][j] = j;
        }

        for(int i=0; i<=m; i++){
            dp[i][0] = i;
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(m-i) == s2.charAt(n-j)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    dp[i][j] = 1 + Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String [] args){
        String s = "abc";
        String t = "dc";

        System.out.println(editDistance(s,t));
    }

}
