package leetCode;

import java.util.ArrayList;
import java.util.List;

public class OneHundredAndThirteen {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> curList = new ArrayList<Integer>();
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        dfs(root,sum,0, curList, result);
        return result;
    }

    public void dfs(TreeNode root, int sum, int curSum, List<Integer> curList, List<List<Integer>> result){

        if (root == null){
            return;
        }

        curSum = curSum + root.val;
        curList.add(root.val);
        if (sum == curSum && root.left == null && root.right == null){
            result.add(new ArrayList<Integer>(curList));
            curList.remove(curList.size()-1);
            return;
        }

        dfs(root.left,sum,curSum,curList,result);
        dfs(root.right,sum,curSum,curList,result);
        curList.remove(curList.size()-1);

    }

}
