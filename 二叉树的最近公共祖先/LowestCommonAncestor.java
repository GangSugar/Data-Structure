package 二叉树的最近公共祖先;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}
public class LowestCommonAncestor {
    public static Node lowestCommonAncestor(Node root,Node p,Node q){
        if (root == null){
            return null;
        }
        //如果其中之一是根节点，返回根
        if (p == root || q == root){
            return root;
        }

        Node l = lowestCommonAncestor(root.left,p,q);
        Node r = lowestCommonAncestor(root.right,p,q);
        if (l != null && r != null){
            return root;
        }
        if (l != null){
            return l;        }
        if (r != null){
            return r;
        }
        return null;
    }
}
