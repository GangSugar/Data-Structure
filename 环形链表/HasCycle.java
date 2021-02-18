package 环形链表;

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
public class HasCycle {
    public static boolean hasCycle(ListNode head) {
        //思路一：比较好想到的思路就是快慢指针
        if(head == null )return false;
        ListNode quick = head.next;
        ListNode cur = head;
        while (cur != quick){
            if (quick == null || quick.next ==null){
                return false;
            }
            cur = cur.next;
            quick = quick.next.next;
        }
        return true;
    }


    public static boolean hasCycle2(ListNode head) {
        //思路二：；利用HashSet的无重复性
        if(head == null )return false;
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if (set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

    //求环形链表的长度(扩展)
    public static int hasCycleLength(ListNode head) {
        if(head == null )return 0;
        ListNode quick = head.next;
        ListNode cur = head;
        while (cur != quick){
            if (quick == null || quick.next ==null){
                return 0;
            }
            cur = cur.next;
            quick = quick.next.next;
        }
        //循环中出来说明第一次相遇；那么继续
        int count = 1;//因为有环，最少也有一个节点
        quick = quick.next;
        while (cur != quick){
            cur = cur.next;
            quick = quick.next.next;
            count++;
        }
        return count;
    }

    public static ListNode firstNode(ListNode head){
        //双指针的方法，一个的移动速度是另外一个移动速度的二倍
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode p3 = head;
        System.out.println(p3);
        while(p2 != null && p2.next != null) {//这里只需要判断p2就可以，因为p2移动的快
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2){
                break;//相等则有环，类似于小学的追击问题，就像操场跑步一样，一直跑下去，跑的快一定会追上跑的慢的
            }
        }
        //出来要判断一下
        if (p2 != null){
            //如果p2不等于空，则说明是相遇了，才从循环中出来的
            //则在次进行循环
            while (true){
                p1 = p1.next;
                p3 = p3.next;
                if (p1 == p3){
                    System.out.println(p3);
                    return p3;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(0);
        ListNode a4 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a2;
        System.out.println(hasCycleLength(a1));
        System.out.println(firstNode(a1).val);
    }
}
