package Leetcode.Challenge1;

import java.util.Arrays;

public class LastMomentAntFall {

    static public int getLastMoment(int n, int[] left, int[] right) {
        int leftMax = 0;
        int leftMin = 0;
        int rightMin = 0;

        if(left.length>0){
            leftMax = Arrays.stream(left).max().getAsInt();
            leftMin = n-leftMax;
        }

        if(right.length>0){
            rightMin = Arrays.stream(right).min().getAsInt();

        }
        int lastMoment = 0;
        if(left.length>0 && right.length>0){
            lastMoment = n-leftMin > n-rightMin ? n-leftMin : n-rightMin;
        }
        else if(left.length>0 && right.length==0){
            lastMoment = n-leftMin;
        }
        else {
            lastMoment = n-rightMin;
        }

        return lastMoment;
    }

    public static void main(String [] args){
        int n = 6;
        int left [] = {6};
        int right [] = {0};
        System.out.println(getLastMoment(n, left, right));
    }
}
