package test;

import java.util.Scanner;

public class MaxAmountofWater {

    static int countMaxWater(int arr[]){
        if(arr.length < 1){
            return 0;
        }
        int tempArr[] = new int[arr.length];
        int sum = arr[0];
        tempArr[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<=arr[i-1]){
                sum+=arr[i];
                tempArr[i] = arr[i];
            }
            else {
                sum+=tempArr[i-1];
                tempArr[i] = tempArr[i-1];
            }
        }
        return sum;
    }


    static long countMaxWater2(int arr[]){
        if(arr.length < 1){
            return 0;
        }

        int n = arr.length;
        for(int i = 1; i < n; i++) {
            arr[i] = Math.min(arr[i], arr[i - 1]);
        }
        long sum = 0;

        for(int i = 0; i < n; i++)
            sum += arr[i];
        return sum;
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();

        for(int i=0; i<testcase; i++){
            int arrSize = scanner.nextInt();
            int arr[] = new int[arrSize];
            for(int j=0; j<arrSize; j++){
                arr[j] = scanner.nextInt();
            }
            System.out.println(countMaxWater2(arr));
        }
    }
}
