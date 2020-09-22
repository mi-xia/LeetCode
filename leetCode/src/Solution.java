import leetCode.*;
import leetCode.dto.ListNode;
import leetCode.dto.TreeNode;

public class Solution {

    public static void main(String[] args) {


//        SixHundredAndSeventeen s = new SixHundredAndSeventeen();
//
//        TreeNode t1 = new TreeNode(1);
//        t1.setLeft(new TreeNode(3));
//        t1.getLeft().setLeft(new TreeNode(5));
//        t1.setRight(new TreeNode(2));
//
//        TreeNode t2 = new TreeNode(2);
//        t2.setLeft(new TreeNode(1));
//        t2.getLeft().setRight(new TreeNode(4));
//        t2.setRight(new TreeNode(3));
//        t2.getRight().setRight(new TreeNode(7));
//
//        s.mergeTrees(t1,t2);
//        System.out.println("");

//        TwoHundredAndSix s = new TwoHundredAndSix();
//
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//
//        s.reverseList(head);


//        One s = new One();
//
//        int[] ints = s.twoSum(new int[]{3, 2, 7, 11, 15}, 9);
//        for (int i = 0; i < ints.length; i++) {
//            int anInt = ints[i];
//            System.out.println(anInt);
//        }


        ThirtyThree s = new ThirtyThree();

        int res = s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(res);
    }

}
