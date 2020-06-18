package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappreadInArray {

//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        Arrays.sort(nums);
//        List<Integer> list = new ArrayList<Integer>();
//        for(int i=1; i<=nums.length;i++){
//            if(nums[i-1]!=i){
////                if(!list.contains(nums[i])){
////                    list.add(i);
////                }
//                list.add(i);
//            }
//        }
//
//        System.out.println("list: " + list.toString());
//
//        for (int i=0; i<nums.length; i++){
//            if(list.contains(nums[i])){
//                int index = list.indexOf(nums[i]);
//                list.remove(index);
//            }
//        }
//        return list;
//    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int hashTable [] = new int[nums.length+1];
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++){
                hashTable[nums[i]]++;
        }

        for(int i=1; i<hashTable.length;i++){
            if(hashTable[i]==0){
                list.add(i);
            }
        }

        //System.out.println("list: "+ list.toString());

        return  list;
    }

    public static void main(String args[]){
        int arr[] = {4,3,2,7,8,2,3,3,3,4,4,4,1};
        //int arr[] = {1,1};
        //int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(new DisappreadInArray().findDisappearedNumbers(arr).toString());
    }
}
