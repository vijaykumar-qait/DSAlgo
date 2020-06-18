package CodingNinja;

import java.util.HashMap;

public class ZeroSumSubArray {
    public static boolean subarraySumTo0(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
//        for(int i=0; i<input.length; i++){
//            int sum = 0;
//            for(int j=i; j<input.length; j++){
//                sum+=input[j];
//                if(sum==0){
//                    return true;
//                }
//            }
//        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum=0;
        for(int i=0; i<input.length;i++){
            sum+=input[i];
            if(map.get(sum)!=null){
                return true;
            }
            map.put(sum, i);
        }

        return false;
    }

    public static void main(String [] args){
        int arr[] = {7, 1, 3, -4, 5, 1};
        //int arr[] = {-6, 7, 6, 2, 1};
        //int arr[] = {1,4,-2,-2,5,-4,3};
        //int arr[]= {0,3,4,-7,9};
        System.out.println(subarraySumTo0(arr));
    }
}
