import java.util.*;

public class StackInbuilt{

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        return sb.toString();
    }

    public static void main(String args[]){
        String str = "abc";
        System.out.println(reverseStr(str));
        // Stack<Character> s = new Stack<>();
        // String str = "abc";
        // for(int i = 0; i < str.length(); i++){
        //     s.push(str.charAt(i));
        // }

        // pushAtBottom(s, 4);

        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }
    }
}