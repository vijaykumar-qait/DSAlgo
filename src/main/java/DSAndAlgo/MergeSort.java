package DSAndAlgo;

import java.util.Arrays;

public class MergeSort {

    void merge(int arr[], int aux[], int low, int mid, int high){
        int k=low, i=low, j=mid+1;

        //comparing and copying array in aux array
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                aux[k++]=arr[i++];
            }
            else {
                aux[k++]=arr[j++];
            }
        }

        //copying rest of first array
        while(i<=mid){
            aux[k++]=arr[i++];
        }

        while(j<=high){
            aux[k++] = arr[j++];
        }

        //copying back the original aux array to original array
        for(int l=low; l<=high; l++){
            arr[l] = aux[l];
        }
    }


    void mergeSort(int arr[], int aux[], int low, int high){
        //base condition
        if(high == low){
            return;
        }

        int mid = (low + ((high-low)>>1));

        mergeSort(arr, aux, low, mid);
        mergeSort(arr, aux, mid+1, high);
        merge(arr, aux, low, mid, high);//merge the two half

    }

    boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args []){
        int arr [] = {12, 3, 18, 24, 0, 5, -2};
        int aux [] = new int [arr.length];

        new MergeSort().mergeSort(arr, aux, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
