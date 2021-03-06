package SDEProblems.Arrays;

import java.util.Arrays;

public class Sort_an_array_of_0s_1s_2s {
    /**
     * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
     *
     * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
     *
     * Note: You are not suppose to use the library's sort function for this problem.
     *
     * Example:
     *
     * Input: [2,0,2,1,1,0]
     * Output: [0,0,1,1,2,2]
     * Follow up:
     *
     * A rather straight forward solution is a two-pass algorithm using counting sort.
     * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total
     * number of 0's, then 1's and followed by 2's.
     * Could you come up with a one-pass algorithm using only constant space?
     *
     */

    static public void sortColors(int[] nums) {
        int low=0, mid=0, high=nums.length-1, temp=0;
        while(mid<=high){
            switch (nums[mid]){
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String [] args){
        int arr[] = {2,2,2,2,2};
        sortColors(arr);
    }
}
