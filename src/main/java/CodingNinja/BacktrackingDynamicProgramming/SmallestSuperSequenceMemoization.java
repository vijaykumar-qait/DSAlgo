package CodingNinja.BacktrackingDynamicProgramming;

public class SmallestSuperSequenceMemoization {
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
    public static int smallestSuperSequence(String str1, String str2, int storage[][]) {
        int m = str1.length();
        int n = str2.length();

        if(storage[m][n] != -1){
            return storage[m][n];
        }

        if(m==0){
            storage[m][n] = n;
            return storage[m][n];
        }

        if(n==0){
            storage[m][n] = m;
            return storage[m][n];
        }

        if(str1.charAt(0) == str2.charAt(0)){
            storage[m][n] = 1 +  smallestSuperSequence(str1.substring(1), str2.substring(1), storage);
        }
        else {
            storage[m][n] = 1 + Math.min(smallestSuperSequence(str1.substring(1), str2, storage),
                    smallestSuperSequence(str1, str2.substring(1), storage));
        }
        return storage[m][n];
    }

    public static int smallestSuperSequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int storage[][] = new int [m+1][n+1];

        for(int i=0; i<=m; i++){
            for(int j =0; j<=n; j++){
                storage[i][j] = -1;
            }
        }

        return smallestSuperSequence(str1, str2, storage);
    }

    public static void main(String [] args){
        String s1 = "ab";
        String s2 = "ac";

        System.out.println(smallestSuperSequence(s1, s2));
    }
}
