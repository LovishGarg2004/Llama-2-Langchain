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

    public void Sum(int k, Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int count_null = 1;

        while(!q.isEmpty() && count_null != k){
            Node currentNode = q.remove();

            if(currentNode == null){
                count_null++;

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(currentNode.left != null){
                    q.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q.add(currentNode.right);
                }
            }
        }
        if(count_null == k){
            int Sum = 0;
            while (q.peek() != null) {
                Sum += (q.remove()).data;
            }
            System.out.println("Sum of " + k + " level nodes = " + Sum);
        }
        else{
            System.out.println("Invalid value of k !");
        }
    }
}


public class Sum_of_Nodes_at_Kth_level {
    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Binary_Tree B1 = new Binary_Tree();        
        Node root_B1 = B1.create_binary_tree(node);
        
        B1.Sum(3, root_B1);
    }
}
