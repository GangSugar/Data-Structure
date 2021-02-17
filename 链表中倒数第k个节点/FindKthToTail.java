package 链表中倒数第k个节点;

/**
 * 牛客网链接：https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tqId=11167&rp=2&ru=%2Factivity%2Foj&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tab=answerKey
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class FindKthToTail {

    public static ListNode findKthToTail(ListNode head,int k) {
        //根寻找链表的中间节点与异曲同工之处
        //1.定义俩个节点，一个节点向前先走k-1步，走到第k-1个节点，然后俩个节点同时开始走，
        //2. 当先走的走到终点的时候，后面的刚好到达倒数第k个节点
        if(head == null || k <= 0){
            return null;
        }
        ListNode quick = head;
        ListNode cur = head;

        while (k-- > 0){
            if(quick == null){
                return null;
            }
            quick = quick.next;
        }

        while (quick != null){
            quick = quick.next;
            cur = cur.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        //这里用来自己构造链表进行测试
    }
}
