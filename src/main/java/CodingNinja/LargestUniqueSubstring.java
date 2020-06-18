package CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueSubstring {

    static boolean isDistinct(String str){
        Map<Character, Boolean> map = new HashMap<Character, Boolean>();
        for(int i=0; i<str.length(); i++){
            if(map.get(str.charAt(i))==null){
                map.put(str.charAt(i), true);
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static String findLargestUniqueSubstring(String str){
        /* Don't write main().
         * Don't read input, it is passed as function argument.
         * Return the answer.
         * Taking input and printing output is handled automatically.
         */
        int length=0;
        int startIndex = 0;

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                if(isDistinct(str.substring(i,j))){
                    int newLength = j-i;
                    if(length<newLength){
                        length = newLength;
                        startIndex = i;
                    }
                }
            }
        }

        System.out.println("length: " + length);
        System.out.println("startIndex: " + startIndex);

        for(int i = startIndex; i<startIndex + length; i++){
            System.out.print(str.charAt(i));
        }
        return "";
    }

    public static void main(String [] args){
        //String str = "abcdabceb";
        //String str = "abcabcbb";
        //String str = "bbbbb";
        //String str = "pwwkew";
        String str = "uhuchwucdshhdbhjcdchbbdhdb";
        findLargestUniqueSubstring(str);
    }
}
