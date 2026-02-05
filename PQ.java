import java.util.*;
public class PQ {
    static class Student{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
    }
    public static void main(String args[]){
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // pq.add(3);
        // pq.add(1);
        // pq.add(4);

        // while(!pq.isEmpty()){
        //     System.out.println(pq.poll());
        // }

        PriorityQueue<Student> pq = new PriorityQueue<>((a,b) -> a.rank - b.rank);
        pq.add(new Student("Prince", 10));
        pq.add(new Student("Aman", 50));
        pq.add(new Student("Deepak", 25));

        while(!pq.isEmpty()){
            Student s = pq.poll();
            System.out.println(s.name + " : " + s.rank);
        }

    }
    
}
