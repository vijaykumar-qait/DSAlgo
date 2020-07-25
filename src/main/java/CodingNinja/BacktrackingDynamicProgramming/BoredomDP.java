package CodingNinja.BacktrackingDynamicProgramming;

public class BoredomDP {
    /**
     * Boredom
     * Send Feedback
     * Gary is bored and wants to play an interesting but tough game . So he figured out a new board game called "destroy the neighbours" . In this game there are N integers on a board. In one move, he can pick any integer x from the board and then all the integers with value x+1 or x-1 gets destroyed .This move will give him x points.
     * He plays the game until the board becomes empty . But as he want show this game to his friend Steven, he wants to learn techniques to maximise the points to show off . Can you help Gary in finding out the maximum points he receive grab from the game ?
     * Input Format :
     * Line 1 : Integer N
     * Line 2 : A list of N integers
     * Output Format :
     * Maximum points Gary can recieve from the Game setup
     * Constraints :
     * 1<=N<=10^5
     * 1<=A[i]<=1000
     * Sample Input :
     * 2
     * 1 2
     * Sample Output :
     * 2
     */

    static public int solve(int n,int A[])
    {
        int freqArr[] = new int[1001];
        int dp[] = new int[1001];

        for(int i=0; i<n; i++){
            freqArr[A[i]]++;
        }

        dp[0] = 0;
        dp[1] = freqArr[1] > 0 ? freqArr[1] : 0;

        for(int i=2; i<=1000; i++){
            dp[i] = Math.max(dp[i-2] + i*freqArr[i], dp[i-1]);
        }
        return dp[1000];
    }

    public static void main(String [] args){
//        int arr[] = {1,2,1,3,2,2,2,2,3};
//        int n = arr.length;

        int arr[] = {1,2};
        int n = arr.length;
        System.out.println(solve(n, arr));
    }
}
