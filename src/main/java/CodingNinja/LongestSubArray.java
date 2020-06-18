package CodingNinja;

import java.util.HashMap;

public class LongestSubArray {

    public static int max(int[] arr){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        int maxSize = -1, startIndex = 0, sum=0;
//        for(int i=0; i<arr.length; i++){
//            int sum = arr[i]==0?-1:1;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[j]==0){
//                    sum+=-1;
//
//                }
//                else {
//                    sum+=1;
//                }
//                if(sum==0 && maxSize < j-i+1){
//                    maxSize = j-i+1;
//                    startIndex = i;
//                }
//            }
//        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i=0; i<arr.length; i++){
            sum += arr[i]==0?-1:1;
            if(map.containsKey(sum)){
                if(maxSize<i-map.get(sum)){
                    maxSize=i-map.get(sum);
                    startIndex = map.get(sum);
                }
            }
            else {
                map.put(sum,i);
            }
        }

        return maxSize;
    }

    public static void main(String [] args){
        //int arr[] = {0,0,0,0,1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,0,0,1,0,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,0,0,0,0,1,1,0,0,0,1,0,0,1,1,1,0,1,0,0,1,1,0,1,0,0,0,1,0,0,0,0,0,1,1,1,1,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0};
        //int arr [] = {1,0,0,1,1,1};
        //int arr [] ={1,1,1,0,0,0,1,1,0,0};
        int arr [] = {1,0,0,1,1,0,0,1,0,1,1,1,0,0,1,1,1,1,1,0,0,1,1,0,1,0,1,1,0,1,0,1,1,0,1,1,1,1,0,1,0,1,1,0,0,1,1,1,1,1};
        System.out.print(max(arr));
    }

}
