package GFG.Array;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatePrac {
    public static int removeDuplicate(int arr[]){
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                arr[index++] = arr[i];
                map.put(arr[i], i);
            }
        }
        return index;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,1,2,4,5};
        int index = removeDuplicate(arr);
        for(int i=0; i<index;i++){
            System.out.println(arr[i]);
        }
    }
}
