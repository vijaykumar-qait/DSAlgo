package HackerRank;

import java.util.HashMap;

public class MakeTwoArrayEqual {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length){
            return false;
        }
        HashMap<Integer, Integer> mapTarget = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> mapArr = new HashMap<Integer, Integer>();

        for(int i=0;i<arr.length; i++){
            if(mapArr.get(arr[i])==null){
                mapArr.put(arr[i],1);
            }
            else {
                mapArr.put(arr[i], (mapArr.get(arr[i])+1));
            }

            if(mapTarget.get(target[i])==null){
                mapTarget.put(target[i],1);
            }
            else {
                mapTarget.put(target[i], (mapTarget.get(target[i])+1));
            }
        }
        return mapArr.equals(mapTarget);
    }

    public static void main(String [] args){
//        int arr[] = {1,2,3,4};
//        int target[] = {2,4,1,3};

//        int arr[] = {};
//        int target[] = {};

        int arr[] = {3,7,9};
        int target[] = {3,7,11};


        System.out.println(new MakeTwoArrayEqual().canBeEqual(target, arr));
    }
}
