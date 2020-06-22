package CodingNinja;

import java.util.Arrays;

public class MaximunProfit {

    public static int maximumProfit(int budget[]) {
        // Write your code here
        int maxProfit = 0;
//        for(int i=0;i<budget.length; i++){
//            int initialcost = budget[i];
//            int sum = 0;
//            for(int j=0; j<budget.length; j++){
//                if(initialcost<=budget[j]){
//                    sum+=initialcost;
//                }
//            }
//            if(sum>maxProfit){
//                maxProfit = sum;
//            }
//        }

        Arrays.sort(budget);
        int n = budget.length;
        for(int i=0 ; i<budget.length; i++){
            int profit = budget[i]*(n-i);
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String [] args){
        //int arr [] = {30, 20, 53, 14};
        int arr[] = {34, 78, 90, 15, 67};
        System.out.println(maximumProfit(arr));
    }
}
