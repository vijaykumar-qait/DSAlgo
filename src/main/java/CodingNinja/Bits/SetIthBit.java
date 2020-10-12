package CodingNinja.Bits;

/**
 * Code : Set ith bit
 * Send Feedback
 * You are given two integers N and i. You need to make ith bit of binary representation of N to 1 and return the updated N.
 * Counting of bits start from 0 from right to left.
 * Input Format :
 * Two integers N and i (separated by space)
 * Output Format :
 * Updated N
 * Sample Input 1 :
 * 4 1
 * Sample Output 1 :
 * 6
 * Sample Input 2 :
 * 4 4
 * Sample Output 2 :
 * 20
 */

public class SetIthBit {
    public static int turnOnIthBit(int n, int i) {
        //Your code goes here
        return n | (1<<i);
    }

    public static void main(String [] args){
        int N = 4;
        int i = 1;
        System.out.println(turnOnIthBit(N, i));
    }
}
