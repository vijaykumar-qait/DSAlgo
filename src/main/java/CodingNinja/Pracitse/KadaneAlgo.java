package CodingNinja.Pracitse;

public class KadaneAlgo {

    static int maxSubArray(int [] arr){
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingNow = 0;

        for(int i=0; i<arr.length; i++){
            maxEndingNow += arr[i];
            maxEndingNow = Math.max(maxEndingNow, arr[i]);
            maxSoFar = Math.max(maxEndingNow, maxSoFar);
        }

        return maxSoFar;
    }

    public static void main(String [] args){
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr));
    }
}
