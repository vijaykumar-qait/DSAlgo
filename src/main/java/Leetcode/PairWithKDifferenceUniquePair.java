package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class PairWithKDifferenceUniquePair {
    public int findPairs(int[] input, int k){

        if (input == null || input.length == 0 || k < 0)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i : input){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry :  map.entrySet()){
            if(k==0){
                if(entry.getValue()>=2){
                    count++;
                }
            }
            else {
                if(map.containsKey(entry.getKey()+k)){
                    count++;
                }
            }
        }

//        if(k!=0){
//            for(int i=0; i<input.length; i++){
//                int second = input[i]-k;
//
//                if(map.get(second)!=null){
//                    count++;
//                }
//            }
//        }
//        else {
//            for(Map.Entry<Integer, Integer> item :  map.entrySet()){
//                if(item.getValue()>1){
//                    count+=item.getValue()/2;
//                }
//            }
//
//        }
        return count;
    }

    public static void main(String [] args){
        //int arr [] = {3, 1, 4, 1, 5};
        //int arr[] = {1, 2, 3, 4, 5};
        int arr[] = {1, 3, 1, 5, 4, 1, 1,4};
        //int arr[] = {1,2,3,4,5};
        int k = 0;
        System.out.println(new PairWithKDifferenceUniquePair().findPairs(arr, k));
    }
}
