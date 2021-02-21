package 二叉树的分层遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}
public class LevelOrder {
    //层次遍历需要和队列配合，队列用来保证顺序性
    public static List<List<Integer>> levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if (root == null){
            return res;
        }
        //1.首先入队
        queue.offer(root);
        while (!queue.isEmpty()){
            //放每一层的结果
            List<Integer> row = new ArrayList<>();
            int count = queue.size();
            while (count-- != 0){//遍历每一层，得到每一层的结果
                Node cur = queue.poll();
                row.add(cur.val);
                if (cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }
            }
            res.add(row);
        }
        return res;
    }
}
