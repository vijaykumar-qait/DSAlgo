package Leetcode.Challenge1;

import java.util.Arrays;

public class ReplaceAllToAvoidConsecutiveRepeatingCharacters {
    /**
     * 5507. Replace All ?'s to Avoid Consecutive Repeating Characters
     * User Accepted:1
     * User Tried:8
     * Total Accepted:1
     * Total Submissions:8
     * Difficulty:Easy
     * Given a string s containing only lower case English letters and the '?' character, convert all the '?'
     * characters into lower case letters such that the final string does not contain any consecutive repeating characters. You cannot modify the non '?' characters.
     *
     * It is guaranteed that there are no consecutive repeating characters in the given string except for '?'.
     *
     * Return the final string after all the conversions (possibly zero) have been made. If there is more than one solution,
     * return any of them. It can be shown that an answer is always possible with the given constraints.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "?zs"
     * Output: "azs"
     * Explanation: There are 25 solutions for this problem. From "azs" to "yzs", all are valid. Only "z" is an invalid
     * modification as the string will consist of consecutive repeating characters in "zzs".
     * Example 2:
     *
     * Input: s = "ubv?w"
     * Output: "ubvaw"
     * Explanation: There are 24 solutions for this problem. Only "v" and "w" are invalid modifications as the strings
     * will consist of consecutive repeating characters in "ubvvw" and "ubvww".
     * Example 3:
     *
     * Input: s = "j?qg??b"
     * Output: "jaqgacb"
     * Example 4:
     *
     * Input: s = "??yw?ipkj?"
     * Output: "acywaipkja"
     *
     *
     * Constraints:
     *
     * 1 <= s.length <= 100
     *
     * s contains only lower case English letters and '?'.
     */

    static public String modifyString(String s) {
        if(s.length() == 0){
            return s;
        }

        char arr[] = new char[26];
        char ch = 'a';
        for(int i=0; i<arr.length; i++){
            arr[i] = ch;
            ch++;
        }

        System.out.println(Arrays.toString(arr));

        while(true){
            int i = s.indexOf("?");
            if(i == -1){
                break;
            }
            else {
                char ch1 = arr[i%26];
                if(i<s.length()-1){
                    if(ch1 == s.charAt(i+1)){
                        ch1++;
                    }
                    if(i>0){
                        if(ch1 == s.charAt(i-1)){
                            ch1++;
                        }
                    }
                    s = s.substring(0,i) + ch1 + s.substring(i+1, s.length());
                }
                else {
                    if(i != 0){
                        if(s.charAt(i-1) == ch1){
                            ch1++;
                        }
                        s = s.substring(0, i) + ch1;
                     }
                    else {
                        s = s.substring(0,i) + ch1;
                    }
                }
            }
        }
        return s;
    }

    public static void main(String [] args){
        String str = "??yw?ipkj?";
        System.out.println(modifyString(str));
    }
}
