package 删除链表中重复节点;

/**
 * 牛客网链接：https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef?tpId=13&tqId=11209&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tab=answerKey
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class DeleteDuplication {
    public static ListNode deleteDuplication(ListNode pHead){
        //因为链表是排序的，因此重复的都在一起
        //1.首先设置一个傀儡节点
        ListNode head = new ListNode(0);
        head.next = pHead;
        ListNode pre = head;

        ListNode cur = pHead;
        while (cur != null){
             if(cur.next != null && cur.val == cur.next.val){
                 //一直找到最后面一个相同的节点
                 while (cur.next != null && cur.val == cur.next.val){
                     cur = cur.next;
                 }
                 //出来后，将最后一个也删除掉，也就是cur
                 pre.next = cur.next;
                 cur = cur.next;//然后接着向后面遍历，因为有可能有好几组相同的数字
             }else {
                 pre = pre.next;
                 cur = cur.next;
             }
        }
        return head.next;
    }

    public static void main(String[] args) {

    }
}
