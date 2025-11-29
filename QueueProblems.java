import java.util.*;

public class QueueProblems {
    // public static void firstNonRepeating(String str){
    //     int freq[] = new int[26];
    //     Queue<Character> q = new ArrayDeque<>();

    //     for(char ch : str.toCharArray()){
    //         q.add(ch);
    //         freq[ch-'a']++;

    //         while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
    //             q.remove();
    //         }
    //         if(q.isEmpty()){
    //             System.out.print(-1 + " ");
    //         }else{
    //             System.out.print(q.peek() + " ");
    //         }
    //     }
    //     System.out.println();

    // }

    // public static void interLeave(Queue<Integer> q){
    //     Queue<Integer> first = new ArrayDeque<>();
    //     int size = q.size();
    //     for(int i = 1; i <= size/2; i++){
    //         first.add(q.remove());
    //     }

    //     while(!first.isEmpty()){
    //         q.add(first.remove());
    //         q.add(q.remove());
    //     }
    // }

    // public static void reverse(Queue<Integer> q){
    //     Stack<Integer> s = new Stack<>();
    //     while(!q.isEmpty()){
    //         s.push(q.remove());
    //     }

    //     while(!s.isEmpty()){
    //         q.add(s.pop());
    //     }
    // }

    public static class Queue{
        Deque<Integer> dq = new ArrayDeque<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void add(int data){
            dq.addLast(data);
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.removeFirst();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.getFirst();
        }

    }



    public static void main(String args[]){
        // String str = "aabccxb";
        // firstNonRepeating(str);

        // Queue<Integer> q = new ArrayDeque<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        

        // interLeave(q);
        // reverse(q);

        // while(!q.isEmpty()){
        //     System.out.print(q.remove() + " ");
        // }
        // System.out.println();

        // Deque<Integer> dq = new ArrayDeque<>();
        // dq.addFirst(1);
        // dq.addLast(2);
        // dq.addFirst(3);
        // dq.removeLast();

        // System.out.println(dq);

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
    
}
