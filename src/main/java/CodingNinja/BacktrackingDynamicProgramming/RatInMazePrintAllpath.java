package CodingNinja.BacktrackingDynamicProgramming;

public class RatInMazePrintAllpath {

    public static void solveMaze(int maze[][], int i, int j, int path[][]){
        int n = maze.length-1;
        if(i<0 || i>n || j<0 || j>n || maze[i][j]==0 || path[i][j]==1){
            return;
        }
        path[i][j] = 1;

        if(i==n && j==n){
            for(int row=0; row<=n; row++){
                for(int col=0; col<=n; col++){
                    System.out.print(path[row][col] + " ");
                }
            }
            System.out.println();
            path[i][j]=0;
            return;
        }

        solveMaze(maze, i-1, j, path);
        solveMaze(maze, i, j+1, path);
        solveMaze(maze, i+1, j, path);
        solveMaze(maze, i, j-1, path);
        path[i][j]=0;
    }

    public static void ratInAMaze(int maze[][]){
        int path[][] = new int[maze.length][maze.length];
        solveMaze(maze, 0, 0, path);
    }

    public static void main(String [] args){
        int arr[][]= {{1 ,0 ,1}, {1 ,1 ,1}, {1, 1, 1} };
        ratInAMaze(arr);
    }
}
