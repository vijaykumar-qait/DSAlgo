package HackerRank;

public class LeftRotation {

    static void leftRotate(int nums[], int k){
        int arr[] = new int[k];
        int i =0;
        for(; i<k; i++){
            arr[i] = nums[i];
        }

        for(int j = i; j<nums.length; j++){
            nums[j-i] = nums[j];
        }

        for(int l = nums.length-i; l<nums.length; l++){
            nums[l] = arr[l - (nums.length-i)];
        }
    }

    public static void main(String [] args){
        int a[] = {1,2,3,4,5};
        int n = a.length;
        int d = 6;

        if(d == n){

        }
        else if(d < n) {
            leftRotate(a, d);
        }
        else {

            leftRotate(a,d-n);
        }

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
