package CodingNinja.BacktrackingDynamicProgramming;

public class LootHousesRecursion {
    /**
     * Loot Houses
     * Send Feedback
     * A thief wants to loot houses. He knows the amount of money in each house. He cannot loot two consecutive houses. Find the maximum amount of money he can loot.
     * Input Format
     * Line 1 : An integer N
     * Line 2 : N spaced integers denoting money in each house
     * Output Format
     *  Line 1 : Maximum amount of money looted
     * Input Constraints
     * 1 <= n <= 10^4
     * 1 <= A[i] < 10^4
     * Sample Input :
     * 6
     * 5 5 10 100 10 5
     * Sample Output 1 :
     * 110
     */

    public static int getMaxMoney(int arr[], int n, int i){
        if(i>=n){
            return 0;
        }
        int smallAns = arr[i] + getMaxMoney(arr, n, i+2);
        smallAns = Math.max(smallAns, getMaxMoney(arr, n, i+1));
        return smallAns;
    }

    public static int getMaxMoney(int arr[], int n){
        return getMaxMoney(arr, n, 0);
    }

    public static void main(String [] args){
        int arr[] = {5,5,10,100,10,5};
        int n = arr.length;
        System.out.println(getMaxMoney(arr, n));
    }

}
