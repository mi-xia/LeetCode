package leetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/maximum-product-of-three-numbers/submissions/
 * @date 2020/10/19 21:49
 */
public class SixHundredAndTwentyEight {

    public int maximumProduct(int[] nums) {

        Integer newScores[] = new Integer [nums.length];

        for(int i=0;i<nums.length;i++){
            newScores[i]= new Integer(nums[i]);
        }
        Arrays.sort(newScores,Collections.reverseOrder());

        return Math.max((newScores[0]*newScores[1]*newScores[2]),(newScores[0]*newScores[newScores.length-1]*newScores[newScores.length-2]));

    }

}
