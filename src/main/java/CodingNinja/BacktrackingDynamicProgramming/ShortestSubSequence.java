package CodingNinja.BacktrackingDynamicProgramming;

public class ShortestSubSequence {
    /**
     * Shortest Subsequence
     * Send Feedback
     * Gary has two string S and V. Now Gary wants to know the length shortest subsequence in S such that it is not a subsequence in V.
     * Note: input data will be such so there will always be a solution.
     * Input Format :
     * Line 1 : String S of length N (1 <= N <= 1000)
     * Line 2 : String V of length M (1 <= M <= 1000)
     * Output Format :
     * Length of shortest subsequence in S such that it is not a subsequence in V
     * Sample Input :
     * babab
     * babba
     * Sample Output :
     * 3
     */

    public static  int solve(String S,String V){
        if(S.length()==0){
            return 0;
        }

        if(V.length()<=0){
            return 1;
        }

        int k=0;
        for(; k<V.length(); k++){
            if(S.charAt(0)==V.charAt(k))
                break;
        }

        if(k==V.length()-1){
            return 1;
        }

        int smallAns = Math.min(solve(S.substring(1), V), 1 + solve(S.substring(1), V.substring(k+1)));
        return smallAns;
    }

    public static void main(String [] args){
        String s = "babab";
        String v = "babba";

        System.out.println(solve(s,v));
    }
}
