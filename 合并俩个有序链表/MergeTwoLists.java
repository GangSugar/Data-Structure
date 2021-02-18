package 合并俩个有序链表;

/**
 * 力扣链接：https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //直接遍历
        ListNode newHead = new ListNode(-1);//存放结果的新链表
        ListNode cur = newHead;
        while (l1 != null && l2 != null){
            while (l1 != null && l1.val <= l2.val){
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }
            while (l1 != null && l2 != null && l1.val > l2.val){
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        //出来之后有可能有一个没有遍历完
        cur.next = l1 == null ? l2 : l1;
        return newHead.next;
    }

    public static void main(String[] args) {
        //测试的地方，可以去力扣中测试，也可以自己构造链表进行测试
    }
}
