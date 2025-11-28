import java.util.*;

public class StackDS2 {
    public static class Stack{
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        public boolean isEmpty(){
            return q1.isEmpty();
        }

        public void push(int data){
            q1.add(data);
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            while(q1.size() > 1){
                q2.add(q1.remove());
            }
            int val = q1.remove();

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return val;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            while(q1.size() > 1){
                q2.add(q1.remove());
            }
            int val = q1.remove();
            q2.add(val);


            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return val;
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
