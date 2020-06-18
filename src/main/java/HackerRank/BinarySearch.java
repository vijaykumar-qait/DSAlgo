package HackerRank;

public class BinarySearch {

    static public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int mid = 0;
        while(i<=j){
            mid = i+(j-i)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else {
                j=mid-1;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        //int arr[] = {-1,0,3,5,9,12};
        int arr[] = {1,3,5,6};

        System.out.println(search(arr, 0));

    }
}
