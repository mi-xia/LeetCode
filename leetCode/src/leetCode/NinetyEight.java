package leetCode;

import leetCode.dto.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/validate-binary-search-tree/submissions/
 * @date 2020/11/25 20:28
 */
public class NinetyEight {

    List<Integer> res = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {

//        List<Integer> res = new ArrayList<>();
//
//        doIsValidBST2(root,res);
//
//        if (res.size() == 0) {return true;}
//        if (res.size() == 1) {return true;}
//
//        int cur = res.get(0);
//
//        for (int i = 1; i < res.size(); i++){
//
//            if (res.get(i)<= cur) {
//                return false;
//            } else {
//                cur = res.get(i);
//            }
//
//        }
//        return true;
        return true;
    }


    public void doIsValidBST2(TreeNode root, List<Integer> res){

        if (null == root){
            return;
        }

        doIsValidBST2(root.left,res);
        res.add(root.val);
        doIsValidBST2(root.right,res);
    }


    public void doIsValidBST(TreeNode root,int min, int max){

        if (root == null){
            return;
        }

        if (root.left != null && root.left.val >= max){
            res.add(1);
        }

        if (root.right != null && root.right.val <= max){
            res.add(1);
        }

        min = Math.min(min,root.val);
        max = Math.max(max,root.val);

        doIsValidBST(root.left,min,max);
        doIsValidBST(root.right,min,max);

    }


}
