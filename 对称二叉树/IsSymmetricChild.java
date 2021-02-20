package 对称二叉树;

class Node{
    char val;
    Node left;
    Node right;
    public Node(char val){
        this.val = val;
    }
}
public class IsSymmetricChild {
    //这是用来判断子树是否是对称的
    public static boolean isSymmetricChild(Node leftTree,Node  rightTree){
        if (leftTree == null && rightTree == null){
            return true;
        }else if(leftTree == null || rightTree == null){
            return false;
        }else{//这里俩种情况都不为空
            if (leftTree.val != rightTree.val){
                return false;
            }else{//根相同，接下来看子树是否对称相同
                return isSymmetricChild(leftTree.left,rightTree.right) && isSymmetricChild(leftTree.right,rightTree.left);
            }
        }
    }

    public static boolean isSymmetric(Node root){
        if (root == null)return true;
        return isSymmetricChild(root.left,root.right);
    }
    public static void main(String[] args) {

    }
}
