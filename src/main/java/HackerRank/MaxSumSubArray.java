package HackerRank;

import java.util.Arrays;

public class MaxSumSubArray {

    static int[] maxSubarray(int[] arr) {
        int starti = 0;
        int endi = 0;
        int maxSum = 0;

        for(int i=0; i<arr.length; i++){
            int sum = arr[i];
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum>maxSum){
                    starti = i;
                    endi = j;
                }
            }
        }
        int subSeqSum = 0;
        for(int i=starti; i<=endi; i++){
            if(arr[i]<0){
                subSeqSum+=arr[i];
            }
        }

        int returnArr[] = {maxSum, subSeqSum};
        return returnArr;
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(maxSubarray(arr)));
    }
}
