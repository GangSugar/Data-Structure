package 二叉树的递归遍历;

/**
 * 孩子表示法
 */
class Node {
    char value;
    Node left;
    Node right;
    public Node(char value){
        this.value = value;
    }
}
public class TestTraversal {
    //先序遍历
    static void preOrderTraversal(Node root){
        if (root == null) return ;
        System.out.printf(root.value+" ");
        //1.左子树
        preOrderTraversal(root.left);
        //2.右子树
        preOrderTraversal(root.right);
    }
    //中序遍历
    static void inOrderTraversal(Node root){
        if (root == null) return;
        //1.左子树
        inOrderTraversal(root.left);
        //2.根
        System.out.print(root.value+" ");
        //3.右子树
        inOrderTraversal(root.right);
    }
    //后序遍历
    static void postOrderTraversal(Node root){
        if (root == null) return;
        //1.左子树
        postOrderTraversal(root.left);
        //2.右子树
        postOrderTraversal(root.right);
        //3.根
        System.out.printf(root.value+" ");
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
        System.out.printf("先序遍历：");
        preOrderTraversal(A);
        System.out.println();
        System.out.printf("中序遍历：");
        inOrderTraversal(A);
        System.out.println();
        System.out.printf("后序遍历：");
        postOrderTraversal(A);
    }
}
