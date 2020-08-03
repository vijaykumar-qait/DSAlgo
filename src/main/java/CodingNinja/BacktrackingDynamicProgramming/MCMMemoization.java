package CodingNinja.BacktrackingDynamicProgramming;

public class MCMMemoization {
    /**
     * Code : MCM
     * Send Feedback
     * Given a chain of matrices A1, A2, A3,.....An, you have to figure out the most efficient way to multiply these matrices i.e. determine where to place parentheses to minimise the number of multiplications.
     * You will be given an array p[] of size n + 1. Dimension of matrix Ai is p[i - 1]*p[i]. You need to find minimum number of multiplications needed to multiply the chain.
     * Input Format :
     * Line 1 : Integer n i.e. number of matrices
     * Line 2 : n + 1 integers i.e. elements of array p[]
     * Output Format :
     * Line 1 : Minimum number of multiplication needed
     * Constraints :
     * 1 <= n <= 100
     * Sample Input 1 :
     * 3
     * 10 15 20 25
     * Sample Output :
     * 8000
     * Sample Output Explanation :
     * There are two ways to multiply the chain - A1*(A2*A3) or (A1*A2)*A3.
     * If multiply in order A1*(A2*A3) then number of multiplications required are 15000.
     * If multiply in order (A1*A2)*A3 then number of multiplications required are 8000.
     * Thus minimum number of multiplications required are 8000
     */

    public static int mcm(int[] p, int si, int ei, int [][] storage){
        if(si==ei || si==ei-1){
            storage[si][ei] = 0;
            return storage[si][ei];
        }

        if(storage[si][ei]!=-1){
            return storage[si][ei];
        }

        int min = Integer.MAX_VALUE;

        for(int k=si+1; k<ei; k++){
            int count = mcm(p, si, k, storage);
            count+=mcm(p, k, ei, storage);
            count+= p[si]*p[k]*p[ei];

            min = Math.min(min, count);
        }

        storage[si][ei] = min;
        return storage[si][ei];
    }

    public static int mcm(int[] p){
        int n = p.length;
        int storage[][] = new int[n+1][n+1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                storage[i][j] = -1;
            }
        }

        return mcm(p, 0, p.length-1, storage);
    }

    public static void main(String [] args){
        int p[] = {2,3,4,5};
        System.out.println(mcm(p));
    }
}
