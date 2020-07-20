package CodingNinja;

import CodingNinja.BacktrackingDynamicProgramming.MaxSumSubArray;
import org.junit.Assert;
import org.junit.Test;

public class TestMaxSumSubArray {
    @Test
    public void testArr_123(){
        int arr[] = {1,2,3};
        Assert.assertEquals("Failed for arr 1,2,3", 6,MaxSumSubArray.findSum(arr, arr.length));
    }

    @Test
    public void testArr_ForNegativeValue(){
        int arr[] = {-1, -2, -3, -4};
        Assert.assertEquals("Failed for arr -1,-2,-3, -4", -1,MaxSumSubArray.findSum(arr, arr.length));
    }

    @Test
    public void testArr_ForPositiveNegativeValue(){
        int arr[] = {1,2,5,-3,6,9,-5};
        Assert.assertEquals("Failed for arr 1,2,5,-3,6,9,-5", 20,MaxSumSubArray.findSum(arr, arr.length));
    }
}
