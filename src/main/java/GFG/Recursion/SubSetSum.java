package GFG.Recursion;

import java.util.Scanner;

public class SubSetSum {

    /**
     * Input:
     * 5
     * 2 5 8 11 13
     *
     * Its Correct output is:
     * 0 2 5 7 8 10 11 13 13 13 15 15 16 18 18 19 20 21 21 23 24 24 26 26 26 28 29 31 32 34 37 39
     *
     * And Your Code's output is:
     * 0 2 5 7 8 10 13 15 11 13 16 18 19 21 24 26 13 15 18 20 21 23 26 28 24 26 29 31 32 34 37 39
     *
     */

    static int [] subSetSum(int arr[], int length){
        if(length==0){
            int temp[] = {0};
            return temp;
        }
        length--;
        int smallAns [] = subSetSum(arr, length);
        int newSmallAns [] = new int [smallAns.length*2];
        int k =0;
        for(int i=0; i<smallAns.length; i++){
            newSmallAns[k++] = smallAns[i];
        }

        for(int i=0; i<smallAns.length; i++){
            newSmallAns[k++] = arr[length]+smallAns[i];
        }
        return newSmallAns;
    }

    static void subSet(int arr[]){
        int temp[] = subSetSum(arr, arr.length);
        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();

        for(int i=0; i<testcase; i++){
            int arrSize = scanner.nextInt();
            int arr[] =  new int[arrSize];
            for(int j=0; j<arrSize; j++){
                arr[j] = scanner.nextInt();
            }
            subSet(arr);
        }
    }
}
