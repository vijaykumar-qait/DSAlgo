package CodingNinja;

import java.util.Scanner;

/**
 *     1
 *    23
 *   345
 *  4567
 */
public class NumberPattern {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=i+1; j<=n; j++){
                System.out.print(" ");
            }
            int print=i;
            for(int j=1; j<=i; j++){
                System.out.print(print++);
            }
            System.out.println();
        }
    }
}
