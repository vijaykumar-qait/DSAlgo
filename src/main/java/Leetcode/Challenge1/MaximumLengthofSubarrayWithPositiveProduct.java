package Leetcode.Challenge1;

public class MaximumLengthofSubarrayWithPositiveProduct {
    /**
     * 5500. Maximum Length of Subarray With Positive Product
     * User Accepted:2241
     * User Tried:3723
     * Total Accepted:2282
     * Total Submissions:8456
     * Difficulty:Medium
     * Given an array of integers nums, find the maximum length of a subarray where the product of all its elements is positive.
     *
     * A subarray of an array is a consecutive sequence of zero or more values taken out of that array.
     *
     * Return the maximum length of a subarray with positive product.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,-2,-3,4]
     * Output: 4
     * Explanation: The array nums already has a positive product of 24.
     * Example 2:
     *
     * Input: nums = [0,1,-2,-3,-4]
     * Output: 3
     * Explanation: The longest subarray with positive product is [1,-2,-3] which has a product of 6.
     * Notice that we cannot include 0 in the subarray since that'll make the product 0 which is not positive.
     * Example 3:
     *
     * Input: nums = [-1,-2,-3,0,1]
     * Output: 2
     * Explanation: The longest subarray with positive product is [-1,-2] or [-2,-3].
     * Example 4:
     *
     * Input: nums = [-1,2]
     * Output: 1
     * Example 5:
     *
     * Input: nums = [1,2,3,5,-6,4,0,10]
     * Output: 4
     *
     *
     * Constraints:
     *
     * 1 <= nums.length <= 10^5
     * -10^9 <= nums[i] <= 10^9
     */
    static public int getMaxLen(int[] nums) {
        int maxSum = Integer.MIN_VALUE, maxSize = 0;

        for(int i=0; i<nums.length; i++){

            for(int j=i; j<nums.length; j++){

                int tempSum = nums[j], tempSize = 1;
                if(tempSize>maxSize){
                    maxSum = tempSum;
                    maxSize =tempSize;
                }

                for(int k=j+1; k<nums.length; k++){
                    tempSum *= nums[k];
                    tempSize = k-j+1;
                    if(tempSize>maxSize && tempSum>0){
                        maxSum = tempSum;
                        maxSize = k-j+1;
                    }
                }

            }
        }
        if(maxSum<0){
            return 0;
        }
        return maxSize;
    }

    public static void main(String [] args){
        int nums [] = {-1};
        System.out.println(getMaxLen(nums));
    }
}
