package leetCode;

import leetCode.dto.TreeNode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * @date 2020/12/1 23:28
 */
public class OneHundredAndFourteen {

    public void flatten(TreeNode root) {

        doFlatten(root);

    }

    public void doFlatten(TreeNode root) {

        if (root == null){
            return;
        }

        doFlatten(root.left);
        doFlatten(root.right);
        TreeNode tmp = root.left;
        if (tmp != null){
            while (tmp.right != null){
                tmp =tmp.right;
            }

            tmp.right = root.right;
            root.right = root.left;
            root.left = null;
        }

    }

}
