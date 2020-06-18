package HackerRank;

import java.util.Arrays;

public class QuickSort {
    int parition(int arr[], int i, int j){
        int pivot = i;
        while (i<j){
            do{
                i++;
            }while (arr[i]<=arr[pivot]);

            do{
                j--;
            }while (arr[j]>arr[pivot]);

            if(i<j) {
                arr[i] = arr[i]+arr[j];
                arr[j] = arr[i]-arr[j];
                arr[i] = arr[i]-arr[j];
            }
        }
        int temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;

        return j;
    }

    void QuickSort(int arr[], int i, int j){
        if (i<j){
            int pivot = parition(arr,i,j);
            QuickSort(arr, i, pivot);
            QuickSort(arr, pivot+1, j);
        }
    }

    public static void main(String [] args){
        int arr[] = {5,6,4,7,3,8,2,9,1};
        QuickSort obj = new QuickSort();
        obj .QuickSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
