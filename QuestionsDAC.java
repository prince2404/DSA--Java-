import java.util.*;

public class QuestionsDAC{

    public static void mergeSort(String arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr,si,mid,ei);
    }

    public static void merge(String arr[], int si, int mid, int ei){
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i].compareTo(arr[j]) <= 0){
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

        for(k = 0, i = si; k < temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static int majElemBetter(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static int majElemOptimal(int nums[]){
        int element = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                element = nums[i];
            }
            if(nums[i] == element){
                count++;
            }else{
                count--;
            }
        }
        
        count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == element){
                count++;
            }
        }
        if(count > nums.length/2){
            return element;
        }else{
            return -1;
        }
    }


    public static void main(String args[]){
        // String arr[] = {"sun", "earth", "mars", "mercury"};
        // mergeSort(arr, 0, arr.length-1);

        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        int nums[] = {2,2,3,3,1,2,2};
        // System.out.println(majElemBetter(nums));
        System.out.println(majElemOptimal(nums));
    }
}