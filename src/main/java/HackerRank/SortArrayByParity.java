package HackerRank;

import java.util.Arrays;

public class SortArrayByParity {
    static public int[] sortArrayByParity(int[] A) {
        int i=0, j=A.length-1;

        while(i<j) {
            if (A[i] % 2 == 1 && A[j] % 2 == 0) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            } else if (A[i] % 2 == 0) {
                i++;
            } else if (A[j] % 2 == 1) {
                j--;
            }
        }
        return A;
    }

    public static void main(String [] args){
        int arr[] = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));;
    }
}
