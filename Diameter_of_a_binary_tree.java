import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Binary_Tree{

    static int idx = -1;
    public Node create_binary_tree(int node_array[]){
        idx++;
        if(node_array[idx] == -1)
        {
            return null;
        }

        Node newNode = new Node(node_array[idx]);
        newNode.left = create_binary_tree(node_array);
        newNode.right = create_binary_tree(node_array);
        return newNode;
    }

    public int height(Node root){

        if(root == null){
            return 0;
        }

        int left_height = height(root.left);
        int right_height = height(root.right);

        return Math.max(left_height, right_height) + 1;
    }

    public int diameter_1(Node root){          // Approach 1 : Big-O(n^2)
        if(root == null){                       // visiting every node twice.
            return 0;
        }

        int left_diameter = diameter_1(root.left);
        int right_diameter = diameter_1(root.right);
        int root_diameter = height(root.left) + height(root.right) + 1;

        return Math.max(root_diameter, Math.max(right_diameter, left_diameter));

    }

    public TreeInfo diameter_2(Node root){     // Approach 2 : Big-O(n)
        if(root == null){                       // visiting every node once.
            TreeInfo temp_tree = new TreeInfo(0, 0);
            return temp_tree;
        }

        TreeInfo left_tree = diameter_2(root.left);
        TreeInfo right_tree = diameter_2(root.right);

        int myHeight = Math.max(left_tree.ht, right_tree.ht) + 1;

        int diam_1 = left_tree.diam; 
        int diam_2 = right_tree.diam; 
        int diam_3 = left_tree.ht + right_tree.ht + 1;

        int myDiameter = Math.max(diam_3, Math.max(diam_1, diam_2));

        TreeInfo myTree = new TreeInfo(myHeight, myDiameter);
        return myTree;
    }
}

class TreeInfo{
    int ht;
    int diam;

    TreeInfo(int ht, int diam){
        this.ht = ht;
        this.diam = diam;
    }
}

public class Diameter_of_a_binary_tree{
    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Binary_Tree B1 = new Binary_Tree();        
        Node root_B1 = B1.create_binary_tree(node);

        // System.out.println(B1.diameter_1(root_B1));
        System.out.println((B1.diameter_2(root_B1)).diam);
    }
}