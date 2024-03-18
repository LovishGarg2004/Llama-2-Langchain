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

    public static void preorder_traversal(Node root){
        if(root == null){
            System.out.print("-1 ");
            return;
        }

        System.out.print(root.data + " ");
        preorder_traversal(root.left);
        preorder_traversal(root.right);
    }

    public static void inorder_traversal(Node root){
        if(root == null){
            System.out.print("-1 ");
            return;
        }

        inorder_traversal(root.left);
        System.out.print(root.data);
        inorder_traversal(root.right);
    }

    public static void postorder_traversal(Node root){
        if(root == null){
            System.out.print("-1 ");
            return;
        }

        postorder_traversal(root.left);
        postorder_traversal(root.right);
        System.out.print(root.data);
    }

    public static void level_order(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node current_Node = q.remove();

            if(current_Node == null){
                System.out.println();

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(current_Node.data);

                if(current_Node.left != null){
                    q.add(current_Node.left);
                }
                if(current_Node.right != null){
                    q.add(current_Node.right);
                }
            }
        }
    }
    
}

public class Traversal_methods_in_a_binary_tree {
    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // creating binary tree using preorder traversal technique.

        Binary_Tree B1 = new Binary_Tree();        
        Node root_B1 = B1.create_binary_tree(node);

        // System.out.println("preorder traversal :");
        // B1.preorder_traversal(root_B1);
        // System.out.println();

        // System.out.println("inorder traversal :");
        // B1.inorder_traversal(root_B1);
        // System.out.println();

        // System.out.println("postorder traversal :");
        // B1.postorder_traversal(root_B1);

        System.out.println("Level Order Traversal : ");
        B1.level_order(root_B1);
    }
}
