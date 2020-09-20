package leetCode;

import leetCode.dto.ListNode;

/**
 * https://leetcode-cn.com/problems/rotate-list/solution/
 */
public class SixtyOne{

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || k < 1)
            return head;

        ListNode lenthNode = head;
        int length = 0;

        while(lenthNode != null){
            length ++;
            lenthNode = lenthNode.next;
        }

        if (length <= 1)
            return head;

        int kTmp = k % length;
        if (kTmp < 1)
            return head;
        ListNode kTmpNode = head;
        ListNode headNode = head;
        while(kTmp > 0 ){
            kTmpNode = kTmpNode.next;
            kTmp--;
        }

        while (kTmpNode.next != null){
            kTmpNode = kTmpNode.next;
            headNode = headNode.next;
        }

        ListNode newHead = headNode.next;
        kTmpNode.next = head;
        headNode.next = null;

        return newHead;

    }
}

