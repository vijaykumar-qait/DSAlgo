package CodingNinja;

import java.util.Scanner;

/**
 * 1        1
 * 12      21
 * 123    321
 * 1234  4321
 * 1234554321
 */
public class NumberPatternTwo {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for(int i=1; i<=times; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=(2*times)-(2*i); j>0; j--){
                System.out.print(" ");
            }
            int print = i;
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
