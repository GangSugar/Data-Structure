package 反转链表;

/**
 * 力扣链接：https://leetcode-cn.com/problems/reverse-linked-list/submissions/
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseList {
    //1.采用迭代的方法
    public static ListNode reverseList(ListNode head) {
        //迭代的方法需要保存前一个节点
        ListNode pre = null;
        ListNode cur = head;//用来遍历的节点

        while (cur != null){
            //1.首先将cur后面的链表保存下来
            ListNode next = cur.next;
            //2.然后将cur.next变为它的前一个节点
            cur.next = pre;
            //3.然后pre保存新链表(也就是反转链表的头节点)
            pre = cur;
            //4.cur继续遍历原来的链表
            cur = next;
        }
        //5.遍历完成，返回新链表的头节点
        return pre;
    }

    //2.采用递归的方法
    public static ListNode reverseList2(ListNode head) {
        //结束的条件就是遍历到空（也就是只有一个节点不需要反转，或者链表本来就是一个空链表）
        if (head == null || head.next == null){
            return head;
        }
        //用只有俩个节点的思想该如何用递归？那么下一个节点变为新的头节点
        ListNode newHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
        //可以去上面给的网址中去测试，也可以自己构造一个链表进行测试
    }
}
