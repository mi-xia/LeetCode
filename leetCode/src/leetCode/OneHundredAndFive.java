package leetCode;

import leetCode.dto.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @date 2020/11/29 17:33
 */
public class OneHundredAndFive {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length < 1 || inorder.length < 1){
            return null;
        }

        Map<Integer,Integer> preMap = new HashMap<>();
        Map<Integer,Integer> inMap = new HashMap<>();

        for (int i = 0; i < preorder.length; i++ ){
            preMap.put(preorder[i],i);
        }

        for (int i = 0; i < inorder.length; i++){
            inMap.put(inorder[i],i);
        }

        TreeNode resNode = doBuildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1,preMap,inMap);
        return resNode;
    }

    public TreeNode doBuildTree(int[] preorder, int[] inorder,int preLeft, int preRight, int inLeft, int inRight,
                            Map<Integer,Integer> preMap, Map<Integer,Integer> inMap){

        if (preLeft > preRight || inLeft > inRight){
            return null;
        }

        TreeNode resNode = new TreeNode(preorder[preLeft]);
        int index = inMap.get(preorder[preLeft]);
        //左
        resNode.left = doBuildTree(preorder,inorder,
                preLeft+1,preLeft+index-inLeft,inLeft,index-1,
                preMap,inMap);
        //右
        resNode.right = doBuildTree(preorder,inorder,
                preLeft+index-inLeft+1, preRight,index+1,inRight,
        preMap,inMap);

        return resNode;

    }

}
