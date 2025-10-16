import java.util.*;

public class ArrayListQuestions{
    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> nums){
        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key) == 1 && !map.containsKey(key-1) && !map.containsKey(key+1)){
                result.add(key);
            }
        }
        return result;
    }

    public static int mostFrequent(ArrayList<Integer> nums, int key){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxCount = 0;
        int result = 0;

        for(int i = 0; i < nums.size()-1; i++){
            if(nums.get(i) == key){
                int target = nums.get(i+1);
                map.put(target, map.getOrDefault(target,0)+1);

                if(map.get(target) > maxCount){
                    maxCount = map.get(target);
                    result = target;
                }
            }
        }
        return result;
    }

    public static ArrayList<Integer> beautifulArrayList(int n){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);

        while(result.size() < n){
            ArrayList<Integer> temp = new ArrayList<>();

            for(int x : result){
                if(2*x-1 <= n){
                    temp.add(2*x-1);
                }

            }

            for(int x : result){
                if(2*x <= n){
                    temp.add(2*x);
                }
            }
            result = temp;
        }
        return result;
    }
    
    public static void main(String args[]){
        // ArrayList<Integer> nums = new ArrayList<>();
        // nums.add(10);
        // nums.add(6);
        // nums.add(5);
        // nums.add(8);

        // System.out.println(lonelyNumbers(nums));

        // ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,100,200,1,100));
        // int key = 1;

        // System.out.println(mostFrequent(nums,key));

        int n = 5;
        System.out.println(beautifulArrayList(n));
    }
}