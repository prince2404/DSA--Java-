import java.util.*;

public class RatMaze{

    public static void solveMaze(int maze[][], int row, int col, String ans, List<String> result){
        int n = maze.length;
        if(row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0 || maze[row][col] == -1){
            return;
        }

        if(row == n-1 && col == n-1){
            result.add(ans);
            return;
        }

        maze[row][col] = -1;

        solveMaze(maze, row+1, col, ans + "D", result);
        solveMaze(maze, row, col+1, ans + "R", result);
        solveMaze(maze, row, col-1, ans + "L", result);
        solveMaze(maze, row-1, col, ans + "U", result);

        maze[row][col] = 1;

    }

    public static List<String> mazeProblem(int maze[][]){
        List<String> result  = new ArrayList<>();
        String ans = "";
        // int n = maze.length;

        // boolean visited[][] = new boolean[n][n];
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         visited[i][j] = false;
        //     }
        //     System.out.println();
        // } 

        solveMaze(maze, 0, 0, ans, result);

        return result;

    }

    public static void main(String args[]){
        int maze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1}
        };

        List<String> result = mazeProblem(maze);
        for(String ans : result){
            System.out.println(ans);
        }
    }
}