public class DoublyLL{
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    //remove first
    public void removeFirst(){
        if(head == null){
            System.out.println("DLL is empty");
        }else if(head.next == null){
            head = tail = null;
            size = 0;
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    //remove Last
    public void removeLast(){
        if(head == null){
            System.out.println("DLL is empty");
        }else if(head.next == null){
            head = tail = null;
            size = 0;
        }else{
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }


    //print dll
    public void printDLL(){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.addLast(4);
        dll.addLast(5);

        dll.printDLL();
        System.out.println(dll.size);

        dll.removeFirst();
        dll.removeLast();
        dll.printDLL();
        System.out.println(dll.size);


    }
}