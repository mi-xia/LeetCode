package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/product-of-array-except-self/
 * @date 2020/12/20 18:01
 */
public class TwoHundredAndThirtyEight {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int k = 1;
        for(int i = 0; i < res.length; i++){
            res[i] = k;
            k = k * nums[i]; // 此时数组存储的是除去当前元素左边的元素乘积
        }
        k = 1;
        for(int i = res.length - 1; i >= 0; i--){
            res[i] *= k; // k为该数右边的乘积。
            k *= nums[i]; // 此时数组等于左边的 * 该数右边的。
        }
        return res;
    }
//
//    作者：LDouble
//    链接：https://leetcode-cn.com/problems/product-of-array-except-self/solution/cheng-ji-dang-qian-shu-zuo-bian-de-cheng-ji-dang-q/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//
    public int[] productExceptSelf2(int[] nums) {

        if (nums.length == 0){
            return null;
        }
        if (nums.length == 1){
            return new int[]{0};
        }
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        int[] res = new int[nums.length];

        l[0] = 1;
        l[1] = nums[0];
        r[nums.length-1] = 1;
        r[nums.length-2] = nums[nums.length-1];
        for (int i = 1; i < nums.length; i++) {
            l[i] = nums[i-1] * l[i-1];
            r[nums.length-1-i] = nums[nums.length-i] * r[nums.length-i];
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = l[i] * r[i];
        }

        return res;
    }
}
