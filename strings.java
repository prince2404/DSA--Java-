import java.util.*;

public class strings{

    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;
            }else if(dir == 'E'){
                x++;
            }else{
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        float result = (float)Math.sqrt(X2 + Y2);
        return result;
    }

    public static String convertFirstUpper(String str){
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String stringCompress(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < str.length(); i++){
            sb.append(str.charAt(i));
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count > 1){
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }

    public static int countVowels(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
       
    }

    public static boolean areAnagrams(String str1, String str2){
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String args[]){
        // String str = "noon";
        // System.out.println(isPalindrome(str));

        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        // String str = "hi, i am shradh a ";
        // System.out.println(convertFirstUpper(str));

        // String str = "aaabbcccdd";
        // System.out.println(stringCompress(str));

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter string : ");
        // String str = sc.nextLine();
        // System.out.println(countVowels(str));

        String str1 = "earth";
        String str2 = "heart";
        if(areAnagrams(str1,str2)){
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else{
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
}