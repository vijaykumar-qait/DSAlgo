package CodingNinja;

import java.util.Arrays;

public class CheckPallindromeRecursion {

    public static boolean isStringPalindrome(String input, int start, int end) {
        if(start>=end){
            return true;
        }
        if(input.charAt(start)!=input.charAt(end)){
            return false;
        }
        boolean smallStr = isStringPalindrome(input, start+1, end-1);
        return smallStr;
    }

    public static boolean isStringPalindrome(String input) {
        // Write your code here

        //return  isStringPalindrome(input, 0, input.length()-1);

        if(input.length()<=1){
            return true;
        }
        if(input.charAt(0) != input.charAt(input.length()-1)){
            return false;
        }
        String smallInput = input.substring(1, input.length()-1);
        return isStringPalindrome(smallInput);
    }

    public static void main(String args []){
        String str = "abcdba";
        System.out.println(isStringPalindrome(str));

        int[] arr = {999, 612, 589, 856, 56, 945, 243};
        System.out.println(Arrays.stream(arr).max().getAsInt() + 1);
    }

}
