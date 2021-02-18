package 链表的回文结构;

import java.util.Stack;

/**
 * 牛客网链接：https://www.nowcoder.com/practice/d281619e4b3e4a60a2cc66ea32855bfa?
 * tpId=49&&tqId=29370&rp=1&ru=/activity/oj&qru=/ta/2016test/question-ranking
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ChkPalindrome {
    public static boolean chkPalindrome(ListNode A) {
        //1.思路一：首先将链表反转，然后比较是否相等
        ListNode B = reverseList(A);//将链表进行反转

        //开始遍历，比较俩个链表
        while (A != null){//循环条件也可以是B不等于null，因为反转过，链表长度肯定一样
            if (A.val != B.val){
                return false;
            }else {
                A = A.next;
                B = B.next;
            }
        }
        return true;
    }

    //反转链表的方法
    public static ListNode reverseList(ListNode head) {
        //采用迭代的方法
        //1.实现设置一个傀儡节点
        ListNode pre = null;//pre也是最后反转过来的链表
        ListNode cur = head;//head是用来遍历的节点

        //2.开始遍历
        while (cur != null){
            //1.首先保存后面的链表
            ListNode next = cur.next;
            //2.开始反转
            cur.next = pre;
            //3.将pre指向反转的链表
            pre = cur;
            //4.cur继续向后面遍历
            cur = next;
        }
        //遍历结束
        return pre;
    }


    public static boolean chkPalindrome2(ListNode A) {
        //1.思路二：第一遍遍历将节点的值入栈，然后在遍历一次和栈中的元素进行比较(利用栈的先进后出)
        Stack<Integer> stack = new Stack<>();
        //1.第一遍遍历，入栈
        ListNode cur = A;
        while (cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }

        //2.第二遍遍历，进行比较
        while (A != null){
            if (A.val != stack.pop()){
                return false;
            }
            A = A.next;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}

