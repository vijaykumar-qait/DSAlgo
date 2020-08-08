package CodingNinja.BacktrackingDynamicProgramming;

public class SubSetSum {
    /**
     * Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
     * Example:
     *
     * Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
     * Output: True
     * There is a subset (4, 5) with sum 9.
     *
     * Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 30
     * Output: False
     * There is no subset that add up to 30.
     */

    public static boolean subSetSum(int arr[], int sum, int i){
        //base case
        if(i == arr.length){
            if(sum==0){
                return true;
            }
            return false;
        }

        if(sum == 0){
            return true;
        }

        if(arr[i] <= sum){
            if(subSetSum(arr, sum - arr[i], i+1)){
                return true;
            }
        }
        else {
            if(subSetSum(arr, sum, i+1)){
                return true;
            }
        }
        return subSetSum(arr, sum, i+1);
    }

    public static void main(String [] args){
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 30;

        System.out.println(subSetSum(arr, sum, 0));
    }
}
