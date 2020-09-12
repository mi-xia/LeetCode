package leetCode;

public class checkBalance {



    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }


    public boolean isBalanced(TreeNode root) {

        if (root == null)
            return true;

        if (Math.abs(getNodeDeep(root.left)-getNodeDeep(root.right)) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);


    }


    public int getNodeDeep(TreeNode root) {

        if (root == null)
            return 0;

        return Math.max(getNodeDeep(root.left),getNodeDeep(root.right)) + 1;

    }




}
