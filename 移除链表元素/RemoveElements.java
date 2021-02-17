package 移除链表元素;

/**
 * 力扣网址：https://leetcode-cn.com/problems/remove-linked-list-elements/description/
 * 力扣网址：https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/submissions/
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        //直接遍历链表，遇到与节点的值相同的就删除
        //1.首先自己设置一个傀儡头节点
        ListNode head1 = new ListNode(0);
        //2.将链表接在傀儡节点的后面
        head1.next = head;

        //3.pre是标记节点，因为删除节点的时候，一般要得到删除节点的前一个节点
        ListNode pre = head1;
        ListNode cur = head;
        //4.开始遍历
        while (cur != null){
            //5.遇到相同的就删除
            if (cur.val == val){
                pre.next = cur.next;
            }else {//6.否则就向后面继续遍历
                pre = cur;
            }
            cur = cur.next;//因为删不删除节点，cur都会向后面移动，所以单独写
        }
        return head1.next;
    }

    public static void main(String[] args) {
        //可以自己构造一个链表进行测试，也可以根据链接去力扣中测试
    }
}
