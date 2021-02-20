package 判断一棵树是否是平衡二叉树;

class Node{
    char val;
    Node left;
    Node right;
    public Node(char val){
        this.val = val;
    }
}
public class IsBalanced {
    public static boolean isBalanced(Node root){
        if (root == null)return true;
        //1.首先计算高度
        if(Math.abs(maxDepth(root.right)-maxDepth(root.left)) <= 1){
            return isBalanced(root.left)&&isBalanced(root.right);//通过递归看子树是否也是如此
        }
        return false;
    }
    public static int maxDepth(Node root){
        if (root == null)return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)+1);
    }

    public static void main(String[] args) {

    }
}
