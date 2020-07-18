package CodingNinja.BacktrackingDynamicProgramming;

public class RatInMazePrintPath {

    public static boolean solveMaze(int maze[][], int i, int j, int path[][]){
        int n = maze.length-1;
        if(i<0 || i>n || j<0 || j>n || maze[i][j]==0 || path[i][j]==1){
            return false;
        }

        path[i][j] = 1;

        if(i==n && j==n){
            for(int row=0; row<=n; row++){
                for(int col=0; col<=n; col++){
                    System.out.print(path[row][col] + " ");
                }
            }
            return true;
        }

        if(solveMaze(maze, i-1, j, path)){
            return true;
        }
        if(solveMaze(maze, i, j+1, path)){
            return true;
        }
        if(solveMaze(maze, i+1, j, path)){
            return true;
        }
        if(solveMaze(maze, i, j-1, path)){
            return true;
        }
        return false;
    }

    public static void ratInAMaze(int maze[][]){
        int path [][] = new int [maze.length][maze.length];
        solveMaze(maze, 0,0, path);
    }

    public static void main(String [] args){
        int arr[][]= {{1 ,0 ,0}, {1 ,0 ,0}, {1, 1, 1} };
        ratInAMaze(arr);
    }
}
