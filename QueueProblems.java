import java.util.*;

public class QueueProblems {
    public static void firstNonRepeating(String str){
        int freq[] = new int[26];
        Queue<Character> q = new ArrayDeque<>();

        for(char ch : str.toCharArray()){
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();

    }

    public static void interLeave(Queue<Integer> q){
        Queue<Integer> first = new ArrayDeque<>();
        int size = q.size();
        for(int i = 1; i <= size/2; i++){
            first.add(q.remove());
        }

        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
    }



    public static void main(String args[]){
        // String str = "aabccxb";
        // firstNonRepeating(str);

        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
    
}
