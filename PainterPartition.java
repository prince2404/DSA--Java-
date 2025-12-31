import java.util.*;

public class PainterPartition {

    public static int painterPartitionProblem(int arr[], int k){
        if(k > arr.length){
            return -1;
        }
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        for(int x : arr){
            maximum = Math.max(maximum, x);
            sum += x;
        }

        int low = maximum;
        int high = sum;
        while(low <= high){
            int mid = low + (high-low)/2;
            int painters = countPainters(arr, mid);
            if(painters > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
       

    }

    public static int countPainters(int arr[], int area){
        int count = 1;
        int totalArea = 0;
        for(int x : arr){
            if(totalArea + x <= area){
                totalArea += x;
            }else{
                count++;
                totalArea = x;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40};
        int k = 2;

        System.out.println(painterPartitionProblem(arr, k));
    }
    
}
