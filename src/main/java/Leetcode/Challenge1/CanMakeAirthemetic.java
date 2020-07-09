package Leetcode.Challenge1;

import java.util.Arrays;

public class CanMakeAirthemetic {

    static public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        for(int i=arr.length-1; i>0; i--){
            if(arr[i] - arr[i-1]!= d){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        int arr [] = {1,2,4};
        System.out.println(canMakeArithmeticProgression(arr));

    }
}
