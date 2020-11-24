package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/move-zeroes/
 * @date 2020/11/24 9:10
 */
public class TwoHundredAndEightyThree {

    public void moveZeroes(int[] nums) {

        int index = 0;

        for(int i = 0 ; i < nums.length; i++){
            if (nums[i] != 0){
                nums[index] = nums[i];
                index ++;
            }
        }

        for (; index < nums.length; index++){
            nums[index] = 0;
        }
    }


}
