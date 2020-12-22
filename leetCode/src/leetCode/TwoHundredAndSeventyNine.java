package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/perfect-squares/
 * @date 2020/12/22 12:21
 */
public class TwoHundredAndSeventyNine {

    public int numSquares(int n) {


        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++){
            dp[i] = i;
            for (int j = 1; i >= j * j; j++){
                dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
            }
        }


        return dp[n];
    }
}
