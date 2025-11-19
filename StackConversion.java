import java.util.*;

public class StackConversion {

    public static int priority(char ch){
        if(ch == '^'){
            return 3;
        }
        else if(ch == '*' || ch == '/'){
            return 2;
        }
        else if(ch == '+' || ch == '-'){
            return 1;
        }
        else{
            return -1;
        }
    }

    public static String infixToPostfix(String str){
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        int i = 0; 
        while(i < str.length()){
            char ch = str.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                sb.append(ch);
            }
            else if(ch == '('){
                s.push(ch);
            }
            else if(ch == ')'){
                while(!s.isEmpty() && s.peek() != '('){
                    sb.append(s.peek());
                    s.pop();
                }
                s.pop();
            }
            else{
                while(!s.isEmpty() && priority(ch) <= priority(s.peek())){
                    sb.append(s.peek());
                    s.pop();
                }
                s.push(ch);
            }
            i++;
        }

        while(!s.isEmpty()){
            sb.append(s.peek());
            s.pop();
        }

        return sb.toString();

    }
    public static void main(String args[]){
        String str = "a+b*(c^d-e)";
        String result = infixToPostfix(str);
        System.out.println(result);
    }
    
}
