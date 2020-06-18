package CodingNinja;

import java.util.Arrays;

public class ArrangeNumber {
    public static void main(String [] args){
        int n = 10;


        int arr[]=new int[n];

        int index = 0;
        int index1=arr.length-1;

        for(int i=1, j=2; index<index1; i+=2, j+=2){
            arr[index++] = i;
            arr[index1--] = j;
        }
        arr[index]=n;

        System.out.println(Arrays.toString(arr));
    }
}
