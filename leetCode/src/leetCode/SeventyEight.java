package leetCode;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/subsets/
 * @date 2020/11/18 19:56
 */
public class SeventyEight {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        result.add(new ArrayList<>());

        if (nums.length == 0){
            return result;
        }


        for (int k = 1 ; k <= nums.length; k++ ){
            doSubsets(nums,k,0,new ArrayList<>());
        }

        return result;

    }


    public void doSubsets(int[] nums, int length, int start, List<Integer> tmp){

        if (tmp.size() == length){
            List<Integer> res = new ArrayList<>();
            res.addAll(tmp);
            result.add(res);
            return;
        }

        for (int i = start; i < nums.length; i++){

           tmp.add(nums[i]);
           int tmpSize = tmp.size();
           doSubsets(nums, length, i + 1, tmp);
           tmp.remove(tmpSize-1);

        }

    }


}
