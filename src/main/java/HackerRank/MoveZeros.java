package HackerRank;

import java.util.Arrays;

public class MoveZeros {
    static public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0 && nums[index]!=0){
                index=i;
            }
            else if(nums[index]==0 && nums[i]!=0){
                nums[index]= nums[i];
                nums[i]=0;
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String [] args){
        int arr[] = {0,1,0,3,12};
        //int arr[] = {1,0,1};
        //int arr[] = {1,2,0,4,5};
        moveZeroes(arr);
    }
}
