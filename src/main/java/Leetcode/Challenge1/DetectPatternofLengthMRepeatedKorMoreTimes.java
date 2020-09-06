package Leetcode.Challenge1;

public class DetectPatternofLengthMRepeatedKorMoreTimes  {
    /**
     * 5499. Detect Pattern of Length M Repeated K or More Times
     * User Accepted:2988
     * User Tried:4034
     * Total Accepted:3023
     * Total Submissions:7525
     * Difficulty:Easy
     * Given an array of positive integers arr,  find a pattern of length m that is repeated k or more times.
     *
     * A pattern is a subarray (consecutive sub-sequence) that consists of one or more values, repeated multiple times consecutively without overlapping. A pattern is defined by its length and the number of repetitions.
     *
     * Return true if there exists a pattern of length m that is repeated k or more times, otherwise return false.
     *
     *
     *
     * Example 1:
     *
     * Input: arr = [1,2,4,4,4,4], m = 1, k = 3
     * Output: true
     * Explanation: The pattern (4) of length 1 is repeated 4 consecutive times. Notice that pattern can be repeated k or more times but not less.
     * Example 2:
     *
     * Input: arr = [1,2,1,2,1,1,1,3], m = 2, k = 2
     * Output: true
     * Explanation: The pattern (1,2) of length 2 is repeated 2 consecutive times. Another valid pattern (2,1) is also repeated 2 times.
     * Example 3:
     *
     * Input: arr = [1,2,1,2,1,3], m = 2, k = 3
     * Output: false
     * Explanation: The pattern (1,2) is of length 2 but is repeated only 2 times. There is no pattern of length 2 that is repeated 3 or more times.
     * Example 4:
     *
     * Input: arr = [1,2,3,1,2], m = 2, k = 2
     * Output: false
     * Explanation: Notice that the pattern (1,2) exists twice but not consecutively, so it doesn't count.
     * Example 5:
     *
     * Input: arr = [2,2,2,2], m = 2, k = 3
     * Output: false
     * Explanation: The only pattern of length 2 is (2,2) however it's repeated only twice. Notice that we do not count overlapping repetitions.
     *
     *
     * Constraints:
     *
     * 2 <= arr.length <= 100
     * 1 <= arr[i] <= 100
     * 1 <= m <= 100
     * 2 <= k <= 100
     */

    static public boolean containsPattern(int[] arr, int m, int k) {
        for(int i=0; i<arr.length-m ; i++){
            int temp[] = new int[m];
            int l =0;
            for(int j=i; j<i+m; j++){
                temp[l++] = arr[j];
            }

            boolean checkFlag = true;
            int pair = 0;

            for(int j=i; j<arr.length; ){
                for(int n=0; n<temp.length; n++){
                    if(j<arr.length && temp[n] == arr[j]){
                        j++;
                    }else {
                        checkFlag = false;
                        break;
                    }
                }
                if(checkFlag){
                    pair++;
                }
                else {
                    break;
                }
            }
            if(pair >= k){
                return true;
            }
        }
        return false;
    }

    public static void main(String [] args){
        int arr[] = {2,2,2,2};
        int m = 2;
        int k = 3;
        System.out.println(containsPattern(arr, m, k));
    }

}
