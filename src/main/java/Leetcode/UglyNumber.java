package Leetcode;

public class UglyNumber {
    /**
     * 263. Ugly Number
     * Easy
     *
     * 543
     *
     * 658
     *
     * Add to List
     *
     * Share
     * Write a program to check whether a given number is an ugly number.
     *
     * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
     *
     * Example 1:
     *
     * Input: 6
     * Output: true
     * Explanation: 6 = 2 × 3
     * Example 2:
     *
     * Input: 8
     * Output: true
     * Explanation: 8 = 2 × 2 × 2
     * Example 3:
     *
     * Input: 14
     * Output: false
     * Explanation: 14 is not ugly since it includes another prime factor 7.
     * Note:
     *
     * 1 is typically treated as an ugly number.
     * Input is within the 32-bit signed integer range: [−231,  231 − 1].
     */
    static public boolean isUgly(int num) {
        if(num<=0){
            return false;
        }
        if(Math.abs(num) == 1){
            return  true;
        }
        if(num % 2 == 0){
            if(isUgly(num/2)){
                return true;
            }
        }
        else if(num%3 == 0){
            if(isUgly(num/3)){
                return true;
            }
        }
        else if(num%5==0){
            if(isUgly(num/5)){
                return true;
            }
        }
        else {
            return false;
        }
        return false;
    }

    public static void main(String [] args){
        int num = -2147483648;
        System.out.println(isUgly(num));
    }

}
