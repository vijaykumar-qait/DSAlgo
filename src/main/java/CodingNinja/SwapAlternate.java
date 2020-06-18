package CodingNinja;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapAlternate {
    public static void main(String [] args){
        //int arr[] = {9, 3, 6, 12, 4, 32};
        //int arr[]={1,2};
        //int arr[]={1,2,3};
        //int arr[] = {1};
        //int arr[] = {9, 3, 6, 12, 4, 32, 5, 11, 19};
        int arr[] = {41, 67, 30, 0, 69};
        int index=0;
        for(int i=0; i<arr.length/2; i++){
            arr[index]=arr[index]+arr[index+1];
            arr[index+1]=arr[index]-arr[index+1];
            arr[index]=arr[index]-arr[index+1];
            index+=2;
        }
        System.out.println(Arrays.toString(arr));
    }

}
