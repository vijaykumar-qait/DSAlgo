package HackerRank;


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int start_row = 0, end_row = matrix.length, start_column = 0, end_column=0;
        if(matrix.length!=0){
            end_column = matrix[0].length;
        };

        while(start_row<end_row && start_column<end_column){
            //reading first row
            for(int i = start_column; i<end_column; i++){
                list.add(matrix[start_row][i]);
            }
            start_row++;

            //reading last column
            for(int i=start_row; i<end_row; i++){
                list.add(matrix[i][end_column-1]);
            }
            end_column--;

            //reading first row
            if(start_row<end_row){
                for(int i=end_column-1; i>=start_column; i--){
                    list.add(matrix[end_row-1][i]);
                }
                end_row--;
            }

            //reading first column
            if(start_column<end_column){
                for(int i=end_row-1; i>=start_row; i--){
                    list.add(matrix[i][start_column]);
                }
                start_column++;
            }

        }
        return list;
    }

    public static void main(String [] args){
        //int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int matrix[][] = {{1, 2, 3,4}, {5, 6,7,8}, {9,10,11,12}};
        //int matrix[][] = {{1, 2, 3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}};
        //int matrix [][] = {};
        //int matrix [] [] = {{2,5,8}, {4,0,-1}};
        System.out.println(new SpiralMatrix().spiralOrder(matrix).toString());
    }
}
