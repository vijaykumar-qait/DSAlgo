package CodingNinja.BacktrackingDynamicProgramming;

public class RatAndMaze {

    public static boolean ratInAMaze(int maze[][], int i, int j, int path[][]){
        if(i==maze.length-1 && j==maze.length-1){
            return true;
        }

        if(i<0 || j<0 || i>maze.length-1 || j>maze.length-1){
            return false;
        }

        if(maze[i][j] == 1){
            if(path[i][j] == 0){
                path[i][j] = 1;

                boolean result = ratInAMaze(maze, i-1, j, path);

                if(!result){
                    result = ratInAMaze(maze, i, j+1, path);
                }

                if(!result){
                    result = ratInAMaze(maze, i+1, j, path);
                }

                if(!result){
                    result = ratInAMaze(maze, i, j-1, path);
                }
                return result;
            }
        }
        return false;
    }

    //better coding


    public static boolean solveMaze(int maze[][], int i, int j, int path[][]){
        //check if i.j cell are valid or not
        if(i<0 || i>maze.length-1 || j<0 || j>maze.length-1 || maze[i][j] == 0 || path[i][j] == 1){
            return false;
        }

        //include cell in current path
        path[i][j] = 1;

        //destination cell
        if(i==maze.length-1 && j==maze.length-1){
            return true;
        }

        //explore further in all direction
        //top
        if(solveMaze(maze, i-1, j, path)){
            return true;
        }
        //right
        if(solveMaze(maze, i, j+1, path)){
            return true;
        }
        //down
        if(solveMaze(maze, i+1, j, path)){
            return true;
        }
        //left
        if(solveMaze(maze, i, j-1, path)){
            return true;
        }
        return false;
    }

    public static boolean ratInAMaze(int maze[][]){
        int path[][] = new int [maze.length][maze.length];
        return ratInAMaze(maze, 0, 0, path);
    }

    public static void main(String [] args){
        //int arr [][] = {{1,0,1}, {1,0,1}, {1,1,1}};

        int arr [][] = {{1,0,1}, {1,0,1}, {0,1,1}};

        System.out.println(ratInAMaze(arr));
    }
}
