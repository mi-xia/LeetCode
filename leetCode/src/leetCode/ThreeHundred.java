package leetCode;

import java.util.Arrays;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/longest-increasing-subsequence/
 * @date 2020/12/23 0:17
 */
public class ThreeHundred {

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n < 2){
            return n;
        }
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int max = dp[0];
        for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
            }

            max = Math.max(dp[i],max);
        }

        return max;
    }

}
