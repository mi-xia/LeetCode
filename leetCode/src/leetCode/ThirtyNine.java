package leetCode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/combination-sum/
 * 难点：如何去重结果集？
 * @date 2020/11/5 19:27
 */
public class ThirtyNine {

    private List<List<Integer>> result = new ArrayList<>();


    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        doCombinationSum(candidates,target,new ArrayList<>(),0);

        return result;

    }


    void doCombinationSum(int[] candidates, int target, List<Integer> tmp, int index){

        if (target < 0){
            return;
        }

        if (target == 0){
            List<Integer> res = new ArrayList<>();
            res.addAll(tmp);
            result.add(res);
            return;
        }

        for (int i = index; i < candidates.length; i++){
            tmp.add(candidates[i]);
            doCombinationSum(candidates,target - candidates[i],tmp,i);
            tmp.remove(tmp.size()-1 < 0 ? 0 : tmp.size()-1);
        }

    }

}

