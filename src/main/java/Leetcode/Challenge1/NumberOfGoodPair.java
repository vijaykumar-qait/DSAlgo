package Leetcode.Challenge1;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPair {

    static int factorial(int n){
        if(n<1){
            return 1;
        }
        int smallAns = n * factorial(n-1);
        return smallAns;
    }

    static int combination(int n, int r){
        int numerator = factorial(n);
        int denominator = factorial(n-r) * factorial(r);
        return numerator/denominator;
    }

    static public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int count = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                count += combination(entry.getValue(), 2);
            }
        }
        return count;
    }
    public static void main(String [] args){
        //int arr[] ={1,2,3,1,1,3};
        //int arr[] ={1,1,1,1};
        int arr[] ={1,2,3};
        System.out.print(numIdenticalPairs(arr));
    }
}
