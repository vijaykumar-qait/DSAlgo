package CodingNinja;

import java.util.Scanner;

/***
 *  *
 *   * *
 *     * * *
 *       * * * *
 *     * * *
 *   * *
 *  *
 */
public class ArrowPattern {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();

        int n1 = (row+1)/2;
        int n2 = row/2;

        for(int i = 1; i<=n1; i++){
            for(int j=i-1; j>=1; j--){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<=n2; i++){
            for(int j=1; j<=n2-i; j++){
                System.out.print(" ");
            }

            for(int j=i; j<=n2; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
