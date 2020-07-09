package CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllIndicesOfNumber {

    /*public static int [] allIndexes(int input[], int startIndex, int x, int arr[], int index){
        if(startIndex>=input.length){
            return arr;
        }

        if(input[startIndex] == x){
            arr[index++] = startIndex;
        }

        int smallArr[] = allIndexes(input,startIndex+1, x, arr, index);
        return smallArr;
    }*/

    /*public static int [] allIndexes(int input[], int startIndex, int x, int arr[]){
        if(startIndex>=input.length){
            return arr;
        }

        if(input[startIndex] == x){
            int smallArr [] = new int[arr.length+1];
            int i=0;
            for(; i<arr.length; i++){
                smallArr[i] = arr[i];
            }
            smallArr[i] = startIndex;
            arr = Arrays.copyOf(smallArr, smallArr.length);
        }

        int smallArr[] = allIndexes(input,startIndex+1, x, arr);
        return smallArr;
    }*/



    public static Integer[] allIndexes(int[] input, int startIndex, int x, List<Integer> list){
        if(startIndex == input.length-1){
            if(input[startIndex] == x){
                list.add(startIndex);
            }
            return list.stream().toArray(Integer[] :: new);
        }
        if(input[startIndex] == x){
            list.add(startIndex);
        }

        return allIndexes(input, startIndex+1, x, list);
    }

    public static Integer[] allIndexes(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        List<Integer> list = new ArrayList<>();
        return allIndexes(input, 0, x, list);

    }

    public static void main(String [] args){
        int arr [] ={9, 8, 10, 8, 8};
        int num = 8;
        System.out.println(Arrays.toString(allIndexes(arr, num)));
    }
}
