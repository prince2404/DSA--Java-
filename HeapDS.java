import java.util.*;

public class HeapDS {
    static class Heap{
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size() == 0;
        }

        public void add(int data){
            list.add(data);
            int x = list.size()-1; //child index
            int par = (x-1)/2; //parent index

            while(list.get(x) < list.get(par)){
                int temp = list.get(x);
                list.set(x, list.get(par));
                list.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(0);
        }

        public int poll(){
            if(isEmpty()){
                return -1;
            }
            int val = list.get(0);

            int temp = list.get(0);
            list.set(0, list.get(list.size()-1));
            list.set(list.size()-1, temp);

            list.remove(list.size()-1);

            heapify(0);

            return val;
        }

        public void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int min = i;

            if(left < list.size() && list.get(left) < list.get(min)){
                min = left;
            }
            if(right < list.size() && list.get(right) < list.get(min)){
                min = right;
            }

            if(min != i){
                int temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);

                heapify(min);
            }
        }
    }
    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3);
        h.add(1);
        h.add(10);
        h.add(2);
        while(!h.isEmpty()){
            System.out.println(h.poll());
        }

    }
    
}
