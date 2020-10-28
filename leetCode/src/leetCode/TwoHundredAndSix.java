package leetCode;

import leetCode.dto.ListNode;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/solution/fan-zhuan-lian-biao-by-leetcode/
 */
public class TwoHundredAndSix {
//    public ListNode reverseList(ListNode head) {
//
//        if (head == null)
//            return null;
//        ListNode cur = head;
//        ListNode pre = null;
//        reverse(head,null,newHead);
//        return newHead;
//    }
//
//
//    public void reverse(ListNode head, ListNode newNode, ListNode newHead){
//
//        if (head == null){
//            newHead = newNode;
//            return;
//        }
//
//
//
//        reverse(head.next,tmp,newHead);
//
//    }


    public ListNode reverseList2(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

}
