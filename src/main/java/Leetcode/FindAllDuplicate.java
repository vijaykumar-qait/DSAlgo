package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    public static List<Integer> findDuplicates(int[] nums) {
        int arr[] = new int [nums.length+1];
        List<Integer> duplicate = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(arr[nums[i]] == 1){
                duplicate.add(nums[i]);
            }
            arr[nums[i]]++;

        }
//        for(int i=1; i<arr.length; i++){
//            if(arr[i]==2){
//                duplicate.add(i);
//            }
//        }
        System.out.println(duplicate.toString());
        return duplicate;
    }

    public static void main(String args[]){
        int arr[] = {4,3,2,7,8,2,3,1};
        findDuplicates(arr);
    }
}
