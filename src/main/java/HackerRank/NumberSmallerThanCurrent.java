package HackerRank;

import java.util.Arrays;
import java.util.HashMap;

public class NumberSmallerThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int sortArr[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortArr);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int diffArr[] = new int[nums.length];
        for(int i=0; i<sortArr.length; i++){
            if(map.get(sortArr[i])==null){
                map.put(sortArr[i], i);
            }
        }
        for(int i=0; i<nums.length; i++){
            diffArr[i] = map.get(nums[i]);
        }
        return diffArr;
    }

    public static void main(String [] args){
        //int arr[] = {8,1,2,2,3};
        //int arr[] = {6,5,4,8};
        //int arr[]= {7,7,7,7};
        int arr[] = {};
        System.out.println(Arrays.toString(new NumberSmallerThanCurrent().smallerNumbersThanCurrent(arr)));
    }
}
