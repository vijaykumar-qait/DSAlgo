package CodingNinja.BacktrackingDynamicProgramming;

public class PlaceNQueens {


    public static boolean isSafe(int board[][], int row, int col){
        //check for column
        for(int i=0; i<row; i++){
            if(board[i][col]==1){
                return false;
            }
        }

        //check diagonal \
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(board[i][j]==1){
                return false;
            }
        }

        //check diagonal /
        for(int i=row, j=col; i>=0 && j<board.length; i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }

    public static void placeNQueens(int board[][], int row){
        int n = board.length;
        if(row==n){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
            return;
        }

        for(int i=0; i<n; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 1;
                placeNQueens(board, row+1);
                board[row][i] = 0;
            }
        }
    }

    public static void placeNQueens(int n){
        int board[][] = new int[n][n];
        placeNQueens(board, 0);
    }

    public static void main(String [] args){
        int n = 4;
        placeNQueens(n);
    }
}
