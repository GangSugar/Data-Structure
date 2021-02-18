package 俩个链表的第一个公共节点;

import java.util.HashSet;
import java.util.Set;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}
public class GetIntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //思路一：采用HashSet，利用Hash的无重复性，找到直接返回，遍历完都没有找打，就返回空
        Set<ListNode> set = new HashSet<>();
        //1.首先将A放进去，在遍历B，(当然也可以反过来)
        while (headA != null){
            set.add(headA);
            headA = headA.next;
        }
        //2.开始遍历B
        while (headB != null){
            if (set.contains(headB)){
                return headB;//注意返回的是节点；
            }
            headB = headB.next;
        }
        return null;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        //思路二：先计算出俩个链表的长度，然后让长度比较长的先走，等剩余的长度一样长的时候，然后一起走，这样遍历过去，找到公共节点，直接返回
        int lenA = length(headA);
        int lenB = length(headB);
        //1.首先让长的先走
        while (lenA != lenB){
            if (lenA > lenB){
                headA = headA.next;
                lenA--;
            }else {
                headB = headB.next;
                lenB--;
            }
        }
        //2.从循环中出来，长度一样，就一起走
        while (headA != null){//当然也可以是headB != null
            if (headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;//遍历完还没有找到，只能返回空了
    }
    //计算长度的函数
    public static int length(ListNode head){
        int len = 0;
        while (head != null){
            len++;
            head = head.next;
        }
        return len;
    }


    public static ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        //tempA和tempB我们可以认为是A,B两个指针
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != tempB) {
            //如果指针tempA不为空，tempA就往后移一步。
            //如果指针tempA为空，就让指针tempA指向headB（注意这里是headB不是tempB）
            tempA = tempA == null ? headB : tempA.next;
            //指针tempB同上
            tempB = tempB == null ? headA : tempB.next;
        }
        //tempA要么是空，要么是两链表的交点
        return tempA;
    }

    public static void main(String[] args) {

    }
}
