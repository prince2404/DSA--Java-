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

    //slow-fast approach
    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is my midNode
    }

    public boolean checkPalindrome(){
        //base case
        if(head == null || head.next == null){
            return true;
        }
        //step-1 find midNode
        Node midNode = findMidNode(head);

        //step-2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half ka head
        Node left = head;

        //step-3 check left and right half 

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void printll(){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;

            }
        }
        if(cycle == false){
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // last node -> null
        prev.next = null;

    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);

        //left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public void zigZag(){
        //find mid node
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //2nd half reverse
        Node prev = null;
        Node curr = mid.next;
        Node next;

        mid.next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //alt merging
        Node lh = head;
        Node rh = prev;
        Node nextL, nextR;
        while(lh != null && rh != null){
            nextL = lh.next;
            lh.next = rh;
            nextR = rh.next;
            rh.next = nextL;

            lh = nextL;
            rh =  nextR;
        }
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addLast(1);
        // ll.addLast(5);
        // ll.addInBetween(10, 2);
        // ll.printll();
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.printll();

        // ll.removeLast();
        // ll.printll();
        // System.out.println(ll.size);

        // System.out.println(ll.search(10));
        // System.out.println(ll.recuSearch(1));
        // ll.removeNthNodeFromEnd(3);
        // ll.printll();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.printll();

        // System.out.println(ll.checkPalindrome());

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(ll.isCycle());
        // ll.removeCycle();
        // System.out.println(ll.isCycle());

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
       
        ll.printll();

        ll.zigZag();
        ll.printll();

    }
}