package HackerRank;

import java.util.Arrays;

public class DuplicateZero {
    static void shiftAndInsert(int arr[], int index){
        for(int i=arr.length-1; i>index; i--){
            arr[i] = arr[i-1];
        }
    }
    public static void main(String[] args){
        int arr[] = {0};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==0){
                shiftAndInsert(arr, i);
                i+=1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
