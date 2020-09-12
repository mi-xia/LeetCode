package leetCode;

public class OneHundredAndNinetyEight {

    public int rob(int[] nums) {

        if (nums.length < 1)
            return 0;

        int[] dp = new int[nums.length + 1];

        dp[0] = 0;
        dp[1] = Math.max(dp[0],nums[0]);

        for (int i = 2; i <= nums.length; i++){
            dp[i] = Math.max(dp[i-1],nums[i-1] + dp[i-2]);
        }

        return dp[nums.length];

    }

}
