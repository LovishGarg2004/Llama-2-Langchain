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
    public static Node create_binary_tree(int node_array[]){
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

    public static int Sum_of_nodes(Node root){
        if(root == null){
            return 0;
        }

        int left_sub_tree = Sum_of_nodes(root.left);
        int right_sub_tree = Sum_of_nodes(root.right);

        return left_sub_tree + right_sub_tree + root.data;
    }
}


public class Sum_of_Node_in_a_binary_tree {
    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Binary_Tree B1 = new Binary_Tree();        
        Node root_B1 = B1.create_binary_tree(node);

        int total_sum = B1.Sum_of_nodes(root_B1);
        System.out.println(total_sum);
    }
}
