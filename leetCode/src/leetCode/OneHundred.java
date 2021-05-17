package leetCode;

import leetCode.dto.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/same-tree/comments/
 * @date 2021/5/17 12:16
 */
public class OneHundred {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        List<Integer> pMid = new ArrayList();
        List<Integer> qMid = new ArrayList();
        List<Integer> pBef = new ArrayList();
        List<Integer> qBef = new ArrayList();

        doMid(p,pMid);
        doMid(q,qMid);
        doBef(p,pBef);
        doBef(q,qBef);

        if (pMid.size() != qMid.size()) return false;
        if (pBef.size() != qBef.size()) return false;

        for (int i = 0; i < pMid.size(); i++) {
            if (!pMid.get(i).equals(qMid.get(i))) return false;
        }
        for (int i = 0; i < pBef.size(); i++) {
            if (!pBef.get(i).equals(qBef.get(i))) return false;
        }

        return true;

    }


    public void doMid(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(-1);
            return;
        }

        doMid(root.left,list);
        list.add(root.val);
        doMid(root.right,list);
    }

    public void doBef(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(-1);
            return;
        }

        list.add(root.val);
        doBef(root.left,list);
        doBef(root.right,list);
    }



}
