import java.util.*;

public class linearSearch {

    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int largestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int smallestNumber(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        // int numbers[] = {1,4,6,10,34,9,29,11};
        // int key = 9;

        // int index = linearSearch(numbers,key);

        // if(index == -1){
        //     System.out.println("Not found");
        // } else{
        //    System.out.println(key + " is found at index " + index);
        // }

        int numbers[] = {1,2,6,3,5};

        int largest = largestNumber(numbers);
        System.out.println("largest number is " + largest);

        int smallest = smallestNumber(numbers);
        System.out.println("smallest number is " + smallest);
    }
}