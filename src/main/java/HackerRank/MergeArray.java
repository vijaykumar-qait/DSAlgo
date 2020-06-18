package HackerRank;

import java.util.Arrays;

public class MergeArray {

    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length-1;

        while(m>0 && n>0){
            if(nums1[m-1]>nums2[n-1] || nums1[m-1]==nums2[n-1]){
                nums1[index--] = nums1[--m];
            }
            else if(nums1[m-1]<nums2[n-1]){
                nums1[index--] = nums2[--n];
            }
        }

        if(m<=0){
            int i=0;
            while(n>0){
                nums1[i]=nums2[i];
                n--;
                i++;
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String [] args){
        int nums1[]={0};
        int nums2[]={1};
        merge(nums1, 0, nums2, 1);

    }
}
