import java.util.*;

public class threeSum{

    public static List<List<Integer>> threeSum(int nums[]){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1; 
            int k = nums.length - 1;
            
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return result;

    }

    public static List<List<Integer>> threeSumBrute(int nums[]){
        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }

    public static List<List<Integer>> threeSumBetter(int nums[]){
        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            Set<Integer> seen = new HashSet<>();

            for(int j = i+1; j < nums.length; j++){
                int third = -nums[i]-nums[j];
                if(seen.contains(third)){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(triplet);
                    result.add(triplet);
                }else{
                    seen.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(result);
    }


    public static void main(String args[]){
        int nums[] = {-1,0,1,2,-1,-4};
        // List<List<Integer>> result = threeSum(nums);
        // System.out.println(result);

        // List<List<Integer>> result = threeSumBrute(nums);
        // System.out.println(result);

        List<List<Integer>> result = threeSumBetter(nums);
        System.out.println(result);

    }
}