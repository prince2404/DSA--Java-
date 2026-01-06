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
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTrees(nodes);
        System.out.println(root.data);

    }
    
}
