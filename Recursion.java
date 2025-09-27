import java.util.*;

public class Recursion{
    public static void printDec(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    public static int fibo(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }

    // public static boolean isSorted(int arr[]){
    //     for(int i = 0; i < arr.length-1; i++){
    //         if(arr[i] > arr[i+1]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);
    }

    public static int findFirst(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return findFirst(arr,key,i+1);
    }

    public static int findLast(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = findLast(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    // public static int power(int a, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     return a * power(a,n-1);
    // }

    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = power(a,n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return tilingProblem(n-1) + tilingProblem(n-2);
    }

    public static void removeDuplicates(String str, StringBuilder sb, boolean map[], int i){
        if(i == str.length()){
            System.out.println(sb);
            return;
        }
        char currChar = str.charAt(i);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str,sb,map,i+1);
        }else{
            map[currChar-'a'] = true;
            sb.append(currChar);
            removeDuplicates(str,sb,map,i+1);
        }
        
    }

    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void printBinStrings(int n, String str, int lastPlace){
        if(n == 0){
            System.out.println(str);
            return;
        }
        
        if(lastPlace == 1){
            printBinStrings(n-1, str+"0", 0);
            printBinStrings(n-1, str+"1", 1);
        } else{
            printBinStrings(n-1, str+"1", 1);
        }
        
        
    }

    public static void printOccurrences(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        printOccurrences(arr,key,i+1);
    }

    public static void numTOString(int n){
        String words[] = {"zero", "one", "two", "three", "four","five","six","seven","eight","nine"};

        if(n == 0){
            return;
        }
        numTOString(n/10);
        int digit = n % 10;
        System.out.print(words[digit] + " ");
    }

    public static int lengthOfString(String str){
        if(str.equals("")){
            return 0;
        }
        return 1 + lengthOfString(str.substring(1));
    }

    // public static int countContiguousSubstring(String str){
    //     int n = str.length();
    //     int count = 0;

    //     for(int i = 0; i < n; i++){
    //         for(int j = i; j < n; j++){
    //             if(str.charAt(i) == str.charAt(j)){
    //                 count++;
    //             }

    //         }
    //     }
    //     return count;
    // }

    public static int countContiguousSubstring(String str){
        HashMap<Character,Integer> freq = new HashMap<>();

        for(char ch : str.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0) + 1);
        }

        int count = 0;
        for(int f : freq.values()){
            count += f * (f + 1) / 2;
        }
        return count;
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("move disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("move disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);

    }

    public static void twoSum(int nums[], int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                System.out.println(map.get(complement) + "," + i);
                return;
            }
            map.put(nums[i],i);
        }
        System.out.println("No such indices");
    }



    public static void main(String args[]){
        // int n = 10;
        // printDec(n);
        // printInc(n);
        // System.out.println(factorial(n));
        // System.out.println(sum(n));

        // System.out.println(fibo(n));
        // for(int i = 0; i < n; i++){
        //     System.out.print(fibo(i) + " ");
        // }

        // int arr[] = {1,2,3,4,5};
        // System.out.println(isSorted(arr,0));

        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // int key = 5;
        // System.out.println(findFirst(arr,key,0));
        // System.out.println(findLast(arr,key,0));

        // System.out.println(power(2,5));

        // System.out.println(tilingProblem(4));

        // String str = "appnnacollege";
        // StringBuilder sb = new StringBuilder("");
        // boolean map[] = new boolean[26];
        // removeDuplicates(str,sb,map,0);

        // System.out.println(friendsPairing(3));

        // int n = 3;
        // String str = "";
        // printBinStrings(n,str,1);



        // int arr[] = {3,2,4,5,6,2,7,2,2};
        // int key = 20;
        // printOccurrences(arr,key,0);

        // int n = 1947;
        // numTOString(n);

        // System.out.println(lengthOfString("hello"));

        // String str = "abcab";
        // System.out.println(countContiguousSubstring(str));

        // towerOfHanoi(3,"src","helper","dest");

        int nums[] = {2,7,11,15};
        System.out.println(Arrays.toString(nums));
        // int target = 9;
        // twoSum(nums,target);


        
    }
}