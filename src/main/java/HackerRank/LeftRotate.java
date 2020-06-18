package HackerRank;

import java.util.Arrays;

public class LeftRotate {
    public void rotate(int[] nums, int k) {
        if(k<nums.length){
            rotateLeft(nums,k);
        }
        else if(k>nums.length){
            rotateLeft(nums, k%nums.length);
        }
    }

    public void rotateLeft(int nums[] , int k){
        int arr[] = new int [nums.length-k];
        for(int i=0; i<nums.length-k; i++){
            arr[i]=nums[i];
        }
        for(int i=nums.length-k; i<nums.length;i++){
            nums[i-(nums.length-k)]=nums[i];
        }
        for(int i=k; i<nums.length;i++){
            nums[i]=arr[i-k];
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String args[]){
        //int arr[] ={1,2,3,4,5,6,7};
        int arr [] = {-1, -100, 3, 99};
        new LeftRotate().rotate(arr,7);
    }
}
