package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/permutations/submissions/
 * @date 2020/11/6 12:02
 */
public class FortySix {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numsList = new ArrayList<>();
        int[] visit = new int[nums.length];

        for (int num : nums) {
            numsList.add(num);
        }

        doPermute(numsList, new ArrayList<>(), visit);
        return result;
    }

    public void doPermute(List<Integer> nums, List<Integer> tmp, int[] visit){

        if(nums.size() == tmp.size()){
            List<Integer> tmpRes = new ArrayList<>();
            tmpRes.addAll(tmp);
            result.add(tmpRes);
            return;
        }

        for (int i= 0; i < nums.size(); i++){

            if (visit[i] == 1){
                continue;
            }
            tmp.add(nums.get(i));
            visit[i] = 1;
            doPermute(nums, tmp, visit);
            visit[i] = 0;
            tmp.remove(tmp.size()-1 < 0 ? 0 : tmp.size()-1);
        }

    }

}
