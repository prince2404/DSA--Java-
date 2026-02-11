import java.util.PriorityQueue;
public class HeapPractice {
    static class Car{
        int distance;
        int index;

        public Car(int distance, int index){
            this.distance = distance;
            this.index = index;
        }
    }

    public static void nearbyCars(int cars[][], int k){
        PriorityQueue<Car> pq = new PriorityQueue<>((a,b) -> b.distance - a.distance);

        for(int i = 0; i < cars.length; i++){
            int distance = cars[i][0]*cars[i][0] + cars[i][1]*cars[i][1];
            pq.add(new Car(distance, i));
            if(pq.size() > k){
                pq.poll();
            }
        }

        while(!pq.isEmpty()){
            Car c = pq.poll();
            System.out.println(c.index);
        }
    }

    // public static void nearbyCars(int cars[][], int k){
    //     PriorityQueue<Car> pq = new PriorityQueue<>((a,b) -> a.distance - b.distance);

    //     for(int i = 0; i < cars.length; i++){
    //         int distance = cars[i][0]*cars[i][0] + cars[i][1]*cars[i][1];
    //         pq.add(new Car(distance, i));
    //     }

    //     for(int i = 1; i <= k; i++){
    //         Car c = pq.poll();
    //         System.out.println(c.index);
    //     }
    // }

    public static void main(String args[]){
        int cars[][] = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;
        nearbyCars(cars, k);
    }
    
}
