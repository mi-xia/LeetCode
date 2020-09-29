package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/merge-intervals/submissions/
 * @date 2020/9/28 19:43
 */
public class FiftySix {

    public int[][] merge(int[][] intervals) {

            if (intervals == null || intervals.length == 0){
                return intervals;
            }

            List<int[]> intervalsList = Arrays.asList(intervals);
            intervalsList.sort((o1,o2)->o1[0] - o2[0]);

            List<int[]> res = new ArrayList<>();
            int l = intervalsList.get(0)[0];
            int r = intervalsList.get(0)[1];
            for (int i = 1; i < intervalsList.size(); i++){

                int[] tmp = intervalsList.get(i);
                if (r >= tmp[0]){
                    if (l > tmp[0]){
                        l = tmp[0];
                    }
                    if (r < tmp[1]){
                        r = tmp[1];
                    }
                } else {
                    res.add(new int[]{l,r});
                    l = tmp[0];
                    r = tmp[1];
                }

            }
            res.add(new int[]{l,r});

            int[][] result = new int[res.size()][];

            for (int i = 0; i < res.size(); i++){
                result[i] = res.get(i);
            }
            return result;

    }

}
