import java.util.*;

public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addInBetween(int data, int index){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node ptr = head;
        int i = 0;
        while(i != index-1){
            ptr = ptr.next;
            i++;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
        
    }

    public void removeFirst(){
        if(size == 0){
            System.out.println("Linked list is empty");
        }
        else if(size == 1){
            head = tail = null;
            size = 0;
        }

        head = head.next;
        size--;
    }

    public void removeLast(){
        if(size == 0){
            System.out.println("Linked list is empty");
        }
        else if(size == 1){
            head = tail = null;
            size = 0;
        }

        Node ptr = head;
        int i = 0;
        while(i != size-2){
            ptr = ptr.next;
            i++;
        }
        
        ptr.next = null;
        tail = ptr;
        size--;
    }

    public int search(int key){
        Node ptr = head;
        int i = 0;
        while(ptr != null){
            if(ptr.data == key){
                return i;
            }
            ptr = ptr.next;
            i++;
        }
        
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recuSearch(int key){
        return helper(head, key);
        
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthNodeFromEnd(int n){
        Node prev = head;
        Node curr = head.next;
        int i = 0;
        while(i != size-n-1){
            prev = prev.next;
            curr = curr.next;
            i++;
        }
        prev.next = curr.next;
        size--;
    }

    public void printll(){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(1);
        ll.addLast(5);
        ll.addInBetween(10, 2);
        ll.printll();
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.printll();

        // ll.removeLast();
        // ll.printll();
        // System.out.println(ll.size);

        // System.out.println(ll.search(10));
        // System.out.println(ll.recuSearch(1));
        ll.removeNthNodeFromEnd(3);
        ll.printll();

    }
}