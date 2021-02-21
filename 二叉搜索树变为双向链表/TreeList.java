package 二叉搜索树变为双向链表;

class Node{
    int val;
     Node left;
     Node right;
     public Node(int val){
         this.val = val;
     }
}
//利用中序遍历的方式
public class TreeList {
    static Node pre = null;
    public void ConverChild(Node pRootOfTree){
        if (pRootOfTree == null){
            return;
        }
        ConverChild(pRootOfTree.left);

        pRootOfTree.left = pre;
        if (pre != null){
            pre.right = pRootOfTree;
        }
        pre = pRootOfTree;

        ConverChild(pRootOfTree.right);
    }

    public Node Conver(Node pRootOfTree){
        if (pRootOfTree == null)return null;
        ConverChild(pRootOfTree);

        Node head = pRootOfTree;
        while (head.left != null){
            head = head.left;
        }
        return head;
    }
}
