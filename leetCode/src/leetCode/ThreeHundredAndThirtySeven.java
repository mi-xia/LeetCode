package leetCode;

import leetCode.dto.TreeNode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/house-robber-iii/
 * @date 2020/12/25 20:04
 */
public class ThreeHundredAndThirtySeven {

    public int rob(TreeNode root) {

        int[] res = doRob(root);

        return Math.max(res[0],res[1]);
    }


    private  int[] doRob(TreeNode root){

        if (root == null){
            return new int[2];
        }

        int[] res = new int[2];

        int[] left = doRob(root.left);

        int[] right = doRob(root.right);

        res[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);

        res[1] = root.val + left[0] + right[0];

        return res;

    }


//    private int doRob(TreeNode root, Boolean ifCal, int sum) {
//
//        if (root == null){
//            return sum;
//        }
//
//        if (ifCal == true){
//            int tmp  = doRob(root.left,false, sum) + doRob(root.right,false, sum);
//            return tmp;
//        } else {
//            int tmp  = doRob(root.left,false, sum) + doRob(root.right,false, sum);
//            sum = sum + root.val;
//            int tmp1  = doRob(root.left,true, sum) + doRob(root.right,true,sum);
//            return tmp > tmp1 ? tmp : tmp1;
//        }
//    }



}
