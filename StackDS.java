import java.util.*;

public class StackDS{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{

        public static Node head;

        public boolean isEmpty(){
            return head == null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;

        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        // ArrayList<Integer> list = new ArrayList<>();

        // public boolean isEmpty(){
        //     return list.size() == 0;
        // }

        // public void push(int data){
        //     list.add(data);
        // }

        // public int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int value = list.get(list.size()-1);
        //     list.remove(list.size()-1);
        //     return value;
        // }

        // public int peek(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int value = list.get(list.size()-1);
        //     return value;
        // }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}