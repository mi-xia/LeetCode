package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description:
 * @date 2020/10/22 19:38
 */
public class FourHundredAndFortyTwo {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new ArrayList<>();



        for (int i = 0; i < nums.length; i++ ){

            if (nums[Math.abs(nums[i])-1] < 0 ){
                result.add(Math.abs(nums[i]));
            } else {
                nums[Math.abs(nums[i])-1] *= -1;
            }

        }


//        for (int num : nums) {
//
//            while (num > 0){
//                if (nums[num-1] == -num){
//                    result.add(num);
//                    num = 0;
//                } else {
//                    int tmp = nums[num-1];
//                    nums[num-1] = -num;
//                    num = tmp;
//                }
//            }
//        }



        return result;
    }
}



