package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 * @date 2020/11/4 19:12
 */
public class ThirtyThreeOne {

    public int search(int[] nums, int target) {

        if (nums.length == 0){
            return -1;
        }

        int l = 0;
        int r = nums.length - 1;

        while (l <= r){
            int midIndex = (l+r)/2;
            int midNum = nums[midIndex];
            if (midNum == target){
                return midIndex;
            }
            // 左半段有序
            if (midNum > nums[r]){
                if (midNum >= target && nums[l] <= target){
                    r = midIndex;
                } else {
                    l = midIndex + 1;
                }
            } else {
                // 右半段
                if (midNum <= target && nums[r] >= target){
                    l = midIndex + 1;
                } else {
                    r = midIndex - 1;
                }
            }


        }

        return -1;

    }

}
