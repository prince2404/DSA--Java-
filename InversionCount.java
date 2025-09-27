import java.util.*;

public class InversionCount{

    public static int mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return 0;
        }
        int mid = si + (ei - si)/2;
        int leftInvCount = mergeSort(arr, si, mid);
        int rightInvCount = mergeSort(arr, mid+1, ei);

        int invCount = merge(arr, si, mid, ei);

        return leftInvCount + rightInvCount + invCount;
    }

    public static int merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        int invCount = 0;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                invCount += (mid-i+1);
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

        return invCount;

    }

    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        System.out.println(mergeSort(arr, 0, arr.length-1));
    }    

}    