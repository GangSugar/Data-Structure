package 检查俩棵树是否相同;
/**
 * 孩子表示法
 */
class Node {
    char value;
    Node left;
    Node right;
    public Node(char value){
        this.value = value;
    }
}
public class IsSameTree {
    public static boolean isSameTree(Node p,Node q){
        if (p == null && q ==null){
            return true;
        }else if(p == null || q == null){
            return false;
        }else{
            if (p.value == q.value){
                //根相等，接下来看她们的子树是否相等
                return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
            }else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        //这里构造一棵二叉树
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;A.right = C;
        B.left = D;B.right = E;
        C.left = F;C.right = G;
        E.right = H;
        System.out.println(isSameTree(A, B));
        System.out.println(isSameTree(A,A));
    }
}
