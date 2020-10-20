package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/set-mismatch/comments/
 * @date 2020/10/20 19:21
 */
public class SixHundredAndFortyFive {


    public int[] findErrorNums(int[] nums) {

        boolean[] numsBoolean = new boolean[nums.length+1];
        int[] ans = new int[2];

        for (int num : nums){
            if (numsBoolean[num]){
                ans[0] = num;
            } else {
                numsBoolean[num] = !numsBoolean[num];
            }
        }

        for (int i = 1; i <= nums.length; i++){
            if (!numsBoolean[i]){
                ans[1] = i;
            }
        }

        return ans;
    }

}
