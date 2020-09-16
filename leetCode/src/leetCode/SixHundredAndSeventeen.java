package leetCode;

import leetCode.dto.TreeNode;

/**
 * https://leetcode-cn.com/problems/merge-two-binary-trees/submissions/
 * 为什么下面那种方法不行？
 */
public class SixHundredAndSeventeen {



    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;

        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);

        return t1;
    }

    public void merge(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null) {
            t1 = null;
            return;
        }
        if (t1 == null){
            t1 = t2;
            return;
        }
        if (t2 == null){
            t1 = t1;
            return;
        }

        t1.val = t1.val + t2.val;
        merge(t1.left,t2.left);
        merge(t1.right,t2.right);
    }

}
