package CodingNinja;

import java.util.HashMap;

public class PrintInteraction {

    public static void intersection(int[] arr1, int[] arr2) {
        //arr1 is always smaller
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr1.length; i++){
            if
            (map.get(arr1[i])==null){
                map.put(arr1[i], 1);
            }
            else {
                map.put(arr1[i], map.get(arr1[i])+1);
            }
        }

        for(int i=0; i<arr2.length; i++){
            if(map.get(arr2[i])!=null){
                int val = map.get(arr2[i]);
                if(val>0){
                    System.out.println(arr2[i]);
                    map.put(arr2[i], --val);
                }
            }
        }
    }

    public static void main(String [] args){
//        int arr1[] = {2, 6, 8, 5, 4, 3};
//        int arr2[] = {2, 3, 4, 7};

        int arr1[] = {2,6,1,2};
        int arr2[] = {1, 2, 3, 4, 2, 2};

        if(arr1.length<arr2.length){
            intersection(arr1, arr2);
        }
        else {
            intersection(arr2, arr1);
        }

    }
}
