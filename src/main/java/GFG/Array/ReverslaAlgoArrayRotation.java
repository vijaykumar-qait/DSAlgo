package GFG.Array;

import java.util.Arrays;

public class ReverslaAlgoArrayRotation {

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int arr[], int i, int j){
        if(i>=j){
            return;
        }
        swap(arr, i,j);
        reverseArray(arr, i+1, j-1);
    }

    static void reversalRotate(int arr[], int d){
        if(d==0){
            return;
        }
        if(d>arr.length){
            d = d%arr.length;
        }

        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
    }

    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6};
        int d = 2;
        reversalRotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
