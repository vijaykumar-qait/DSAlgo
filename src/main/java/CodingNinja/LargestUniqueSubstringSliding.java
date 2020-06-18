package CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueSubstringSliding {

    public static String findLargestUniqueSubstring(String str){
        /* Don't write main().
         * Don't read input, it is passed as function argument.
         * Return the answer.
         * Taking input and printing output is handled automatically.
         */

//        int startIndex = 0, length = 0;
//        //Map<Character, Boolean> map = new HashMap<Character, Boolean>();
//
//        boolean visitied[] = new boolean[256];
//
//        for(int i=0; i<str.length(); i++){
//            for(int j=i; j<str.length(); j++){
//                if(visitied[str.charAt(j)]==true){
//                    break;
//                }
//                else {
//                    if(length < (j-i+1)){
//                        length = j-i+1;
//                        startIndex = i;
//                    }
//                    visitied[str.charAt(j)] = true;
//                }
//            }
//            visitied[str.charAt(i)]=false;
//        }
//
//        System.out.println("length: " + length + " startIndex: " + startIndex);
//        System.out.print(str.substring(startIndex, startIndex+length));
//
//        return str.substring(startIndex, startIndex+length);

        /* Don't write main().
         * Don't read input, it is passed as function argument.
         * Return the answer.
         * Taking input and printing output is handled automatically.
         */
        // boolean array to mark characters present in current window
        boolean visited[] = new boolean[256];
        int begin=0, end=0;

        for(int low=0, high=0; high<str.length(); high++){
            if(visited[str.charAt(high)]){
                while(str.charAt(low) != str.charAt(high)){
                    visited[str.charAt(low)] = false;
                    low++;
                }
                low++;
            }
            else {
                visited[str.charAt(high)] = true;
                if(end-begin < high-low){
                    begin = low;
                    end = high;
                }
            }
        }
       return str.substring(begin, end+1);
    }



    public static void main(String [] args){
        //String str = "abcdabceb";
        //String str = "abcabcbb";
        //String str = "bbbbb";
        //String str = "pwwkew";
        //String str = "uhuchwucdshhdbhjcdchbbdhdb";
        //String str = "ccvvchcbchccccccjjhjhjhkkc";
        String str = "uduuuduuddhhshhhbbbcbhfdjjjxhhxxxjjdjndp";
        //String str = "GEEKSFORGEEKS";

        System.out.println(findLargestUniqueSubstring(str));

    }
}
