package leetCode;

import leetCode.dto.ListNode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/sort-list/
 * todo 有没有办法用快排实现
 * @date 2020/12/15 22:57
 */
public class OneHundredAndFortyEight {

    public ListNode sortList(ListNode head) {

        return head == null ? null : sort(head);
    }

    public ListNode sort(ListNode head){
        if (head.next == null){
            return head;
        }
        // 找中间数
        ListNode tmpNode = head;
        ListNode midNode = head;
        ListNode pre = null;

        while(tmpNode!= null && tmpNode.next != null){
            tmpNode = tmpNode.next.next;
            pre = midNode;
            midNode = midNode.next;
        }

        pre.next = null;
        // 左右递归
        ListNode leftHead = sort(head);
        ListNode rightHead = sort(midNode);

        // 合并
        return merge(leftHead,rightHead);
    }

    private ListNode merge(ListNode leftHead, ListNode rightHead) {

        ListNode dummyHead = new ListNode(0);

        ListNode head = dummyHead;

        while(leftHead != null && rightHead != null){
            if (leftHead.val < rightHead.val) {
                head.next = leftHead;
                head = head.next;
                leftHead = leftHead.next;
            } else {
                head.next = rightHead;
                head = head.next;
                rightHead = rightHead.next;
            }
        }


        if (leftHead != null){
            head.next = leftHead;
        }

        if (rightHead != null){
            head.next = rightHead;
        }

        return dummyHead.next;
    }

}
