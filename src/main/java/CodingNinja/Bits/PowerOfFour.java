package CodingNinja.Bits;

/**
 * Code : Check power of 4
 * Send Feedback
 * You are given an integer N. You need to check if N is power of 4 or not. Return true or false accordingly.
 * Note : Do it in O(1) time.
 * Input Format :
 * Integers N
 * Output Format :
 * true or false
 * Sample Input 1 :
 * 4
 * Sample Output 1 :
 * true
 * Sample Input 2 :
 * 8
 * Sample Output 2 :
 * false
 */

public class PowerOfFour {
    public static boolean isPowerOf4(int n) {
        //Your Code goes here
        return (n!=0) && ((n & (n-1)) == 0) && ((n & 0xAAAAAAAA)==0);
    }

    public static void main(String [] args){
        int n = 32;
        System.out.println(isPowerOf4(n));
    }
}
