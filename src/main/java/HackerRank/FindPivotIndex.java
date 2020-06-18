package HackerRank;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        int newSum=0;
        int prevSum=sum;
        for(int i=0; i<nums.length; i++){
            newSum+=nums[i];
            sum-=nums[i];
            if(prevSum==newSum){
                return i;
            }
            prevSum=sum;
        }
        return -1;
    }

    public static void main(String [] args){
        //int arr[]= {1,7,3,6,5,6};
        int arr[]={1,2,3};
        System.out.println(new FindPivotIndex().pivotIndex(arr));
    }
}
