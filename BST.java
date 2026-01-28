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

    public static Node delete(Node root, int key){
        if(root == null){
            return null;
        }
        if(root.data > key){
            root.left = delete(root.left, key);
        }
        else if(root.data < key){
            root.right = delete(root.right, key);
        }else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }

    public static Node findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int low, int high){
        if(root == null){
            return;
        }
        if(root.data > low){
            printInRange(root.left, low, high);
        }
        if(root.data >= low && root.data <= high){
            System.out.print(root.data + " ");
        }
        if(root.data < high){
            printInRange(root.right, low, high);
        }
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        int low = 5;
        int high = 12;
        printInRange(root, low, high);
        // int key = 8;
        // delete(root,key);
        // inorder(root);


        // int key = -10;
        // System.out.println(search(root, key));
        // int values[] = {5,1,3,4,2,7};
        // Node root = null;

        // for(int val : values){
        //     root = build(root, val);
        // }
        

        // inorder(root);

    }
    
}
