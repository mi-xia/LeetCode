package leetCode;

import leetCode.dto.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class NinetyTwoTest {

    @Test
    public void reverseBetween() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        NinetyTwo s = new NinetyTwo();
        ListNode res = s.reverseBetween(head,1,2);

        System.out.println(res);

    }
}