package leetCode;

import leetCode.dto.ListNode;

public class EightHundredAndSeventySix {

    public ListNode middleNode(ListNode head) {

        if (head == null)
            return null;

        ListNode high = head;
        ListNode low = head;

        while(high != null && high.next != null){
            high = high.next.next;
            low = low.next;
        }
        return low;
    }
}
