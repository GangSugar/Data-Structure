package 二叉树的最大深度;

class Node{
    char val;
    Node left;
    Node right;
    public Node(char val){
        this.val = val;
    }
}
public class MaxDepth {
    public static int maxDepth(Node root){
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static void main(String[] args) {
        //这里构造一棵二叉树
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;A.right = C;
        B.left = D;B.right = E;
        C.left = F;C.right = G;
        E.right = H;
        System.out.println(maxDepth(H));
    }
}
