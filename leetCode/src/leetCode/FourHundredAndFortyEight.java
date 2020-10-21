package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 * @date 2020/10/21 19:05
 */
public class FourHundredAndFortyEight {


    public List<Integer> findDisappearedNumbers(int[] nums) {


        List<Integer> result = new ArrayList<>();

        for (int num : nums){

            while (num > 0 && nums[num-1] != -num){
                int tmp = nums[num-1];
                nums[num-1] = -num;
                num = tmp;
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                result.add(i+1);
            }
        }

        return result;
    }


}
