package HackerRank;

public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length-1 && count<=1;i++){
            if(nums[i]>nums[i+1]){
                if(i>0){
                    if(nums[i-1]<=nums[i+1]){
                        nums[i]=nums[i-1];
                    }
                    else {
                        nums[i+1]=nums[i];
                    }
                }
                count++;
            }

        }
        return count<=1;
    }

    public static void main(String [] args){
        //int arr[]= {4,2,3};
        //int arr[]= {4,2,1};
        //int arr[]= {1,1,1,1,1,2,1,1};
        //int arr[]= {-1,4,2,3};
        int arr[]= {3,4,2,3};
        System.out.println((new NonDecreasingArray().checkPossibility(arr)));

    }
}
