package 根据二叉树创建字符串;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int value){
        this.val = value;
    }
}

public class Tree2str {
    public static String tree2str(Node t){
        if (t == null)return "";
        StringBuilder sb = new StringBuilder();//放结果的
        tree2strChild(t,sb);
        return sb.toString();
    }

    private static void tree2strChild(Node t, StringBuilder sb) {
        if (t == null)return;
        //1.首先添加根的值
        sb.append(t.val);
        //2。接着判断左子树
        if (t.left == null){
            if (t.right == null){
                return;
            }else{//3.右子树非空，那么先把左边子树的括号添加进去
                sb.append("()");//4.那么把左子树的（）添加进去
            }
        }else {
            sb.append("(");
            //4.同样判断它的孩子们
            tree2strChild(t.left,sb);
            sb.append(")");
        }

        //3.接着判断右子树
        if (t.right == null){
            return;
        }else{
            sb.append("(");
            tree2strChild(t.right,sb);
            sb.append(")");
        }
    }
}
