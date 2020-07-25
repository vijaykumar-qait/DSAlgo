package CodingNinja.BacktrackingDynamicProgramming;

import java.util.*;

public class CombinationalSum {
    /**
     * Combinational Sum
     * Send Feedback
     * Given an array of integers A and an integer B. Find and return all unique combinations in A where the sum of elements is equal to B.
     * Elements of input array can be repeated any number of times.
     * One combination should be saved in increasing order. Order of different combinations doesn't matter.
     * Note : All numbers in input array are positive integers.
     * Input Format :
     * Line 1 : Integer n
     * Line 2 : n integers (separated by space)
     * Line 3 : Integer B (i.e. sum)
     * Output Format :
     * Combinations in different lines
     * Contraints :
     * 1<= N <=1000
     * Sample Input 1 :
     * 4
     * 7 2 6 5
     * 16
     * Sample Output 1 :
     * 2 2 2 2 2 2 2 2
     * 2 2 2 2 2 6
     * 2 2 2 5 5
     * 2 2 5 7
     * 2 2 6 6
     * 2 7 7
     * 5 5 6
     * Sample Input 2 :
     * 4
     * 2 4 6 8
     * 8
     * Sample Output 2 :
     * 2 2 2 2
     * 2 2 4
     * 2 6
     * 4 4
     * 8
     */

    public static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int sum, int sumSoFar, int i,

                                                               ArrayList<Integer> list, ArrayList<ArrayList<Integer>> finalList, int j) {

        if(sum==sumSoFar){
            ArrayList<Integer> newListTwo = new ArrayList<>();
            newListTwo.addAll(list);
            ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
            newList.addAll(finalList);
            newList.add(newListTwo);
            return newList;
        }

        if(i==arr.length){
            if(sum==sumSoFar){
                ArrayList<Integer> newListTwo = new ArrayList<>();
                ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
                newList.addAll(finalList);
                newList.add(newListTwo);
                return newList;
            }
            return finalList;
        }

        if(!(arr[i]+sumSoFar>sum)){
            sumSoFar+=arr[i];
            list.add(arr[i]);
            finalList = combinationSum(arr, sum, sumSoFar, i, list, finalList, j+1);
            sumSoFar-=arr[i];
            list.remove(j);
        }

        finalList = combinationSum(arr, sum, sumSoFar, i+1, list, finalList, j);
        return finalList;
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int newArr[] = new int[set.size()];
        Iterator<Integer> itr = set.iterator();
        int i=0;
        while(itr.hasNext()){
            newArr[i++] = itr.next();
        }
        System.out.println(Arrays.toString(newArr));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
        Arrays.sort(newArr);
        return combinationSum(newArr, sum, 0, 0, list, finalList, 0);
    }

    public static void main(String [] args){
        int arr[] = {7 ,2 ,6 ,5};
        int sum = 16;
        System.out.println(combinationSum(arr, sum).toString());
    }
}
