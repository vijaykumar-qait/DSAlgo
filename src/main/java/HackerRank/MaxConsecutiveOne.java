package HackerRank;



public class MaxConsecutiveOne {
    static int maxNumber(int arr[]){
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int nums[] = {1,1,0,1,1,1};

        int maxCount[] = new int [nums.length];

        int index=0, count=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }
            else if(nums[i]==0){
                if(count!=0){
                    maxCount[index++] = count;
                    count=0;
                }
            }
        }
        maxCount[index++] = count;
        System.out.println("max: "+ maxNumber(maxCount));
        System.out.println("max: " + secoundAppraoch(nums));

    }

    static int secoundAppraoch(int arr[]){
        int count = 0, result = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count=0;
            }
            else {
                count++;
                result = Math.max(count, result);
            }
        }
        return  result;
    }
}
