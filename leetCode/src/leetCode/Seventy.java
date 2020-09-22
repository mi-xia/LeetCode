package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: TODO
 * @date 2020/9/21 22:33
 */
public class Seventy {

    int climbStairs(int n) {

        if (n == 1 || n == 2) return n;
        int [] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2 ; i< n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n-1];

    }

}
