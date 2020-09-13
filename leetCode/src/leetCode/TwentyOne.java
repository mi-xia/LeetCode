package leetCode;


public class TwentyOne {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode resulet = new ListNode(-1);
        ListNode tmp = resulet;

        while(l1 != null && l2 != null){

            if (l1.val > l2.val){
                tmp.next = l2;
                l2 = l2.next;
            } else {
                tmp.next = l1;
                l1 = l1.next;
            }

            tmp = tmp.next;
        }

        tmp.next = l1 == null ? l2 : l1;

        return resulet.next;

    }
}
