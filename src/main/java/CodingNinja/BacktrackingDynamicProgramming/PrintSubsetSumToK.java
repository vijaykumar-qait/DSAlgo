package CodingNinja.BacktrackingDynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsetSumToK {

    public static void printSubsetsSumTok(int input[], int k, int sum, int i, List<Integer> list, int j) {

        if(i==input.length){
            if(sum==k){
                for(int l=0; l<list.size(); l++){
                    System.out.print(list.get(l) + " ");
                }
                System.out.println();
            }
            return;
        }

        if(!(input[i]+sum > k)){
            list.add(input[i]);
            printSubsetsSumTok(input, k, sum+input[i], i+1, list, j+1);
            list.remove(j);
        }
        printSubsetsSumTok(input, k, sum, i+1, list, j);
    }

    public static void printSubsetsSumTok(int input[], int k) {
        List<Integer> list = new ArrayList<>();
        printSubsetsSumTok(input, k, 0, 0, list, 0);
    }

    public static void main(String [] args){
        int arr[] ={5, 12, 3, 17, 1, 18, 15, 3, 17};
        int n = 6;
        printSubsetsSumTok(arr, n);
    }
}
