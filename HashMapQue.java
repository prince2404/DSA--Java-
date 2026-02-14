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
    public static void main(String args[]){
        // int nums[] = {1,3,2,5,1,3,1,5,1};
        // majorityElements(nums);
        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        System.out.println(countDistinctElements(nums));
    }
    
}
