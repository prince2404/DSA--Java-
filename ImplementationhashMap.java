import java.util.*;

import org.w3c.dom.Node;
public class ImplementationhashMap {
    static class HashMap<K,V> {
        static class Node<K,V> {
            K key;
            V value;
            Node<K,V> next;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
                this.next = null;
            }
        }

        private final double loadFactor = 0.75;

        private int capacity = 16;
        private int size = 0;

        private Node<K,V> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            buckets = new Node[capacity];
        }

        private int getBucketIndex(K key){
            int hash = key.hashCode();
            return Math.abs(hash) % capacity;
        }

        public void put(K key, V value){
            int index = getBucketIndex(key);
            Node<K,V> curr = buckets[index];

            if(curr == null){
                buckets[index] = new Node<>(key,value);
                size++;
            }else{
                Node<K,V> prev = null;
                while(curr != null){
                    if(curr.key.equals(key)){
                        curr.value = value;
                        return;
                    }
                    prev = curr;
                    curr = curr.next;
                }
                prev.next = new Node<>(key,value);
                size++;
            }

            if((double)size/capacity >= loadFactor){
                rehash();
            }
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            Node<K,V> oldBuckets[] = buckets;
            capacity = capacity*2;
            buckets = new Node[capacity];
            size = 0;

            for(Node<K,V> curr : oldBuckets){
                while(curr != null){
                    put(curr.key, curr.value);
                    curr = curr.next;
                }
            }
        }

        public V get(K key){
            int index = getBucketIndex(key);
            Node<K,V> curr = buckets[index];
            while(curr != null){
                if(curr.key.equals(key)){
                    return curr.value;   
                }
                curr = curr.next;
            }
            return null;
        }

        public V remove(K key){
            int index = getBucketIndex(key);
            Node<K,V> curr = buckets[index];
            Node<K,V> prev = null;

            while(curr != null){
                if(curr.key.equals(key)){
                    if(prev == null){
                        buckets[index] = curr.next;
                    }else{
                        prev.next = curr.next;
                    }
                    size--;
                    return curr.value;
                }
                prev = curr;
                curr = curr.next;
            }
            return null;

        }

        public int size(){
            return size;
        }


    }
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("orange", 20);
        map.put("apple", 30);
        System.out.println(map.size());

        System.out.println(map.get("apple"));
        System.out.println(map.remove("orange"));
        System.out.println(map.size());

    }
    
}
