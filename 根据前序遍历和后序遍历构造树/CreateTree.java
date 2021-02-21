package 根据前序遍历和后序遍历构造树;



class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
public class CreateTree {
    //1.得到前序遍历和中序遍历的数组
    public int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null)return null;
        if (preorder.length == 0 || inorder.length == 0)return null;

        return buildTreeChild(preorder,inorder,0,inorder.length-1);
    }

    //2.通过遍历前序然后确定树
    public TreeNode buildTreeChild(int[] preorder,
                                   int[] inorder,int inBegin,int inEnd) {
        if (inBegin > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex]);//第一个节点就是根
        int inorderIndex = findInoderIndexOfRoot(inorder,inBegin,inEnd,preorder[preIndex]);
        preIndex++;

        //然后root.left就是找到下标的左半部分，root.right就是下标的右边=半部分
        root.left = buildTreeChild(preorder,inorder,inBegin,inorderIndex-1);
        root.right = buildTreeChild(preorder,inorder,inorderIndex+1,inEnd);

        return root;
    }

    //3.去中序遍历中找到根所在位置中的下标（val就是根）
    public int findInoderIndexOfRoot(int[] inorder,int inBegin,int inEnd,int val){
        for (int j = inBegin;j <= inEnd;j++){
            if (inorder[j] == val){
                return j;
            }
        }
        return -1;
    }

}
