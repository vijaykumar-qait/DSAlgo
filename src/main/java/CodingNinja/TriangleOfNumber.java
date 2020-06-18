package CodingNinja;

import java.util.Scanner;

/**
 *      1
 *     232
 *    34543
 *   4567654
 *  567898765
 */
public class TriangleOfNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=i+1; j<=num; j++){
                System.out.print(" ");
            }
            int print=i;
            for(int j=1; j<=i; j++){
                System.out.print(print++);
            }
            print--;
            for(int j=i; j>=2; j--){
                System.out.print(--print);
            }
            System.out.println();
        }
    }
}
