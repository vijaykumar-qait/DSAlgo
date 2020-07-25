package CodingNinja.BacktrackingDynamicProgramming;

public class NumberOfBalanceBinaryTreeMemoization {

    /**
     * Code: Number of Balanced BTs
     * Send Feedback
     * Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the count of possible binary trees which are balanced.
     * This number can be huge, so return output modulus 10^9 + 7.
     * Write a simple recursive solution.
     * Input Format :
     * Integer h
     * Output Format :
     * Count % 10^9 + 7
     * Input Constraints :
     * 1 <= h <= 40
     * Sample Input 1:
     * 3
     * Sample Output 1:
     * 15
     * Sample Input 2:
     * 4
     * Sample Output 2:
     * 315
     */

    public static int balancedTreesOfHeightH(int height, int mod, int storage[]){
        if(height==0 || height==1){
            storage[height] = 1;
            return storage[height];
        }

        if(storage[height]!=0){
            return storage[height];
        }

        int x = balancedTreesOfHeightH(height-1, mod, storage);
        int y = balancedTreesOfHeightH(height-2, mod, storage);

        long res1 = (long)x*x;
        long res2 = (long)x*y*2;

        int val1 = (int)(res1%mod);
        int val2 = (int)(res2%mod);

        storage[height] = (val1+val2)%mod;
        return storage[height];
    }

    public static int balancedTreesOfHeightH(int height){
        // Write your code here
        int storage[] = new int[height+1];
        int mod = (int)Math.pow(10, 9)+7;
        return balancedTreesOfHeightH(height, mod, storage);
    }

    public static void main(String [] args){
        int height = 7;
        System.out.println(balancedTreesOfHeightH(height));
    }

}
