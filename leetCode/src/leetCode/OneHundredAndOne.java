package leetCode;

public class OneHundredAndOne {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return Boolean.TRUE;
        return isSymmetric(root.left,root.right);

    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return Boolean.TRUE;
        if ((left == null && right != null) || (left != null && right == null))
            return Boolean.FALSE;
        if (left.val != right.val)
            return Boolean.FALSE;
        return isSymmetric(left.left,right.right) && isSymmetric(left.right, right.left);

    }


}
