package CodingNinja.BacktrackingDynamicProgramming;

public class EditDistanceMemoization {
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

    public static int editDistance(String s1, String s2, int storage[][]){
        int m = s1.length();
        int n = s2.length();
        if(s1.length()==0){
            storage[m][n] = s2.length();
            return storage[m][n];
        }

        if(s2.length()==0){
            storage[m][n] = s1.length();
            return storage[m][n];
        }

        if(storage[m][n] != -1){
            return storage[m][n];
        }

        if(s1.charAt(0) == s2.charAt(0)){
            storage[m][n] = editDistance(s1.substring(1), s2. substring(1));
            return storage[m][n];
        }
        else {
            int opt1 = 1 + editDistance(s1, s2.substring(1), storage);
            int opt2 = 1 + editDistance(s1.substring(1), s2, storage);
            int opt3 = 1 + editDistance(s1.substring(1), s2.substring(1), storage);

            storage[m][n] = Math.min(opt1, Math.min(opt2, opt3));
            return storage[m][n];
        }
    }

    public static int editDistance(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        int storage[][] = new int[m+1][n+1];

        for(int i=0; i<m+1; i++){
            for(int j=0; j<n+1; j++){
                storage[i][j] = -1;
            }
        }
        return editDistance(s1, s2, storage);
    }

    public static void main(String [] args){
        String s = "abc";
        String t = "dc";

        System.out.println(editDistance(s,t));
    }
}
