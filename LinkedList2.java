import java.util.LinkedList;

public class LinkedList2{
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }
}