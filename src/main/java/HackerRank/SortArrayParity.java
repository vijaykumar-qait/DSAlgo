package HackerRank;

import java.util.Arrays;

public class SortArrayParity {

    public int[] sortArrayByParityII(int[] A) {
        int i=0, j=1;
        while(i<A.length && j<A.length){
            if((A[j] & 1) == 1){
               j+=2;
            }
            else if((A[i]&1)==0){
                i+=2;
            }
            else {
                A[i]+=A[j];
                A[j]=A[i]-A[j];
                A[i]=A[i]-A[j];
                i+=2;
                j+=2;
            }
        }
        return A;
    }

    public static void main(String args []){
        int arr[]= {4,2,5,7};
        //int arr[] = {2,3,4,5,6,7,8,9};
        //int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(new SortArrayParity().sortArrayByParityII(arr)));
    }
}
