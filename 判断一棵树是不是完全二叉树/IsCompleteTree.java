package 判断一棵树是不是完全二叉树;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val = val;
    }
}
public class IsCompleteTree {
    public static boolean isCompletetTree(Node root){
        Queue<Node> queue = new LinkedList<>();
        if(root == null){
            return true;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            if (cur != null){
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else {
                break;
            }
        }
        //循环出来需要判断，剩下的元素是不是都为空，只要出现非空的说明就不是完全二叉树
        while (!queue.isEmpty()){
            if (queue.poll() != null){
                return false;
            }
        }
        return true;
    }
}
