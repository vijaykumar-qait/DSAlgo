package CodingNinja.BacktrackingDynamicProgramming;

import java.util.Arrays;

public class ReturnSubsetArray {

    public static int[][] subsets(int input[]) {
        if(input.length == 0){
            int arr[][] = {{}};
            return arr;
        }

        int smallInput[] = Arrays.copyOfRange(input, 1, input.length);
        int smallAns[][] = subsets(smallInput);
        int newSmallAns [][]= new int[smallAns.length*2][];
        int k=0;
        for(int i=0; i<smallAns.length; i++){
            newSmallAns[i] = new int[smallAns[i].length];
            for(int j=0; j<smallAns[i].length; j++){
                newSmallAns[i][j] = smallAns[i][j];
            }
            k++;
        }

        for(int i=0; i<smallAns.length; i++){
            int len = smallAns[i].length+1;
            newSmallAns[k] = new int[len];
            for(int j=0; j<1; j++){
                newSmallAns[k][j] = input[j];
            }
            for(int j=1; j<len; j++){
                newSmallAns[k][j] = smallAns[i][j-1];
            }
            k++;
        }
        return newSmallAns;
    }

    public static void main(String [] args){
        int input[]= {15, 20, 12};
        int arr[][] = subsets(input);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        int arr[][] = new int [2][];
//        for(int i=0; i<arr.length; i++){
//            arr[0] = new int[3];
//        }
//
//        int arr1[][] = {{}};
//        System.out.println("length: " + arr1.length);
//        System.out.println("length: " + arr1[0].length);
//
//
//        for(int i=0; i<arr1.length; i++){
//            for(int j=0; j<arr1[i].length; j++){
//                System.out.print(arr1[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println("hel");
//
//        int arr2[] = {1,2,3,4};
//        int arr3[] = Arrays.copyOfRange(arr2,arr2.length,arr2.length);
//        System.out.println(Arrays.toString(arr3));
//        System.out.println("length: " + arr3.length);
    }
}
