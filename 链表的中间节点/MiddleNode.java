package 链表的中间节点;

/**
 * 力扣了链接：https://leetcode-cn.com/problems/middle-of-the-linked-list/description/
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class MiddleNode {
    public static ListNode middleNode(ListNode head) {
        //俩个遍历的节点，一个以每次俩个节点的速度进行遍历，另外一个一次一个节点速度遍历；
        //那么第二个到达终点的时候，慢的刚好到达中间节点
        ListNode quick = head;//2倍遍历
        ListNode cur = head;//正常遍历
        while (quick != null && quick.next != null){
            quick = quick.next.next;
            cur = cur.next;
        }
        return cur;
    }

    //2.方法2，采用数组存储的方法
    public static ListNode middleNode2(ListNode head) {
        //因为链表最大长度是100
        ListNode[] arr = new ListNode[100];
        int index = 0;
        while (head != null){
            arr[index++] = head;
            head = head.next;
        }
        return arr[index/2];
    }

    public static void main(String[] args) {
        //可以自己去网址中测试，也可以自己构造一个链表进行测试
    }
}
