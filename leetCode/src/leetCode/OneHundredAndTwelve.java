package leetCode;

public class OneHundredAndTwelve {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        return dfs(root,sum,0);
    }


    public Boolean dfs(TreeNode root, int sum, int curSum){

        if (root == null)
            return false;
        curSum = curSum + root.val;
        if (sum == curSum && root.left == null && root.right == null)
            return true;
        if (sum < curSum)
            return false;

        return dfs(root.left,sum,curSum) || dfs(root.right,sum,curSum);

    }



}
