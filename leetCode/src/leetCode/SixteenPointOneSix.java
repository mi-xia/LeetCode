package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/sub-sort-lcci/
 * @date 2020/9/27 23:01
 */
public class SixteenPointOneSix {

    public int[] subSort(int[] array) {

        if (array == null || array.length == 0){
            return new int[]{-1,-1};
        }

        int m = -1;
        int n = -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int length = array.length;

        for (int i = 0; i < length; i++){

            if(array[i] < max) {
                n = i;
            } else {
                max = array[i];
            }
        }

        for (int i = length - 1; i >= 0; i--){
            if (array[i] > min) {
                m = i;
            } else {
                min = array[i];
            }
        }

        return new int[]{m,n};

    }
}
