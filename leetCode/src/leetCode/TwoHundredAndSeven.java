package leetCode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/course-schedule/solution/bao-mu-shi-ti-jie-shou-ba-shou-da-tong-tuo-bu-pai-/
 * @date 2020/12/18 21:46
 */
public class TwoHundredAndSeven {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // 记录入度
        int[] courses = new int[numCourses];
        Map<Integer, List<Integer>> relationMap = new HashMap<>();

        for (int i = 0; i < prerequisites.length; i++){
            int[] relation = prerequisites[i];
            int cur = relation[1];
            int next = relation[0];
            List<Integer> nextList = relationMap.get(cur);

            if (nextList == null || nextList.size() == 0){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(next);
                relationMap.put(cur, tmp);
            } else {
                nextList.add(next);
                relationMap.put(cur,nextList);
            }

            // 增加入度
            courses[next]++;
        }

        Queue<Integer> q = new LinkedList<>();
        // 将所有入度为0的节点
        for (int i = 0; i< courses.length; i++){
            if (courses[i] ==0 ){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){

            int cur = q.poll();

            if (!relationMap.containsKey(cur)){
                continue;
            }

            List<Integer> nextList = relationMap.get(cur);

            for (int s : nextList){
                courses[s]--;
                if (courses[s] == 0){
                    q.offer(s);
                }
            }

        }

        for (int s : courses){
            if (s > 0){
                return false;
            }
        }

        return true;
    }

}
