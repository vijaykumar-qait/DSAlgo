package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesInAnArraySecond {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }

    public static void main(String args []){
        //int arr[] = {4,3,2,7,8,2,3,1};
        int arr[] ={};
        System.out.println(new FindAllDuplicatesInAnArraySecond().findDuplicates(arr).toString());
    }
}

