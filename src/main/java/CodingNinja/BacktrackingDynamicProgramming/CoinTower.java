package CodingNinja.BacktrackingDynamicProgramming;

import java.util.Arrays;

public class CoinTower {
    /**
     * Coin Tower
     * Send Feedback
     * Whis and Beerus are playing a new game today . They form a tower of N coins and make a move in alternate turns . Beerus being the God plays first . In one move player can remove 1 or X or Y coins from the tower . The person to make the last move wins the Game . Can you find out who wins the game ?
     * Input Format :
     * Contains three value N,X,Y as mentioned in the problem statement
     * Output Format :
     * A string containing the name of the winner like “Whis” or “Beerus” (without quotes)
     * Constraints:
     * 1<=N<=10^6
     * 2<=X<=Y<=50
     * Sample Input :
     *  4 2 3
     * Sample Output :
     *  Whis
     */

    public static String solve(int n,int x,int y){

        boolean dp[] = new boolean[n+1];

        Arrays.fill(dp, false);

        dp[0] = false;
        dp[1] = true;

        for(int i=2; i<=n; i++){
            if(i-1 >=0 && dp[i-1]==false){
                dp[i] = true;
            }
            else if(i-x>=0 && dp[i-x] ==false){
                dp[i] = true;
            }
            else if(i-y>=0 && dp[i-y] == false){
                dp[i] = true;
            }
            //A lose the game
            else {
                dp[i] = false;
            }
        }

        if(dp[n]==true){
            return "Beerus";
        }
        return "Whis";
    }

    public static void main(String [] args){
        int n = 5;
        int x = 3;
        int y = 4;

        System.out.println(solve(n,x,y));
    }
}
