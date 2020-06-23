package CodingNinja;

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

        return  isStringPalindrome(input, 0, input.length()-1);
    }

    public static void main(String args []){
        String str = "abba";
        System.out.println(isStringPalindrome(str));
    }

}
