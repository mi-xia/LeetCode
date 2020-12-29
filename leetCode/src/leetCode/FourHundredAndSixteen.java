package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/partition-equal-subset-sum/
 * @date 2020/12/29 12:32
 */
public class FourHundredAndSixteen {

    public boolean canPartition(int[] nums) {

        int len = nums.length;
        int sum = 0;
        for (int i = 0 ; i < len; i++) {
            sum += nums[i];
        }

        if ((sum & 1 ) ==  1) {
            return false;
        }

        int target = sum/2;

        boolean[][] dp = new boolean[len][target+1];

        if (nums[0] <= target){
            dp[0][nums[0]] = true;
        }

        for (int i = 1; i < len; i++){
            for (int j = 0; j <=target; j++){
                dp[i][j] = dp[i-1][j];
                if (nums[i] <= j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
                }
            }

            if (dp[i][target]){
                return true;
            }

        }

        return dp[len-1][target];

    }
}
