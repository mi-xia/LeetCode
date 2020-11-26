package leetCode;

import leetCode.dto.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class NinetyEightTest {

    @Test
    public void isValidBST() {

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(2);
        c.left = a;
        c.right = b;
//        TreeNode d = new TreeNode(1);
//        TreeNode e = new TreeNode(5);
//
//        e.left = d;
//        e.right = c;

        NinetyEight s = new NinetyEight();

        s.isValidBST(c);

    }
}