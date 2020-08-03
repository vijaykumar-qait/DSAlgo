package Leetcode.Challenge1;

public class DetectCapital {

    /**
     * Detect Capital
     * Given a word, you need to judge whether the usage of capitals in it is right or not.
     *
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     *
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital, like "Google".
     * Otherwise, we define that this word doesn't use capitals in a right way.
     *
     *
     * Example 1:
     *
     * Input: "USA"
     * Output: True
     *
     *
     * Example 2:
     *
     * Input: "FlaG"
     * Output: False
     *
     *
     * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
     *
     */

    static public boolean detectCapitalUse(String word) {

        if(word.length()==1){
            return true;
        }

        if(word.charAt(0)>96){
            for(int i=1; i<word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }
        else {
            if(word.length()>1){
                if(word.charAt(1)>96){
                    for(int i=2; i<word.length(); i++){
                        if(word.charAt(i)<97){
                            return false;
                        }
                    }
                }
                else {
                    for(int i=2; i<word.length(); i++){
                        if(word.charAt(i)>96){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String [] args){
        String str = "FlaG";
        System.out.println(detectCapitalUse(str));
    }
}
