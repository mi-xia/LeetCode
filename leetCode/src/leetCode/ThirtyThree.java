package leetCode;

public class ThirtyThree {


    /**
     * 参考：https://zh.wikipedia.org/wiki/%E6%9C%80%E5%A4%A7%E5%AD%90%E6%95%B0%E5%88%97%E9%97%AE%E9%A2%98
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {

        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        int res = nums[0];
        int current =  nums[0];

        for (int i = 1; i < nums.length; i++){
            current = Math.max(nums[i], current + nums[i]);
            res = Math.max(res,current);
        }

        return res;

    }
}
