import java.util.*;
public class HashMapQue {
    public static void majorityElements(int nums[]){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > n/3){
                System.out.println(e.getKey());
            }
        }
    }

    public static int countDistinctElements(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        return set.size();
    }

    public static int union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr1){
            set.add(n);
        }
        for(int n : arr2){
            set.add(n);
        }
        return set.size();
    }

    public static int intersection(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int n : arr1){
            set.add(n);
        }
        for(int n : arr2){
            if(set.contains(n)){
                result.add(n);
            }
        }

        return result.size();
    }

    public static void printTickets(HashMap<String, String> map){
        HashSet<String> set = new HashSet<>();
        for(String to : map.values()){
            set.add(to);
        }
        String start = null;
        for(String from : map.keySet()){
            if(!set.contains(from)){
                start = from;
                break;
            }
        }

        while(start != null){
            System.out.print(start + " -> ");
            start = map.get(start);
        }
    }

    public static void main(String args[]){
        // int nums[] = {1,3,2,5,1,3,1,5,1};
        // majorityElements(nums);
        // int nums[] = {4,3,2,5,6,7,3,4,2,1};
        // System.out.println(countDistinctElements(nums));

        // int arr1[] = {7,3,9};
        // int arr2[] = {6,3,9,2,9,4};
        // System.out.println(union(arr1,arr2));
        // System.out.println(intersection(arr1,arr2));

        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bangalore");
        map.put("Bombay", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        printTickets(map);
    }
    
}
