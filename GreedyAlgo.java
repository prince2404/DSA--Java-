import java.util.*;

public class GreedyAlgo {
    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String args[]){
        int jobsInfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for(int i = 0; i < jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a,b) -> b.profit-a.profit); //descending

        int time = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                ans.add(curr.id);
                time++;
            }
        }

        System.out.println("Total jobs = " + ans.size());
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }
    
}
