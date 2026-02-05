import java.util.*;
public class PQ {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(3);
        pq.add(1);
        pq.add(4);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
    
}
