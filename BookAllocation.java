import java.util.*;

public class BookAllocation {
    public static int allocateBooks(int arr[], int m){
        if(m > arr.length) return -1;
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
            int students = countStudents(arr, mid);
            if(students > m){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }

    public static int countStudents(int arr[], int pages){
        int students = 1;
        long pagesStudent = 0;
        for(int x : arr){
            if(pagesStudent + x <= pages){
                pagesStudent += x;
            }else{
                students++;
                pagesStudent = x;
            }

        }
        return students;
    }
    public static void main(String args[]){
        int arr[] = {25,46,28,49,24};
        int students = 4;
        System.out.println(allocateBooks(arr, students));
    }
    
}
