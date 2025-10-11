import java.util.*;

public class KnightTour {
	
	public static void knightPlacement(char grid[][], int row, int col, int knight){
		int n = grid.length;
		if(knight == 0){
			printGrid(grid);
			return;
		}

        if(row == n-1 && col == n){
            return;
        }

        if(col == n){
            knightPlacement(grid, row+1, 0, knight);
            return;

        }
		
		if(isSafe(grid, row, col)){
			grid[row][col] = 'k';
			knightPlacement(grid, row, col+1, knight-1);
			grid[row][col] = '*';
		}
        knightPlacement(grid, row, col+1, knight);
						
	}
	
	public static boolean isSafe(char grid[][], int row, int col){
		int n = grid.length;
		int i, j;
		
		//2 up 1 right
		i = row-2;
		j = col+1;
		if(i >= 0 && j < n && grid[i][j] == 'k'){
			return false;
		}
		
		//2 up 1 left
		i = row-2;
		j = col-1;
		if(i >= 0 && j >= 0 && grid[i][j] == 'k'){
			return false;
		}
		
		//2 Down 1 right
		i = row+2;
		j = col+1;
		if(i < n && j < n && grid[i][j] == 'k'){
			return false;	
		}
		
		//2 Down 1 left
		i = row+2;
		j = col-1;
		if(i < n && j >= 0 && grid[i][j] == 'k'){
			return false;
		}
		
		//2 right 1 up
		i = row-1;
		j = col+2;
		if(i >= 0 && j < n && grid[i][j] == 'k'){
			return false;	
		}
		
		//2 right 1 down
		i = row+1;
		j = col+2;
		if(i < n && j < n && grid[i][j] == 'k'){
			return false;
		}
		
		//2 left 1 up
		i = row-1;
		j = col-2;
		if(i >= 0 && j >= 0 && grid[i][j] == 'k'){
			return false;
		}
		
		//2 left 1 down
		i = row+1;
		j = col-2;
		if(i < n && j >= 0 && grid[i][j] == 'k'){
			return false;	
		}
		
		return true;
	}
	
	public static void printGrid(char grid[][]){
		int n = grid.length;
        System.out.println("----chessBoard----");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}	
	}		
		
		
	public static void main(String[] args) {
		int n = 3;
		char grid[][] = new char[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				grid[i][j] = '*';
			}
		}
		
		knightPlacement(grid, 0, 0, 5);	
					
		
	}
}