package CodingNinja;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int input[], int tempArr[], int low, int mid, int high){
        int k = low;
        int i=low, j=mid;
        int m=mid+1, n=high;

        while(i<=j && m<=n){
            if(input[i]<=input[m]){
                tempArr[k++] = input[i++];
            }
            else {
                tempArr[k++] = input[m++];
            }
        }

        while (i<=j){
            tempArr[k++] = input[i++];
        }

        while (m<=n){
            tempArr[k++] = input[m++];
        }

        for(int l=low; l<=high; l++){
            input[l] = tempArr[l];
        }
    }

    public static void mergeSort(int[] input, int tempArr[], int low, int high){
        if(low>=high){
            return;
        }
        int mid = low + (high-low)/2;
        mergeSort(input, tempArr, low, mid);
        mergeSort(input, tempArr, mid+1, high);
        merge(input, tempArr, low, mid, high);
    }

    public static void mergeSort(int[] input){
        // Write your code here
        int tempArr[] = new int[input.length];
        mergeSort(input,tempArr, 0, input.length-1);
    }

    public static void main(String [] args){
        int arr[] = {1,1,1,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
