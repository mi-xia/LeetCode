package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/container-with-most-water/submissions/
 * @date 2020/11/23 19:14
 */
public class Eleven {



    public int maxArea(int[] height) {

        if (height.length <= 1){
            return 0;
        }

        int maxArea = 0;

        for (int l = 0; l < height.length; l++){
            for (int r = l + 1; r < height.length; r++){
                maxArea = Math.max(maxArea, (r-l)* Math.min(height[l],height[r]));
            }
        }

        return maxArea;

    }


    public int maxArea2(int[] height) {
        int maxarea = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r ){
            maxarea = Math.max(maxarea,Math.min(height[r],height[l]) * (r-l));
            if (height[r] < height[l]){
                r--;
            }else {
                l++;
            };
        }
        return maxarea;
    }

}
