import java.util.*;

public class StackDS2 {
    public static class Stack{
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        public boolean isEmpty(){
            return q1.isEmpty();
        }

        public void push(int data){
            q2.add(data);
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        public int pop(){
            return q1.remove();
        }

        public int peek(){
            return q1.peek();
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
    
}
