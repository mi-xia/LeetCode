package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/max-consecutive-ones/
 * @date 2020/10/16 21:08
 */
public class FourHundredAndEightyFive {

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0;
        int count = 0;
        int i = 0;
        for (; i < nums.length; i++){

            if (nums[i] == 1){
                count++;
            } else {
                maxCount = count > maxCount ? count : maxCount;
                count = 0;
            }

        }
        maxCount = count > maxCount ? count : maxCount;
        return maxCount;

    }

}
