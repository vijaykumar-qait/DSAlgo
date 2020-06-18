package CodingNinja;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintThePatter {
    public static void main(String [] args){
        int n=4;
        int arr[][]= new int [n][n];
        int start_row = 0;
        int end_row = n-1;
        int col=n;

        int i = 1;
        while(start_row<=end_row){
            for(int j=0; j<col; j++){
                arr[start_row][j] = i++;
            }
            start_row++;

            if(start_row<end_row){
                for(int j=0; j<col; j++){
                    arr[end_row][j]=i++;
                }
                end_row--;
            }
        }

        for(int j=0; j<n; j++){
            for(int k=0; k<n; k++){
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }

    }
}
