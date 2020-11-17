package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/sort-colors/comments/
 * @date 2020/11/17 11:34
 */
public class SeventyFive {

    public void sortColors(int[] nums) {

        for (int i = 0; i < nums.length; i++){

            Boolean flag = true;

            for (int j = 0; j < nums.length -1 - i; j++){
                if (nums[j] > nums[j + 1]){
                    int tmp = nums[j + 1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        return;
    }
}
