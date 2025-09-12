import java.util.*;

public class spiral{
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for(int j = endCol - 1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //left
            for(int i = endRow - 1; i >= startRow + 1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static void diagonalSum(int matrix[][]){
        // int n = matrix.length;
        // int m = matrix[0].length;
        // int sum = 0;

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i + j == n-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        int n = matrix.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += matrix[i][i];

            if(i != n-1-i){
                sum += matrix[i][n-1-i];
            }
        }

        System.out.println("Diagonal sum = " + sum);
    }

    public static void staircaseSearch(int matrix[][], int key){
        int i = 0;
        int j = matrix[0].length-1;

        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == key){
                System.out.println(key + " is found at (" + i + ',' + j + ")");
                return;
            }
            else if(key < matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(key + " is not found");
    }

    public static int keyCount(int matrix[][], int key){
        int n = matrix.length;
        int m = matrix[0].length;
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(key == matrix[i][j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void sumofSecondRow(int matrix[][]){
        int m = matrix[0].length;
        int sum = 0;

        for(int j = 0; j < m; j++){
            sum += matrix[1][j];
        }
        System.out.println("Sum = " + sum);
    }

    public static void transposeOfMatrix(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int transpose[][] = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                transpose[i][j] = matrix[j][i];
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }


       
    }

    public static void main(String args[]){
        int matrix[][] = {
            {1,4,9},
            {11,4,3}
        };

        transposeOfMatrix(matrix);

        // sumofSecondRow(matrix);

        // int key = 7;
        // int count = keyCount(matrix, key);
        // System.out.println(count);

        // int key = 33;
        // staircaseSearch(matrix,key);

        // diagonalSum(matrix);

        // spiralMatrix(matrix);

    }
}