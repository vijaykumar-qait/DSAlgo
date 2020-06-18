package Leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    void merge(int arr[], int aux[], int low, int mid, int high){
        int k=low, i=low, j=mid+1;

        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                aux[k++] = arr[i++];
            }
            else {
                aux[k++] = arr[j++];
            }
        }

        while(i<=mid){
            aux[k++]=arr[i++];
        }

        while(j<=high){
            aux[k++] = arr[j++];
        }

        for(int l=low; l<=high; l++){
            arr[l] = aux[l];
        }
    }

    void mergeSort(int arr[], int aux[], int low, int high){
        if(high <= low){
            return;
        }

        int mid = (low + ((high-low) >> 1));

        mergeSort(arr, aux, low, mid);
        mergeSort(arr, aux, mid+1, high);
        merge(arr, aux, low, mid, high);
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int aux[] = new int[nums.length];
        mergeSort(nums, aux, 0, nums.length-1);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                if(!(list.contains(nums[i]))){
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }

    public static void main(String args[]){
        //int arr [] = {12, 3, 18, 24, 0, 5, -2};
        int arr[] ={4,3,2,7,8,2,3,1};
        //int arr[] = {};
        System.out.print(new FindAllDuplicatesInAnArray().findDuplicates(arr).toString());
    }
}
