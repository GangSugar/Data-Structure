package 根据后序遍历和中序遍历构造树;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class CreateTree {
    public int preIndex = 0;
    //1.
    public TreeNode buildTree(int[] inorder,int[] postorder){
        if (postorder == null || inorder == null)return null;
        if (postorder.length == 0 || inorder.length == 0)return null;
        preIndex = postorder.length-1;
        return buildTreeChild(inorder,postorder,0,inorder.length-1);
    }

    //2.
    public TreeNode buildTreeChild(int[] inorder,int[] postorder,int inBegin,int inEnd){
        if (inBegin > inEnd){
            return null;
        }
        //开始构造树
        TreeNode root = new TreeNode(postorder[preIndex]);
        int findOrderIndex = findInoderIndexOfRoot(inorder,inBegin,inEnd,postorder[preIndex]);
        preIndex--;

        root.right = buildTreeChild(inorder,postorder,findOrderIndex+1,inEnd);
        root.left = buildTreeChild(inorder,postorder,inBegin,findOrderIndex-1);

        return root;
    }

    public int findInoderIndexOfRoot(int[] inorder,int inBegin,int inEnd,int val){
        for (int j = inBegin;j <= inEnd;j++){
            if (inorder[j] == val){
                return j;
            }
        }
        return -1;
    }
}
