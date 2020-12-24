package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/coin-change/
 * @date 2020/12/24 22:41
 */
public class ThreeHundredAndTwentyTwo {

    public int coinChange(int[] coins, int amount) {

        if (coins.length <= 0){
            return -1;
        }

        int[] dp = new int[amount+1];
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++){
            dp[i] = Integer.MAX_VALUE-1;
            for (int j = 0; j < coins.length; j++){
                if ( i-coins[j] >= 0){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }

        return dp[amount] >= Integer.MAX_VALUE-1 ? -1 :  dp[amount];
    }

}
