package GFG.Array;

public class ThirdLargestNumber {

    static int thirdLargest(int a[], int n)
    {
        if(n<3){
            return -1;
        }

        int max = a[0], seconeMax = -1, thirdMax = -1;
        for(int i=1; i<n; i++){
            if(a[i]>max){
                thirdMax = seconeMax;
                seconeMax = max;
                max = a[i];
            }
            else if(a[i]>seconeMax){
                thirdMax = seconeMax;
                seconeMax = a[i];
            }
            else if(a[i]>thirdMax){
                thirdMax=a[i];
            }
        }
        return thirdMax;
    }

    public static void main(String [] args){
        int arr[] = {5,4,3,2,1};
        System.out.println(thirdLargest(arr, arr.length));
    }
}
