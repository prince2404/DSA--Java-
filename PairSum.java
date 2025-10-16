import java.util.*;

public class PairSum{
    //Brute force
    // public static boolean checkPair(ArrayList<Integer> list, int target){
    //     for(int i = 0; i < list.size(); i++){
    //         for(int j = i+1; j < list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    
    //optimal soln
    public static boolean checkPair(ArrayList<Integer> list, int target){
        int i = 0;
        int j = list.size()-1;

        while(i < j){
            int sum = list.get(i) + list.get(j);
            if(sum == target){
                return true;
            }
            else if(sum < target){
                i++;
            }else{
                j--;
            }
        }
       
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(checkPair(list,target));
    }
}