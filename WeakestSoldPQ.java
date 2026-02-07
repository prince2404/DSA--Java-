import java.util.PriorityQueue;

public class WeakestSoldPQ {
    static class Soldier{
        int count;
        int index;

        public Soldier(int count, int index){
            this.count = count;
            this.index = index;
        }
    }

    public static void kWeakestSoldier(int matrix[][], int k){
        PriorityQueue<Soldier> pq = new PriorityQueue<>((a,b) -> (a.count != b.count)?a.count-b.count:a.index-b.index);

        for(int i = 0; i < matrix.length; i++){
            int count = 0;
            for(int val : matrix[i]){
                if(val == 1){
                    count++;
                }
            }
            pq.add(new Soldier(count, i));
        }

        for(int i = 1; i <= k; i++){
            Soldier s = pq.poll();
            System.out.println(s.index);
        }

    }
    public static void main(String args[]){
        int matrix[][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };

        int k = 2;
        kWeakestSoldier(matrix, k);
    }
    
}
