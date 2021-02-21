package 二叉树的三种非递归遍历实现;

import java.util.Stack;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}
public class TraversalTest {
    //非递归先序遍历(需要和栈进行配合)
    void perOrderTraversal(Node root){
        Stack<Node> stack = new Stack<>();
        if (root == null)return;
        Node cur = root;

        //开始遍历
        while (cur != null && !stack.isEmpty()){
            while (cur != null){
                System.out.println(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            //循环当中出来说明左子树已经到底了，接着栈中节点弹出，依次判断是否有右边子树
            Node top = stack.pop();
            cur = top.right;//同样循环右边子树(右边子树此时相当于一棵新树)
        }


    }
    //非递归中序遍历
    void inOrderTraversal(Node root){
        Stack<Node> stack = new Stack<>();
        if (root == null)return;
        //先入栈，然后出栈打印，接着入栈
        Node cur = root;
        while (cur != null && !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.println(top.val);
            cur = top.right;
        }
    }
    //非递归后序遍历
    void postOrderTraversal(Node root){
        Stack<Node> stack = new Stack<>();
        if (root == null)return;
        //先入栈，然后出栈打印，接着入栈
        Node cur = root;
        Node prev= null;
        while (cur != null && !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev){
                stack.pop();
                System.out.println(cur.val);
                prev = cur;
                cur = null;
            }else{
                cur = cur.right;
            }
        }
    }
}
