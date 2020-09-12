package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OneHundredAndTwo {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    Queue<TreeNode> queueTmp = new LinkedList<TreeNode>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return result;
        queue.add(root);
        return levelOrder(queue,queueTmp);
    }

    public List<List<Integer>> levelOrder(Queue<TreeNode> queue, Queue<TreeNode> queueTmp) {
        while (!queue.isEmpty()){
            List<Integer> resultOne = new ArrayList<Integer>();
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if (node != null){
                    resultOne.add(node.val);
                    if (node.left != null)
                        queueTmp.add(node.left);
                    if (node.right != null)
                        queueTmp.add(node.right);
                }

            }

//            while(!queueTmp.isEmpty()){
//                queue.addAll(queueTmp);
//                queueTmp.clear();
//            }
            result.add(resultOne);
        }


        return result;
    }


}
