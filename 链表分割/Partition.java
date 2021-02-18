package 链表分割;

/**
 * 牛客网链接：https://www.nowcoder.com/practice/0e27e0b064de4eacac178676ef9c9d70?
 * tpId=8&&tqId=11004&rp=2&ru=/activity/oj&qru=/ta/cracking-the-coding-interview/question-
 * ranking
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public static ListNode partition(ListNode pHead, int x) {
        //拿俩个链表，一个放小于x的，一个放大于等于x的
        ListNode lcur = new ListNode(-1);//小于等于的
        ListNode gcur = new ListNode(-1);//大于的
        ListNode newLcur = lcur;
        ListNode newGcur = gcur;

        while (pHead != null){
            if (pHead.val < x){
                lcur.next = pHead;
                lcur = lcur.next;
            }else {
                gcur.next = pHead;
                gcur = gcur.next;
            }
            pHead = pHead.next;
        }
        gcur.next = null;
        lcur.next = newGcur.next;
        return newLcur.next;
    }

    public static void main(String[] args) {

    }
}
