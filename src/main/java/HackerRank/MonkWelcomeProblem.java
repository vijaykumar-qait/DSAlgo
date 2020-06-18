package HackerRank;

import java.util.Scanner;

public class MonkWelcomeProblem {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int MAT1[]= new int [N];
        int MAT2[] = new int[N];

        for(int i=0; i<N; i++) {
            MAT1[i] = scan.nextInt();
        }

        for(int i=0; i<N; i++) {
            MAT2[i] = scan.nextInt();
        }

        for(int i=0 ;i<N; i++) {
            System.out.print(MAT1[i] + MAT2[i]+" ");
        }
    }
}
