package CodingNinja;

import java.util.HashMap;

public class NearestRepetition {
    public static int minDistance(int[] arr){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = arr.length;
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i])!=null){
                min = min>i-map.get(arr[i])?i-map.get(arr[i]):min;
                map.put(arr[i],i);
            }
            else {
                map.put(arr[i],i);
            }
        }
        return min;
    }

    public static void main(String [] args){
        //int arr[] = {1,3,1,5,4,3};
        //int arr[] = {1,2,3,4,5};
        //int arr[] = {1,4,3,5,4,6,4};
        int arr[] = {1,1,1,1};
        System.out.print(minDistance(arr));
    }
}
