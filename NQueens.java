import java.util.*;

public class NQueens{

    static int count = 0;

    public static boolean nQueens(char board[][], int i){
        if(i == board.length){
            // printBoard(board);
            // count++;
            return true;
        }

        for(int j = 0; j < board.length; j++){
            if(isSafe(board, i, j)){
                board[i][j] = 'Q';
                if(nQueens(board, i+1)){
                    return true;
                }
                board[i][j] = '.';
            }
        }
        return false;

    }

    public static void printBoard(char board[][]){
        System.out.println("--------ChessBoard---------");

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col){
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
            System.out.println();
        }

        if(nQueens(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }

        // System.out.println("Total ways = " + count);

    }
}