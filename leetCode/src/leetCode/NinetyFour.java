package leetCode;

import leetCode.dto.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/submissions/
 * @date 2020/11/22 21:45
 */
public class NinetyFour {


    class Solution {


        public List<Integer> inorderTraversal(TreeNode root) {

            List<Integer> res = new ArrayList<>();
            doInorderTraversal(root,res);
            return res;

        }


        public void doInorderTraversal(TreeNode root, List<Integer> result){

            if (root == null){
                return;
            }

            doInorderTraversal(root.left,result);
            result.add(root.val);
            doInorderTraversal(root.right,result);
        }



    }


}
