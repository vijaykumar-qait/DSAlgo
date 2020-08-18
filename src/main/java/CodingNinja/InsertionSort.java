package CodingNinja;

import java.util.Arrays;

public class InsertionSort {
    static int [] insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++){
            for(int j = i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String [] args){
        int arr[] = {7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
