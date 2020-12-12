package leetCode;

import leetCode.dto.TreeNode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/submissions/
 * @date 2020/12/10 23:36
 */
public class TwoHundredAndThirtySix {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root.val == p.val || root.val == q.val){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if (left != null && right != null){
            return root;
        }

        return left != null ? left : right;
    }

}
