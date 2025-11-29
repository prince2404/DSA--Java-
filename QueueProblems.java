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

    public static void main(String args[]){
        String str = "aabccxb";
        firstNonRepeating(str);
    }
    
}
