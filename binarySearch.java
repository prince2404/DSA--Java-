import java.util.*;

public class binarySearch{

    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length - 1;

        while(first < last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int numbers[]){
        int totalPairs = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")" + " ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + totalPairs);
    }

    public static void printSubArrays(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int ts = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                ts++;
                System.out.println();
                System.out.println("Sum = " + sum);

                
                if(sum > maxSum){
                    maxSum = sum;
                } 
                if(sum < minSum){
                    minSum = sum;
                }

            }
            System.out.println();
        }

        System.out.println("Total subArrays = " + ts);
        System.out.println("maximum sum = " + maxSum);
        System.out.println("minimum sum = " + minSum);
    }

    public static void maxSubArrays(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("maximum sum = " + maxSum);

    }

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < numbers.length; i++){
            cs = cs + numbers[i];
            ms = Math.max(cs,ms);
            if(cs < 0){
                cs = 0;
            }

           
        }
        System.out.println("max. sum = " + ms);
    }    



    public static void main(String args[]){
        // int numbers[] = {2,4,6,8,10};
        // int key = 10;

        // int index = binarySearch(numbers,key);
        // if(index == -1){
        //     System.out.println("Not found");

        // }else{
        //     System.out.println(key + " is found at index " + index);
        // }

        // reverse(numbers);
        // for(int i = 0; i < numbers.length; i++){
        //     System.out.print(numbers[i] + " ");
        // }
        // System.out.println();

        // printPairs(numbers);

        // printSubArrays(numbers);
        // maxSubArrays(numbers);

        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        // int numbers[] = {-3,-2,-1,-4,-5};
        kadanes(numbers);

    }
}