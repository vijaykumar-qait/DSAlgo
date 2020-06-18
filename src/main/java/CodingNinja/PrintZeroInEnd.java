package CodingNinja;

import java.util.Arrays;

public class PrintZeroInEnd {
    public static void main(String [] args){
        //int arr[] = {2,6,0,0,1,9,0,8,0};
        int arr[] = {0, 3, 0, 2, 0};

        int k = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
