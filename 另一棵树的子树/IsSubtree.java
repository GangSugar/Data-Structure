package 另一棵树的子树;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int val) { this.val = val; }
}
public class IsSubtree {
    public static boolean isSubTree(TreeNode p,TreeNode q){
        //1.如果俩棵树相同也是互为子树
        if (isSameTree(p,q)){
            return true;
        }
        //2.如果俩个都为空也是
        if (p == null && q == null)return true;
        if (p != null || q == null) return true;
        if (p == null)return false;
        //3.接下来就是全是非空的情况，进行遍历
        if (isSubTree(p.left,q)){
            return true;
        }else if(isSubTree(p.right,q)){
            return true;
        }
        return false;
    }

    public static boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q ==null){
            return true;
        }else if(p == null || q == null){
            return false;
        }else{
            if (p.val == q.val){
                //根相等，接下来看她们的子树是否相等
                return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
            }else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        //这里构造一棵二叉树
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;A.right = C;
        B.left = D;B.right = E;
        C.left = F;C.right = G;
        E.right = H;
        System.out.println(isSubTree(A, B));
        System.out.println(isSubTree(A,A));
        System.out.println(isSubTree(null,null));
        System.out.println(isSubTree(A,null));
        System.out.println(isSubTree(null,A));
    }
}


