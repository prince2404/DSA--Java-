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

    public static class Stack{
        Deque<Integer> dq = new ArrayDeque<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void push(int data){
            dq.addLast(data);
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.removeLast();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.getLast();
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

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
