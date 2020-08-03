package CodingNinja.BacktrackingDynamicProgramming;

public class SmallestSuperSequence {
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
        if(str1.length()==0){
            return str2.length();
        }

        if(str2.length()==0){
            return str1.length();
        }

        if(str1.charAt(0) == str2.charAt(0)){
            return 1 + smallestSuperSequence(str1.substring(1), str2.substring(1));
        }
        else {
            int opt1 = smallestSuperSequence(str1.substring(1), str2);
            int opt2 = smallestSuperSequence(str1, str2.substring(1));

            return 1 + Math.min(opt1, opt2);
        }
    }

    public static void main(String [] args){
        String s1 = "ab";
        String s2 = "ac";

        System.out.println(smallestSuperSequence(s1, s2));
    }
}
