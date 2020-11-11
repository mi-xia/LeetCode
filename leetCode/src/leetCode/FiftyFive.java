package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/jump-game/comments/
 * @date 2020/11/11 18:42
 */
public class FiftyFive {

    public boolean canJump(int[] nums) {

        if (nums.length <= 1 ){
            return true;
        }

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        int i = 1;
        for (; i < nums.length-1; i++){
            if (dp[i-1] <= 0){
                return false;
            }
            if (i-1 + dp[i-1] > i + nums[i]){
                dp[i] = dp[i -1] -1;
            } else {
                dp[i] = nums[i];
            }
        }

        if (dp[i-1] >= 1){
            return true;
        }
        return false;
    }

    public boolean doCanJump(int[] nums) {

        if (nums.length <= 1 ){
            return true;
        }

        int len = nums.length;

        int maxDis = nums[0];

        for (int i = 1; i < nums.length -1; i ++){
            if (i < maxDis){
                maxDis = Math.max(maxDis,nums[i] + i);
            }
        }

        return maxDis >= len - 1;

    }

}
