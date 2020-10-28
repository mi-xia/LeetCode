package leetCode;

import leetCode.dto.TreeNode;

/**
 * @author 邹磊
 * @version 1.0
 * @description:
 * @date 2020/10/28 20:01
 */
public class TwoHundredAndTwentySix {

    public TreeNode invertTree(TreeNode root) {

        if (root == null){
            return root;
        }

        doInvertTree(root);
        return root;
    }


    public void doInvertTree(TreeNode root){

        if (root == null){
            return;
        }

        doInvertTree(root.left);
        doInvertTree(root.right);

        TreeNode tmpNode = root.left;
        root.left = root.right;
        root.right = tmpNode;
    }


}
