import java.util.*;

public class KeypadCombinations{

    // public static void helper(String digit, int index, String ans, String mapping[], List<String> result){
    //     if(index == digit.length()){
    //         result.add(ans);
    //         return;
    //     }

    //     char curr = digit.charAt(index);
    //     String str = mapping[curr-'0'];

    //     for(int i = 0; i < str.length(); i++){
    //         helper(digit, index+1, ans+str.charAt(i), mapping, result);
    //     }
    // }

    // public static List<String> getCombinations(String digit){
    //     List<String> result = new ArrayList<>();
    //     String mapping[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    //     helper(digit, 0, "", mapping, result);
    //     return result;
    // }

    public static void helper(String digit, int index, StringBuilder sb, String mapping[], List<String> result){
        if(index == digit.length()){
            result.add(sb.toString());
            return;
        }

        char curr = digit.charAt(index);
        String str = mapping[curr-'0'];

        for(int i = 0; i < str.length(); i++){
            sb.append(str.charAt(i));
            helper(digit, index+1, sb, mapping, result);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static List<String> getCombinations(String digit){
        List<String> result = new ArrayList<>();
        String mapping[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder sb = new StringBuilder("");

        helper(digit, 0, sb, mapping, result);
        return result;
    }


    public static void main(String args[]){
        String digit = "23";

        List<String> result = getCombinations(digit);
        System.out.println(result);

    }
}