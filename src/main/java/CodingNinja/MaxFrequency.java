package CodingNinja;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxFrequency {
    public static void main(String [] args){
        //int arr[] = {2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6};
        //int arr[] = {675, 28, -429, -290, 444, -949, 992, -850, 280, 810};
        int arr[] = {861, 911, 705, 386, -854, 653, -999, 5, -650, -404, 38, -403, -239, -430, -531, -253, -672, -161, -710, -300};

        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]) == null){
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        Set<Integer> set = map.keySet();
        int max = Integer.MIN_VALUE;
        int element = arr[0];
        for(Integer key : set){
            int value = map.get(key);
            if(value>max){
                max = value;
                element = key;
            }
        }

        System.out.println(element);

    }
}
