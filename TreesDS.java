public class TreesDS {
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

    static class BinaryTrees{
        static int i = -1;
        public static Node buildTrees(int nodes[]){
            i++;
            if(nodes[i] == -1){
                return null;
            }
            Node newNode = new Node(nodes[i]);
            newNode.left = buildTrees(nodes);
            newNode.right = buildTrees(nodes);

            return newNode;
        }

        public static void preorder(Node root){
            if(root == null){
                // System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                // System.out.print(-1 + " ");
                return;
            }
            
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                // System.out.print(-1 + " ");
                return;
            }
            
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTrees(nodes);
        // tree.preorder(root);
        // tree.inorder(root);
        tree.postorder(root);

    }
    
}
