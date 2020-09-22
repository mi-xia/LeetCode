package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 邹磊
 * @version 1.0
 * @description: TODO
 * @date 2020/9/21 18:51
 */
public class One {

    public int[] twoSum(int[] nums, int target) {
       // 2 7  11 15    9
        Map<Integer,Integer> map =  new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            int tmp = target - nums[i];
            if (map.get(tmp) == null){
                map.put(nums[i],i);
            } else {
                return new int[]{map.get(tmp),i};
            }
        }

        return null;
    }

}
