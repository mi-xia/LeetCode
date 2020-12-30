package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/target-sum/comments/
 * @date 2020/12/30 23:46
 */
public class FourHundredAndNinetyFour {

    public int findTargetSumWays(int[] nums, int S) {

        int sum = 0;

        for (int num : nums){
            sum += num;
        }

        if ((S+sum)%2 != 0){
            return 0;
        }

        if (sum < S){
            return 0;
        }

        int len = (S+sum)/2;

        int[] dp = new int[len+1];

        dp[0] = 0;

        for (int num : nums){
            for (int i = num; i <= len; i++){
                dp[i] = dp[i] + dp[i-num];
            }
        }

        return dp[len];


    }


}
