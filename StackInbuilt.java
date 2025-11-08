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

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
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
        // String str = "abc";
        // System.out.println(reverseStr(str));
        // Stack<Character> s = new Stack<>();
        // String str = "abc";
        // for(int i = 0; i < str.length(); i++){
        //     s.push(str.charAt(i));
        // }

        // pushAtBottom(s, 4);

        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // printStack(s);
        reverseStack(s);
        printStack(s);
    }
}