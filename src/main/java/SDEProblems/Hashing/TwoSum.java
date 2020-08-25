package SDEProblems.Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /**
     * 1. Two Sum
     * Easy
     *
     * 16286
     *
     * 590
     *
     * Add to List
     *
     * Share
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * Example:
     *
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */
    static public int[] twoSum(int[] nums, int target) {
        if(nums.length<2){
            return nums;
        }

        int arr[] = new int[2];

        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int get = target - nums[i];
            if(map.containsKey(get)){
                arr[0] = i;
                arr[1] = map.get(get);
                break;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }

    public static void main(String [] args){
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
