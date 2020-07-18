package GFG.Recursion;

import java.util.Scanner;

public class NumberOfpath {

    static int minPath(int row, int col, int maxRow, int maxCol, int path){
        if(row>maxRow || col>maxCol){
            return path;
        }

        if(row==maxRow && col == maxCol){
            path = path+1;
            return path;
        }

        path = minPath(row, col+1, maxRow, maxCol, path);
        path = minPath(row+1, col, maxRow, maxCol, path);
        return path;
    }

    static int minPath(int row, int column){
        return minPath(0,0, row-1, column-1, 0);
    }

    public static void main(String [] args){
        int row = 2;
        int col = 8;
        System.out.println(minPath(row, col));
        submit();

    }

    public static void submit(){
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for(int i=0; i<testcases; i++){
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            System.out.println(minPath(row,col));
        }
    }
}
