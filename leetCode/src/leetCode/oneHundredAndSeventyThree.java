package leetCode;

import java.util.Stack;

public class oneHundredAndSeventyThree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    Stack<TreeNode> stack = new Stack();

    TreeNode cur = null;

    public oneHundredAndSeventyThree(TreeNode root) {
        cur = root;
    }

    /** @return the next smallest number */
    public int next() {

        int res = -1;
        while (cur != null || !stack.isEmpty()){

            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            res = cur.val;
            cur = cur.right;
            break;
        }

        return res;

    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return cur!=null || !stack.isEmpty();
    }

}
