package CodingNinja;

public class SprialPrint {
    public static void main(String [] args){
        int matrix [][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        int row_min = 0;
        int row_max = matrix.length;
        int col_min = 0;
        int col_max = 0;
        if(row_max>0){
            col_max=matrix[0].length;
        }

        while(row_min<row_max && col_min<col_max){
            //first row
            for(int i=col_min; i<col_max; i++){
                System.out.print(matrix[row_min][i]+" ");
            }
            row_min++;

            //last column
            for(int i=row_min; i<row_max; i++){
                System.out.print(matrix[i][col_max-1]+" ");
            }
            col_max--;

            //last row
            if(row_min<row_max){
                for(int i=col_max-1; i>=col_min; i--){
                    System.out.print(matrix[row_max-1][i]+ " ");
                }
            }
            row_max--;

            //first column
            if(col_min<col_max){
                for(int i=row_max-1; i>=row_min; i--){
                    System.out.print(matrix[i][col_min]+ " ");
                }
            }
            col_min++;
        }

    }
}
