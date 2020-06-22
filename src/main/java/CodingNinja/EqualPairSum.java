package CodingNinja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EqualPairSum {
    public static boolean findPairs(int[] arr){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return the desired output and don't print anything.
         * Taking input and printing output is handled automatically.
         */

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i])!=null){
                return true;
            }

            ArrayList<Integer> list = map.get(arr[i]);

            for(int j=i+1; j<arr.length; j++){
                int sum = arr[i] + arr[j];
                if(list == null){
                    list = new ArrayList<>();
                    list.add(sum);
                }
                else {
                    list.add(sum);
                }
            }
            map.put(arr[i], list);
        }

//        for(Map.Entry<Integer, ArrayList<Integer>> entry  : map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//
//        System.out.println();
//        System.out.println();

        for(int i=0; i<arr.length-1; i++){
            ArrayList<Integer> list1 = map.get(arr[i]);
            for(int j=i+1; j<arr.length-1; j++){

//                System.out.println("list 1: " + list1.toString());

                ArrayList<Integer> list2 = map.get(arr[j]);
//                System.out.println("list2: " +  list2.toString());

                for(int element : list2){
                    if(list1.contains(element)){
                        return true;
                    }
                }

//                System.out.println();
            }
        }

        return  false;
    }
    public static void main(String [] args){
        //int arr[] = {9, 8, 7, 10, 20, 30};
        //int arr[] = {10,10,8};
        int arr[] = {9, 8, 17, 20, 30, 40};
        System.out.print(findPairs(arr));
    }
}
