package DSAndAlgo.TechieDelight.Recursion;

import java.util.Arrays;

public class ReplaceEachElementWithProduct {

    //First apporach
/*    static public void replaceElementWithProduct(int arr[]){
        int newArr[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int proudct = 1;
            for(int j=0; j<arr.length; j++){
                if(i!=j){
                    proudct*=arr[j];
                }
            }
            newArr[i] = proudct;
        }
        System.out.println(Arrays.toString(newArr));
    }*/

// second approach
    static public void replaceElementWithProduct(int arr[]){
        int n = arr.length;
        int left[] = new int [n];
        int right[] = new int [n];

        left[0] = 1;
        for(int i=1; i<n; i++){
            left[i] = left[i-1] * arr[i-1];
        }

        right[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            right[i] = right[i+1] * arr[i+1];
        }

        for(int i=0; i<n; i++){
            arr[i] = left[i] * right[i];
        }
        System.out.println(Arrays.toString(arr));
    }


//third approach using recursion

    static public int replaceElementWithProduct(int arr[], int size, int left, int i/*iterate through array*/){
        if(i==size){
            return 1;
        }

        int current = arr[i];

        int right = replaceElementWithProduct(arr, size, left*arr[i], i+1);

        arr[i] = left * right;
        return current * right;
    }

    public static void main(String [] args){
        int arr[] = {1,2,3,4,5};
        //replaceElementWithProduct(arr);
        replaceElementWithProduct(arr, arr.length, 1, 0);
        System.out.println(Arrays.toString(arr));
    }
}
