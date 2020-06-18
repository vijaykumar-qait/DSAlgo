package HackerRank;

import java.util.Arrays;

public class Replace {

    static int removeElement(int[] nums, int val) {
        int length=0;
        int i = 0;
        while(i<nums.length-length){
            if(nums[i]==val){
                shift(nums,i);
                length++;
            }
            else {
                i++;
            }
        }

        return nums.length-length;
    }

    static void shift(int nums[], int index){
        for(int i=index; i<nums.length-1; i++){
            nums[i] = nums[i+1];
        }
    }

    public static void main(String [] args){
        int nums[]={0,1,2,2,3,0,4,2};
        int val = 2;

        int len = removeElement(nums,val);
        System.out.println("len: " +  len + "  " + Arrays.toString(nums));
    }
}
