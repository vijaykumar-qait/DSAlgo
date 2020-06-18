package CodingNinja;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RowWiseSum {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int matrix [][]= new int [m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            int sum=0;
            for(int j=0; j<n; j++){
                sum+=matrix[i][j];
            }
            System.out.print(sum + " ");
        }
    }
}
