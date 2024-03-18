class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Binary_Tree {

    static int idx = -1;
    
    public Node Create_Binary_Tree(int node[]){
        idx++;
        if(node[idx] == -1)
        {
            return null;
        }

        Node newNode = new Node(node[idx]);             // 1. root node
        newNode.left = Create_Binary_Tree(node);        // 2. left sub-tree
        newNode.right = Create_Binary_Tree(node);       // 3. right sub-tree

        return newNode;
    }
}

public class Create_a_binary_tree_using_an_preorder_traversal{

    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Binary_Tree tree = new Binary_Tree();
        Node root_node = tree.Create_Binary_Tree(node);

        System.out.println("Value of the root node : " + root_node.data);
    }
}