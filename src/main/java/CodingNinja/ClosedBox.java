package CodingNinja;

import java.util.Scanner;

public class ClosedBox {
    /**
     * Pattern: Closed Box
     * Send Feedback
     * Print the given pattern for the given number of rows.
     * Pattern for N=4
     * ####
     * *      *
     * *      *
     * ####
     * Input format:
     * N (Total number of rows).
     * Constraints:
     * N lies between [3,40]
     * Output format:
     * Pattern in N lines
     * Sample Input 1:
     * 5
     * Sample Output 1:
     * #####
     * *        *
     * *        *
     * *        *
     * #####
     * @param n
     */

    static void printClosedBox(int n){
        for(int i=0; i<n; i++){
            System.out.print("#");
        }
        System.out.println();
        for(int i=1; i<n-1; i++){
            System.out.print("*");
            for(int j=1; j<n-1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=0; i<n; i++){
            System.out.print("#");
        }
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printClosedBox(n);
    }
}
