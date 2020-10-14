package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @date 2020/10/12 19:27
 */
public class ThirtyFour {


    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0 ){
            return new int[]{-1,-1};
        }

        int left = 0;
        int right = nums.length-1;
        boolean flag = false;
        while(left <= right){

            int mid = (left + right)/2;
            if (nums[mid] > target){
                right = mid - 1;
            } else if(nums[mid] < target){
                left = mid + 1;
            } else {
                flag = true;
                left = mid;
                while (left > -1 && nums[left] == target){
                    left --;
                }
                right = mid;
                while (right < nums.length && nums[right] == target){
                    right ++;
                }
                break;
            }
        }

        if (flag){
            return new int[]{left+1,right-1};
        } else {
            return new int[]{-1,-1};
        }

    }

}
