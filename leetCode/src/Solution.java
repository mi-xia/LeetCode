import leetCode.*;
import leetCode.dto.TreeNode;

public class Solution {

    public static void main(String[] args) {


        SixHundredAndSeventeen s = new SixHundredAndSeventeen();

        TreeNode t1 = new TreeNode(1);
        t1.setLeft(new TreeNode(3));
        t1.getLeft().setLeft(new TreeNode(5));
        t1.setRight(new TreeNode(2));

        TreeNode t2 = new TreeNode(2);
        t2.setLeft(new TreeNode(1));
        t2.getLeft().setRight(new TreeNode(4));
        t2.setRight(new TreeNode(3));
        t2.getRight().setRight(new TreeNode(7));

        s.mergeTrees(t1,t2);
        System.out.println("");

    }

}
