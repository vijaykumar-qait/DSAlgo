package Leetcode;

public class ArrangingCoins {
    static public int arrangeCoins(int n) {
        int i = 1;
        int fullStairCount = 0;
        while(i<=n){
            n=n-i;
            fullStairCount++;
            i++;
        }
        return fullStairCount;
    }

    public static void main(String [] args){
        int n= 10;

        System.out.println(arrangeCoins(n));
    }
}
