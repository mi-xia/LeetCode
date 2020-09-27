package leetCode;

import leetCode.dto.ListNode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/reverse-linked-list-ii/
 * @date 2020/9/23 20:01
 */

public class NinetyTwo {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        if (head == null){
            return null;
        }
        ListNode leftLatest = head;
        int i = 1;
        while(i < m-1){
            leftLatest = leftLatest.next;
            i++;
        }

        ListNode mhead = leftLatest.next;
        ListNode rightFirt = leftLatest.next;
        ListNode pre = null;
        while (i < n){
            ListNode tmpNode = mhead.next;
            mhead.next = pre;
            pre = mhead;
            mhead = tmpNode;
            i++;
        }
        leftLatest.next = pre;
        if (rightFirt != null) {
            rightFirt.next = mhead;
        }

        return head;

    }


    public ListNode reverseBetween2(ListNode head, int m, int n) {

        if (head == null){
            return null;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode leftLatest = dummyHead;
        int i = 1;
        while(i < m){
            leftLatest = leftLatest.next;
            i++;
        }

        ListNode mhead = leftLatest.next;
        ListNode pre = null;
        while (i < n){
            ListNode tmpNode = mhead.next;
            mhead.next = pre;
            pre = mhead;
            mhead = tmpNode;
            i++;
        }
        leftLatest.next.next = mhead;
        leftLatest.next = pre;
//        if (rightFirt != null) {
//            rightFirt.next = mhead;
//        }

        return dummyHead.next;

    }
}
