package CodingNinja.BacktrackingDynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class ReturnSubSetSumToK {

    /**
     * Return subsets sum to K
     * Send Feedback
     * Given an array A of size n and an integer K, return all subsets of A which sum to K.
     * Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
     * Note : The order of subsets are not important.
     * Input format :
     * Line 1 : Integer n, Size of input array
     * Line 2 : Array elements separated by space
     * Line 3 : K
     * Constraints :
     * 1 <= n <= 20
     * Sample Input :
     * 9
     * 5 12 3 17 1 18 15 3 17
     * 6
     * Sample Output :
     * 3 3
     * 5 1
     *
     */

    public static int[][] subsetsSumK(int input[], int k, int sum, List<Integer> list, int subSet[][], int i, int l) {
        if(sum==k){
            int newSubSet[][] = new int[subSet.length+1][];
            for(int j=0; j<subSet.length; j++){
                newSubSet[j] = subSet[j];
            }
            newSubSet[subSet.length] = new int[list.size()];

            System.out.println("length: "+subSet.length);

            for(int j=0; j<list.size(); j++){
                newSubSet[subSet.length][j] = list.get(j);
            }
            return newSubSet;
        }


        for(int j=i; j<input.length; j++){
            if(!(sum+input[j]>k)){
                sum+=input[j];
                list.add(input[j]);
                subSet = subsetsSumK(input, k, sum, list, subSet, j+1, l+1);
                sum-=input[j];
                list.remove(l);
            }
        }

        return subSet;
    }

    public static int[][] subsetsSumK(int input[], int k) {
        int subSet[][]={};
        List<Integer> list = new ArrayList<>();
        return subsetsSumK(input, k, 0, list, subSet, 0, 0);
    }


    public static void main(String [] args){
        int arr[] = {5, 12, 3, 17, 1, 18, 15, 3, 17};
        int k = 6;

        int subSet[][]= subsetsSumK(arr, k);
        for(int row=0; row<subSet.length; row++){
            for(int col=0; col<subSet[row].length; col++){
                System.out.print(subSet[row][col]);
            }
            System.out.println();
        }
    }
}
