import java.util.*;
import org.w3c.dom.Node;
public class HeightOfTree {
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

    public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int h = Math.max(lh,rh) + 1;
            return h;
    }

    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }
        int ldiam = diameter2(root.left);
        int lh = height(root.left);
        int rdiam = diameter2(root.right);
        int rh = height(root.right);
        int selfdiam = lh + rh + 1;
        return Math.max(Math.max(ldiam, rdiam), selfdiam);
    }

    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        int totalCount = leftCount + rightCount + 1;
        return totalCount;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        int totalSum = leftSum + rightSum + root.data;
        return totalSum;
    }

    public static boolean isIdentical(Node root, Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }else if(root == null || subRoot == null || root.data != subRoot.data){
            return false;
        }
        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void kthLevel(Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }
        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);

    }

    // public static Node lowestCommonAncestor(Node root, int n1, int n2){
    //     ArrayList<Node> path1 = new ArrayList<>();
    //     ArrayList<Node> path2 = new ArrayList<>();

    //     getPath(root, n1, path1);
    //     getPath(root, n2, path2);

    //     int i = 0;

    //     while(i < path1.size() && i < path2.size()){
    //         if(path1.get(i) != path2.get(i)){
    //             break;
    //         }
    //         i++;
    //     }
    //     return path1.get(i-1);
    // }

    // public static boolean getPath(Node root, int n, ArrayList<Node> path){
    //     if(root == null){
    //         return false;
    //     }

    //     path.add(root);

    //     if(root.data == n){
    //         return true;
    //     }

    //     boolean foundLeft = getPath(root.left, n, path);
    //     boolean foundRight = getPath(root.right, n, path);

    //     if(foundLeft || foundRight){
    //         return true;
    //     }

    //     path.remove(path.size()-1);
    //     return false;
    // }

    public static int minDist(Node root, int n1, int n2){
        Node lca = lowestCommonAncestor(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }

    public static Node lowestCommonAncestor(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLCA = lowestCommonAncestor(root.left, n1, n2);
        Node rightLCA = lowestCommonAncestor(root.right, n1, n2);

        if(leftLCA == null && rightLCA == null){
            return null;
        }
        else if(leftLCA == null){
            return rightLCA;
        }else if(rightLCA == null){
            return leftLCA;
        }else{
            return root;
        }  
    }

    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftlcaDist = lcaDist(root.left, n);
        int rightlcaDist = lcaDist(root.right, n);

        if(leftlcaDist == -1 && rightlcaDist == -1){
            return -1;
        }else if(leftlcaDist == -1){
            return rightlcaDist + 1;
        }else{
            return leftlcaDist + 1;
        }
    }

    public static int kthAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = kthAncestor(root.left, n, k);
        int rightDist = kthAncestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if(max + 1 == k){
            System.out.println(root.data);
        
        }
        return max + 1;
        
    }

    public static int transformToSumTree(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = transformToSumTree(root.left);
        int rightSum = transformToSumTree(root.right);

        int val = leftSum + rightSum + root.data;

        root.data = leftSum + rightSum;
        return val;
        
    }

    public static boolean checkUnivalued(Node root, int val){
        if(root == null){
            return true;
        }
        if(root.data != val){
            return false;
        }
        return checkUnivalued(root.left, val) && checkUnivalued(root.right, val);
    }

    public static void mirrorTree(Node root){
        if(root == null){
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        mirrorTree(root.left);
        mirrorTree(root.right);
    }

    public static Node deleteLeafNodes(Node root, int val){
        if(root == null){
            return null;
        }
        root.left = deleteLeafNodes(root.left, val);
        root.right = deleteLeafNodes(root.right, val);

        if(root.left == null && root.right == null && root.data == val){
            return null;
        }
        return root;
    }
   
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(2);
        root.right.left = new Node(2);
        root.right.right = new Node(4);
        int val = 2;

        deleteLeafNodes(root, val);
        System.out.println(root.data);
    
        System.out.println(root.right.data);
        
        
        System.out.println(root.right.right.data);

        // Node root = new Node(2);
        // root.left = new Node(2);
        // root.right = new Node(2);
        // root.left.left = new Node(5);
        // root.left.right = new Node(2);

        // int val = root.data;
        // System.out.println(checkUnivalued(root, val));
        

        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        // transformToSumTree(root);
        // mirrorTree(root);
        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
        // System.out.println(root.left.left.data);
        // System.out.println(root.left.right.data);
        // System.out.println(root.right.left.data);
        // System.out.println(root.right.right.data);


        // int n = 4;
        // int k = 1;

        // kthAncestor(root, n, k);

        // int n1 = 4;
        // int n2 = 6;

        // System.out.println(minDist(root, n1, n2));

        // Node lca = lowestCommonAncestor(root, n1, n2);
        // System.out.println(lca.data);

        
        // kthLevel(root, 1, 2);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // System.out.println(isSubtree(root, subRoot));

        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root));
        // System.out.println(diameter(root).ht);


    }
    
}
