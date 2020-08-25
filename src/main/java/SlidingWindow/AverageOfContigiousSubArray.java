package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageOfContigiousSubArray {
    /**
     *
     Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
     Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
     */

    static ArrayList<Double> averageOfContigiousSubarray(int input[], int k){
        ArrayList<Double> list = new ArrayList<>();
        for(int i=0; i<=input.length-k; i++){
            double sum = 0;
            for(int j=i; j<k+i; j++){
                sum+=input[i];
            }
            list.add(sum/k);
        }
        return list;
    }

    static double[] averageOfContigiousSubarraySlidingWindow(int input[], int k){
        int n = input.length;
        double ans [] = new double[n-k+1];
        double windowSum = 0;
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd<n; windowEnd++){
            windowSum+=input[windowEnd];
            if(windowEnd>=k-1){
                ans[windowStart] = (double)windowSum/k;
                windowSum -= input[windowStart];
                windowStart++;
            }
        }
        return ans;
    }

    public static void main(String [] args){
        int arr[] = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        System.out.println(Arrays.toString(averageOfContigiousSubarraySlidingWindow(arr, k)));

    }
}
