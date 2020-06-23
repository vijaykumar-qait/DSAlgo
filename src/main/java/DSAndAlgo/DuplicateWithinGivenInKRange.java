package DSAndAlgo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateWithinGivenInKRange {

    static boolean duplicateExist(int arr[], int k){
// first approach using 2 for loop
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<=i+k && j<arr.length; j++){
//                if(arr[i] == arr[j]){
//                    return true;
//                }
//            }
//        }

// second approach using hash map
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<arr.length; i++){
//            if(map.get(arr[i])==null){
//                map.put(arr[i], i);
//            }
//            else {
//                if(i-map.get(arr[i])<=k){
//                    return true;
//                }
//            }
//        }

// third approach using sliding window
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);

            if(i>=k){
                set.remove(arr[i-k]);
            }
        }
        return false;
    }

    public static void main(String [] args){
        int arr[] = {5,6,8,2,4,6,9};
        int k = 3;
        System.out.println(duplicateExist(arr, k));
    }
}
