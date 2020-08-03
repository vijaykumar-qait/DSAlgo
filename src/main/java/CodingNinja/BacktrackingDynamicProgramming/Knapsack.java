package CodingNinja.BacktrackingDynamicProgramming;

public class Knapsack {
    /**
     * 0 1 Knapsack
     * Send Feedback
     * A thief robbing a store and can carry a maximal weight of W into his knapsack. There are N items and ith item weigh wi and is of value vi. What is the maximum value V, that thief can take ?
     * Space complexity should be O(W).
     * Input Format :
     * Line 1 : N i.e. number of items
     * Line 2 : N Integers i.e. weights of items separated by space
     * Line 3 : N Integers i.e. values of items separated by space
     * Line 4 : Integer W i.e. maximum weight thief can carry
     * Output Format :
     * Line 1 : Maximum value V
     * Constraints
     * 1 <= N <= 10^4
     * 1<= wi <= 100
     * 1 <= vi <= 100
     * Sample Input 1 :
     * 4
     * 1 2 4 5
     * 5 4 8 6
     * 5
     * Sample Output :
     * 13
     */

    private static int knapsack(int[] weight,int value[],int maxWeight, int i, int [][] storage){
        if(maxWeight <= 0 || i==weight.length){
            return 0;
        }

        if(storage[maxWeight][i] != -1){
            return storage[maxWeight][i];
        }

        int maxValue = Integer.MIN_VALUE;

        if(weight[i]<=maxWeight){
            maxValue = Math.max(value[i] + knapsack(weight,value, maxWeight-weight[i], i+1, storage),
                    knapsack(weight, value, maxWeight, i+1, storage));
        }
        else if(weight[i]>maxWeight){
            maxValue = knapsack(weight, value, maxWeight, i+1, storage);
        }

        storage[maxWeight][i] = maxValue;

        return storage[maxWeight][i];
    }

    public static int knapsack(int[] weight,int value[],int maxWeight){
        int m = maxWeight;
        int n = weight.length;

        int storage[][] = new int[m+1][n+1];

        for(int i=0; i<=m;i ++){
            for(int j=0; j<=n; j++){
                storage[i][j] = -1;
            }
        }

        return knapsack(weight, value, maxWeight, 0, storage);
    }

    public static void main(String [] args){
        int weight [] = {1, 2, 4, 5};
        int value[] = {5, 4, 8, 6};
        int maxWeight = 5;

        System.out.println(knapsack(weight, value, maxWeight));
    }
}
