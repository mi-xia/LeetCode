package leetCode;

import java.util.HashMap;
import java.util.Map;

public class FourHundredAndThirtySeven {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int pathSum(TreeNode root, int sum) {

        Map<Integer,Integer> sumMap = new HashMap<Integer, Integer>();
        sumMap.put(0,1);
        if (root == null)
            return 0;
        return dfs(root,sum,0,sumMap);
    }

    public Integer dfs(TreeNode root, int target, int curSum, Map<Integer,Integer> sumMap){

        if (root == null){
            return 0;
        }

        int res = 0;

        curSum = curSum + root.val;
        res += sumMap.getOrDefault(curSum - target,0);

        sumMap.put(curSum,sumMap.getOrDefault(curSum,0) + 1);

        res += dfs(root.left,target,curSum,sumMap);
        res += dfs(root.right,target,curSum,sumMap);
        sumMap.put(curSum,sumMap.getOrDefault(curSum,0) - 1);
        return res;
    }


}
