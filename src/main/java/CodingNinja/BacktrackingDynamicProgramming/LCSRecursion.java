package CodingNinja.BacktrackingDynamicProgramming;

public class LCSRecursion {
    /**
     * Longest Common Subsequence | DP-4
     * We have discussed Overlapping Subproblems and Optimal Substructure properties in Set 1 and Set 2 respectively. We also discussed one example problem in Set 3. Let us discuss Longest Common Subsequence (LCSRecursion) problem as one more example problem that can be solved using Dynamic Programming.
     *
     * LCSRecursion Problem Statement: Given two sequences, find the length of longest subsequence present in both of them. A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.
     *
     * In order to find out the complexity of brute force approach, we need to first know the number of possible different subsequences of a string with length n, i.e., find the number of subsequences with lengths ranging from 1,2,..n-1. Recall from theory of permutation and combination that number of combinations with 1 element are nC1. Number of combinations with 2 elements are nC2 and so forth and so on. We know that nC0 + nC1 + nC2 + … nCn = 2n. So a string of length n has 2n-1 different possible subsequences since we do not consider the subsequence with length 0. This implies that the time complexity of the brute force approach will be O(n * 2n). Note that it takes O(n) time to check if a subsequence is common to both the strings. This time complexity can be improved using dynamic programming.
     *
     * It is a classic computer science problem, the basis of diff (a file comparison program that outputs the differences between two files), and has applications in bioinformatics.
     *
     * Examples:
     * LCSRecursion for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
     * LCSRecursion for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
     */

    public static int lcs(String str1, String str2){
        if(str1.length() == 0 || str2.length()==0){
            return 0;
        }

        if(str1.charAt(0)==str2.charAt(0)){
            return 1 + lcs(str1.substring(1), str2.substring(1));
        }
        else {
            int opt1 = lcs(str1.substring(1), str2);
            int opt2 = lcs(str1, str2.substring(1));
            /*int opt3 = lcs(str1.substring(1), str2.substring(1));*//*this case is not required as it will be covered
            in the above to cases as per the tree structure that will be drawn so we can ignore this opt3*/
            //return Math.max(opt1, Math.max(opt2, opt3));
            return Math.max(opt1, opt2);
        }
    }

    public static void main(String [] args){
//        String str1 = "ABCDGH";
//        String str2 = "AEDFHR";

        String str1 = "abcd";
        String str2 = "efgh";
        System.out.println(lcs(str1, str2));
    }
}
