package leetCode;

public class oneThousandThreeHundredAndSixtySeven {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null)
            return Boolean.TRUE;
        if (root == null)
            return Boolean.FALSE;

        return isSub(head,root) || isSubPath(head,root.left) || isSubPath(head,root.right);

    }

    public boolean isSub(ListNode head, TreeNode root) {
        if (head == null)
            return Boolean.TRUE;
        if (root == null)
            return Boolean.FALSE;
        if (head.val != root.val)
            return Boolean.FALSE;
        return isSub(head.next,root.left) || isSub(head.next,root.right);

    }

}
