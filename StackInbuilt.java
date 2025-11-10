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

    public static void stockSpan(int stock[]){
        int span[] = new int[stock.length];
        Stack<Integer> s = new Stack<>();
        
        span[0] = 1;
        s.push(0);

        for(int i = 1; i < stock.length; i++){
            int currPrice = stock[i];
            while(!s.isEmpty() && currPrice >= stock[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }

            s.push(i);
        }

        for(int i = 0; i < span.length; i++){
            System.out.print(span[i] + " ");
        }
        System.out.println();

    }

    public static void nextGreaterElement(int arr[]){
        int nxtGreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for(int i = 0; i < nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }

    public static boolean checkValidParenthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')') || 
                (s.peek() == '{' && ch == '}') || 
                (s.peek() == '[' && ch == ']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
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

        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // // printStack(s);
        // reverseStack(s);
        // printStack(s);

        // int stock[] = {100, 80, 60, 70, 60, 85, 100};
        // stockSpan(stock);

        // int arr[] = {6,8,0,1,3};
        // nextGreaterElement(arr);

        String str = "({})[]";
        System.out.println(checkValidParenthesis(str));
    }
}