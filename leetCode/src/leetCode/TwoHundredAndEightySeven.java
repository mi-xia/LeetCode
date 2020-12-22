package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/find-the-duplicate-number/
 * @date 2020/12/22 15:19
 */
public class TwoHundredAndEightySeven {

    public int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length){
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (fast == slow){
                break;
            }
        }

        int finder = 0;
        while (finder != slow){
            finder = nums[finder];
            slow = nums[slow];
        }
        return slow;
    }
}
