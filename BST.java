import java.util.*;

import org.w3c.dom.Node;

public class BST {
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

    public static Node build(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = build(root.left, val);
        }else{
            root.right = build(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    
    }
    public static void main(String args[]){
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        int key = -10;
        System.out.println(search(root, key));
        // int values[] = {5,1,3,4,2,7};
        // Node root = null;

        // for(int val : values){
        //     root = build(root, val);
        // }
        

        // inorder(root);

    }
    
}
