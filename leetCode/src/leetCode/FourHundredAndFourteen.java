package leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/third-maximum-number/
 * @date 2020/10/19 20:22
 */
public class FourHundredAndFourteen {

    public int thirdMax(int[] nums) {

        long firt = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;


        for (int num : nums){
            if (num > firt){
                third = second;
                second = firt;
                firt = num;
            } else if(num > second && num < firt){
                third = second;
                second = num;
            } else if (num > third && num < second){
                third = num;
            }
        }

        return third == Long.MIN_VALUE ? new Long(firt).intValue(): new Long(third).intValue();

    }


}
