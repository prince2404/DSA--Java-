import java.util.*;

public class twoDimeArray{

    public static void search(int matrix[][], int key){
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == key){
                    System.out.println(key + " is found at ( " + i + "," + j + " )");
                    return;
                }
            }
        }
        System.out.println(key + " is not found");

    }

    public static void findMax(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int maximum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                maximum = Math.max(maximum, matrix[i][j]);
            }
        }
        System.out.println("Maximum value = " + maximum);
    }

    public static void findMin(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                minimum = Math.min(minimum, matrix[i][j]);
            }
        }
        System.out.println("Minimum value = " + minimum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        int n = 3;
        int m = 3;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 8);
        findMax(matrix);
        findMin(matrix);
    }
}