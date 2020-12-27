package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/counting-bits/
 * @date 2020/12/26 23:58
 */
public class ThreeHundredAndThirtyEight {

    public int[] countBits(int num) {
        if (num == 0){
            return new int[]{0};
        }
        if (num == 1){
            return new int[]{0,1};
        }
        if (num == 2){
            return new int[]{0,1,1};
        }

        int[] dp = new int[num+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        int cur = 2;
        for (int i = 3; i <= num; i++){
            if (i < cur*2){
                dp[i] = 1 + dp[i-cur];
            } else {
                cur=cur*2;
                dp[i] = 1 + dp[i-cur];
            }
        }

        return dp;

    }
}
