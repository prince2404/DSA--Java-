import java.util.*;
public class sorting{
    public static void bubbleSort(int arr[]){
        boolean isSorted = false;
        for(int i = 0; i < arr.length-1; i++){
            isSorted = true;
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                return;
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] < key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }


    public static void main(String args[]){
        int arr[] = {7,11,9,2,17,4};
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}