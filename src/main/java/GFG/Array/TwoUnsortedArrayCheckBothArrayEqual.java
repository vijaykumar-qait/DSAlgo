package GFG.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoUnsortedArrayCheckBothArrayEqual {

    /*
    In case of interger calculate sum of 1 array and subract sum from another array is sum ==0 array are same else not
     */

    public static boolean areArrayEqual(int arr1[], int arr2[]){
        if(arr1.length != arr2.length){
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i=0; i<arr2.length; i++){
            if(map.containsKey(arr2[i]) && map.get(arr2[i])>0){
                map.put(arr2[i], map.get(arr2[i])-1);
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){

    }
}
