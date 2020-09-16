package leetCode;

import leetCode.dto.ListNode;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle/submissions/1/
 */
public class OneHundredAndFortyOne {

    public boolean hasCycle(ListNode head) {

        if (head == null)
            return false;

        ListNode high = head;
        ListNode low = head;

        while(high != null && high.next != null){

            high = high.next.next;
            low = low.next;

            if (high!= null && high==low)
                return true;
        }

        return false;

    }

}
