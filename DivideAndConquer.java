import java.util.*;

public class DivideAndConquer{

    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                k++;

            }
        }

        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= ei){
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(k=0,i=si; k < temp.length; k++,i++){
            arr[i] = temp[k];
        }

    }

    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex-1);
        quickSort(arr, pivotIndex + 1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;
        return i;
    }

    public static int RotatedBinarySearch(int arr[], int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target < arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid] < target && target <= arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
        // int arr[] = {6,3,9,5,2,8};
        // mergeSort(arr, 0, arr.length-1);

        // quickSort(arr, 0, arr.length-1);

        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int index = RotatedBinarySearch(arr, target);
        if(index == -1){
            System.out.println(target + " is not found");
        }else{
            System.out.println(target + " is found at index " + index);
        }
    }
}