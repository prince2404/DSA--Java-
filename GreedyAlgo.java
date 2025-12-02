import java.util.*;

public class GreedyAlgo {
    public static void main(String args[]){
        int start[] = {0,1,3,5,5,8};
        int end[] = {6,2,4,7,9,9};
        int n = start.length;

        int act[][] = new int[n][3];
        for(int i = 0; i < n; i++){
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        Arrays.sort(act, Comparator.comparingInt(o -> o[2]));


        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //1st activity
        count = 1;
        ans.add(act[0][0]);

        int lastEnd = act[0][2];
        for(int i = 1; i < n; i++){
            if(act[i][1] >= lastEnd){
                count++;
                ans.add(act[i][0]);
                lastEnd = act[i][2];
            }
        }

        System.out.println("Total activity = " + count);
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();



    }
    
}
