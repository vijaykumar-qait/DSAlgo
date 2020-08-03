package CodingNinja.BacktrackingDynamicProgramming;

public class EditDistance {
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
        if(s1.length() == 0 && s2.length()==0){
            return 0;
        }

        if(s1.length()>0 && s2.length()>0 && s1.charAt(0) == s2.charAt(0)){
            return editDistance(s1.substring(1), s2.substring(1));
        }
        else {
            int opt1 = Integer.MAX_VALUE;
            int opt2 = Integer.MAX_VALUE;
            int opt3 = Integer.MAX_VALUE;

            if(s2.length()>0){
                opt1 = 1 + editDistance(s2.charAt(0)+s1, s2);
            }

            if(s1.length()>0){
                opt2 = 1 + editDistance(s1.substring(1), s2);
            }

            if(s2.length()>0 && s1.length()>0){
                opt3 = 1 + editDistance(s2.charAt(0)+s1.substring(1), s2);
            }
            return Math.min(opt1, Math.min(opt2, opt3));
        }
    }

    public static void main(String [] args){
        String s1 = "abc";
        String s2 = "dc";
        System.out.println(editDistance(s1, s2));

    }
}
