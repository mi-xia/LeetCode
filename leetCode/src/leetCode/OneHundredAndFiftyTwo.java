package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/maximum-product-subarray/
 * @date 2020/12/16 12:20
 */
public class OneHundredAndFiftyTwo {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int n = nums.length;

        if (n <= 1) {
            return nums[0];
        }

        int res = nums[0];
        int pre_max = nums[0];
        int pre_min = nums[0];

        for (int i = 1; i < n; i++){
            int cur_max = Math.max(Math.max(pre_max * nums[i],pre_min * nums[i]),nums[i]);
            int cur_min = Math.min(Math.min(pre_max * nums[i],pre_min * nums[i]),nums[i]);
            res = Math.max(res, cur_max);
            pre_max = cur_max;
            pre_min = cur_min;
        }

        return res;

    }

//    Map<String,Integer> tmpMap = new HashMap<>();
//
//    public int maxProduct(int[] nums) {
//
//        int n = nums.length;
//
//        if (n <= 1) {
//            return nums[0];
//        }
//
//        int[] dp = new int[n];
//
//        dp[0] = nums[0];
//
//        for (int i = 1; i < n; i++){
//            dp[i] = dp[i-1];
//            for (int j = 0; j<=i; j++){
//                int tempRes = cal(nums,j,i);
//                dp[i] = dp[i] > tempRes ? dp[i] : tempRes;
//            }
//        }
//
//        return dp[n-1];
//    }
//
//    private int cal(int[] nums, int j, int i) {
//        int p = j;
//        int q = i;
//        int res = tmpMap.getOrDefault(""+j+(i-1),Integer.MIN_VALUE);
//        if (res != Integer.MIN_VALUE){
//            return res * nums[i];
//        }
//        res = nums[j++];
//        while (j<=i){
//            res = res * nums[j++];
//        }
//        tmpMap.put(""+p+q,res);
//        return res;
//    }

}
