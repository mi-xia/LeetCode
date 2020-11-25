package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/unique-binary-search-trees/
 * @date 2020/11/25 19:05
 */
public class NinetySix {

    public int numTrees(int n) {

        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for (int j = 2; j <= n; j++ ){
            for (int i = 1; i <=j; i++){
                dp[j] += dp[i-1] * dp[j-i];
            }
        }
        return dp[n];
    }

}
