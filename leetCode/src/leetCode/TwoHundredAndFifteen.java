package leetCode;

import java.util.Arrays;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/kth-largest-element-in-an-array/submissions/
 * @date 2020/12/20 15:59
 */
public class TwoHundredAndFifteen {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k+1];
    }

    public int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k+1];
    }

}
