package CodingNinja.BacktrackingDynamicProgramming;

public class SudokuSolver {
    /**
     * Sudoku Solver
     * Send Feedback
     * Given a 9*9 sudoku board, in which some entries are filled and others are 0 (0 indicates that the cell is empty), you need to find out whether the Sudoku puzzle can be solved or not i.e. return true or false.
     * Input Format :
     * 9 Lines where ith line contains ith row elements separated by space
     * Output Format :
     *  true or false
     * Sample Input :
     * 9 0 0 0 2 0 7 5 0
     * 6 0 0 0 5 0 0 4 0
     * 0 2 0 4 0 0 0 1 0
     * 2 0 8 0 0 0 0 0 0
     * 0 7 0 5 0 9 0 6 0
     * 0 0 0 0 0 0 4 0 1
     * 0 1 0 0 0 5 0 8 0
     * 0 9 0 0 7 0 0 0 4
     * 0 8 2 0 4 0 0 0 6
     * Sample Output :
     * true
     */

    static boolean canFill(int board[][], int row, int column, int num){
        for(int i=0; i<9; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        for(int i=0; i<9; i++){
            if(board[i][column] == num){
                return false;
            }
        }

        int base_row = row>=6 ? 6 : row>=3 ? 3 : 0;
        int base_col = column>=6 ? 6 : column>=3 ? 3 : 0;

        System.out.println("base_row: " + base_row);
        System.out.println("base_col: " + base_col);

        for(int i=base_row; i<base_row+3; i++){
            for(int j=base_col; j<base_col+3; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int board[][], int row, int col){

        if(row == board.length-1 && col == board.length-1){

            for(int i=0; i<board.length; i++){
                for(int j=0; j<board.length; j++){
                    System.out.print(board[i][j]+ " ");
                }
                System.out.println();
            }

            return true;
        }

        if(board[row][col] == 0){
            for(int i=1; i<=9; i++){
                if(canFill(board, row, col, i)){
                    board[row][col] = i;
                    if(col==8){
                        col=-1;
                        row=row+1;
                    }
                    if(sudokuSolver(board, row, col+1)){
                        return true;
                    }

                    if(col==-1){
                        col=8;
                        row=row-1;
                    }

                    board[row][col]=0;
                }
            }
            return false;
        }

        if(col==8){
            col=-1;
            row=row+1;
        }

        boolean smallAns = sudokuSolver(board, row, col+1);

        return smallAns;
    }

    public static boolean sudokuSolver(int board[][]){

        return sudokuSolver(board, 0, 0);
    }

    public static void main(String [] args){
        int arr[][] = { {9, 0, 0, 0, 2, 0, 7, 5, 0},
                {6, 0, 0, 0, 5, 0, 0, 4, 0},
                {0, 2, 0, 4, 0, 0, 0, 1, 0},
                {2, 0, 8, 0, 0, 0, 0, 0, 0},
                {0, 7, 0, 5, 0, 9, 0, 6, 0},
                {0, 0, 0, 0, 0, 0, 4, 0, 1},
                {0, 1 ,0 ,0 ,0 ,5 ,0 ,8,0},
                {0, 9, 0, 0, 7, 0, 0, 0, 4},
                {0, 8, 2, 0, 4, 0, 0, 0, 6} };

        System.out.println(sudokuSolver(arr));

    }
}
