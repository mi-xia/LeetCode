package leetCode;

import leetCode.dto.ListNode;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class OneHundredAndFortyTwo {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;

        Boolean hasCycle = false;
        ListNode high = head;
        ListNode low = head;

        while(high != null && high.next != null){

            high = high.next.next;
            low = low.next;
            if (high!= null && high==low){
                hasCycle = true;
                break;
            }
        }
        if (hasCycle){
            ListNode tmp = head;
            while (tmp != low){
                tmp = tmp.next;
                low = low.next;
            }
            return tmp;
        }
        return null;
    }
}
