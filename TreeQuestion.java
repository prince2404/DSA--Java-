import java.util.*;
import org.w3c.dom.Node;
public class TreeQuestion {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static HashMap<String, Integer> map = new HashMap<>();
    static ArrayList<Node> result = new ArrayList<>();

    public static ArrayList<Node> findDuplicateSubtrees(Node root){
        serialize(root);
        return result;
    }

    public static String serialize(Node root){
        if(root == null){
            return "N";
        }
        String str = serialize(root.left) + "," + serialize(root.right) + "," + root.data;
        map.put(str, map.getOrDefault(str, 0) + 1);

        if(map.get(str) == 2){
            result.add(root);
        }
        return str;
    }

    static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(Node root){
        dfs(root);
        return maxSum;  
    }

    public static int dfs(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = maxPathSum(root.left);
        int rightSum = maxPathSum(root.right);

        int both_SumGood = leftSum + rightSum + root.data;
        int only_oneSumGood = Math.max(leftSum, rightSum) + root.data;
        int only_rootSum = root.data;

        maxSum = Math.max(Math.max(maxSum, both_SumGood), Math.max(only_oneSumGood, only_rootSum));

        return Math.max(only_oneSumGood, only_rootSum);
    }
    public static void main(String args[]){
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(maxPathSum(root));
        

        // ArrayList<Node> result = findDuplicateSubtrees(root);
        // for(int i = 0; i < result.size(); i++){
        //     System.out.print(result.get(i).data + " ");
        // }
        // System.out.println();
    }
    
}
