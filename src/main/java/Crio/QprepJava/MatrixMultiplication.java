package Crio.QprepJava;

import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] matrixMultiplication(int n1, int m1, int[][] grid1, int n2, int m2, int[][] grid2) {
        if(m1 != n2){
            int grid3 [][] = new int [0][0];
            return grid3;
        }

        int grid3 [][] = new int[n1][m2];

        for(int i=0; i<n1; i++){
            for(int j=0; j<m2; j++){
                for(int k=0; k<m1; k++){
                    grid3[i][j] += grid1[i][k]*grid2[k][j];
                }
            }
        }

        return grid3;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1, m1;
        n1 = sc.nextInt();
        m1 = sc.nextInt();
        int[][] grid1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                grid1[i][j] = sc.nextInt();
            }
        }

        int n2, m2;
        n2 = sc.nextInt();
        m2 = sc.nextInt();
        int[][] grid2 = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                grid2[i][j] = sc.nextInt();
            }
        }

        int[][] ans = matrixMultiplication(n1, m1, grid1, n2, m2, grid2);

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
