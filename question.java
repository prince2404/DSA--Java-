import java.util.*;

public class question{

    public static boolean containsDuplicate(int nums[]){
        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }else{
                seen.add(num);
            }
        }
        return false;
    }

    public static int rotatedSortedArray(int nums[], int target){
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            else{
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
        // int nums[] = {1,2,3,4,3,5,6};
        // boolean result = containsDuplicate(nums);
        // System.out.println(result);

        int nums[] = {7,8,9,1,2,3,4,5,6};
        int target = 10;

        int index = rotatedSortedArray(nums, target);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println(target + " is found at index " + index);
        }
    }
}