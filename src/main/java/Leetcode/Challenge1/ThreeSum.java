package Leetcode.Challenge1;

import java.util.*;

public class ThreeSum {

//    static public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(nums);
//        for(int i=0; i<nums.length-2; i++){
//            for(int j=i+1, k=nums.length-1; j<k;){
//                int sum = nums[i] + nums[j] + nums[k];
//                if(sum == 0){
//                    List<Integer> list1 = new ArrayList<>();
//                    list1.add(nums[i]);
//                    list1.add(nums[j]);
//                    list1.add(nums[k]);
//                    if(!list.contains(list1)){
//                        list.add(list1);
//                    }
//                    j++;
//                    k--;
//                }
//                else if(sum > 0){
//                    k--;
//                }
//                else {
//                    j++;
//                }
//            }
//        }
//        return list;
//    }

    static public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int req = 0 - (nums[i] + nums[j]);
                if(map.containsKey(req) && map.get(req)>0){
                    map.put(req, map.get(req)-1);
                    map.put(nums[i], map.get(req)-1);
                    map.put(nums[j], map.get(req)-1);
                    List<Integer> newList = Arrays.asList(nums[i], nums[j], req);
                    if(!list.contains(newList)){
                        list.add(newList);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String [] args){
        //int arr[] = {-1, 0, 1, 2, -1, -4};
        //int arr[] = {0,0,0,0};
        //int arr[] = {3,0,-2,-1,1,2};
        //int arr[] = {0,0};
        int arr[] = {1,2,-2,-1};
        System.out.println(threeSum(arr).toString());
    }
}
